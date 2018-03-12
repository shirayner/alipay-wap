package com.ray.alipaywap.service.impl;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradeWapPayRequest;
import com.alipay.api.response.AlipayTradeWapPayResponse;
import com.ray.alipaywap.config.AlipayConfig;
import com.ray.alipaywap.service.WapPayService;

/**
 * @author : shirayner
 * @date : 2018/3/12
 * @time : 11:02
 * @desc :
 **/
public class WapPayServiceImpl  implements WapPayService{

    // 初始化alipayClient对象
    public static AlipayClient alipayClient = new DefaultAlipayClient(
            AlipayConfig.OPEN_API_DOMAIN, AlipayConfig.APP_ID, AlipayConfig.APP_PRIVATE_KEY, AlipayConfig.FORMAT,
            AlipayConfig.CHAR_SET, AlipayConfig.ALIPAY_PUBLIC_KEY);

    @Override
    public AlipayTradeWapPayResponse pay(String content) throws AlipayApiException {
        //1. 创建API对应的request
        AlipayTradeWapPayRequest alipayRequest = new AlipayTradeWapPayRequest();

        //2. 在公共参数中设置回跳和通知地址(应用提供给支付宝的请求路径),沙箱模式中不起作用(不知道是不是这个原因,支付宝技术客服告诉我正式上线后就没问题)
        alipayRequest.setReturnUrl(AlipayConfig.APP_DOMAIN+"/index.jsp");
        alipayRequest.setNotifyUrl(AlipayConfig.NOTIFY_URL);
        // 填充业务参数
        alipayRequest.setBizContent(content);

        //3.执行请求
        AlipayTradeWapPayResponse alipayResponse = alipayClient
                .pageExecute(alipayRequest);
        return alipayResponse;
    }
}
