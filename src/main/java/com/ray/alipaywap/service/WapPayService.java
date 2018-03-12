package com.ray.alipaywap.service;

import com.alipay.api.response.AlipayTradeWapPayResponse;

/**
 * @author : shirayner
 * @date : 2018/3/12
 * @time : 10:48
 * @desc :
 **/
public interface WapPayService {
    public  AlipayTradeWapPayResponse pay(String content) throws Exception;

}
