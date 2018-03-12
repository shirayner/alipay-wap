package com.ray.alipaywap.controller;

import com.alipay.api.response.AlipayTradeWapPayResponse;
import com.ray.alipaywap.config.AlipayConfig;
import com.ray.alipaywap.service.WapPayService;
import com.ray.alipaywap.service.impl.WapPayServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class WapPayServlet extends javax.servlet.http.HttpServlet {
    private WapPayService wapPayService;

    @Override
    public void init() throws ServletException {
        super.init();
         wapPayService = new WapPayServiceImpl();

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {

        //1.设置将发送到客户端的响应的内容类型
        resp.setContentType("text/html;charset="+ AlipayConfig.CHAR_SET);

        //1.1
        String subject = request.getParameter("subject");
        String total_amount = request.getParameter("total_amount");

       String  out_trade_no = String.valueOf(System.currentTimeMillis());
        //1.2


        //2.填充业务参数
        String content="{" +
                " \"out_trade_no\":\""+out_trade_no+"\"," +
                " \"total_amount\":\""+total_amount+"\"," +
                " \"subject\":\""+subject+"\"," +
                " \"product_code\":\"QUICK_WAP_PAY\"" +
                " }";

        //3.去支付
        AlipayTradeWapPayResponse alipayResponse= null;
        try {
            alipayResponse = wapPayService.pay(content);

        } catch (Exception e) {
            e.printStackTrace();
        }
        String form= alipayResponse.getBody();
        System.out.println(form);

        //4.输出支付宝返回的表单页面
        resp.setContentType("text/html;charset=" + AlipayConfig.CHAR_SET);
        resp.getWriter().write(form);//直接将完整的表单html输出到页面
        resp.getWriter().flush();
        resp.getWriter().close();

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }



}
