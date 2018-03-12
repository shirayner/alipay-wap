package com.ray.alipaywap.config;

/**
 * @author : shirayner
 * @date : 2018/3/9
 * @time : 9:36
 * @desc : 支付宝的相关配置
 **/
public class AlipayConfig {
    //支付宝网关名-正式环境
    //public static final String OPEN_API_DOMAIN="https://openapi.alipay.com/gateway.do";
    //支付宝网关名-沙箱环境
    public static final String OPEN_API_DOMAIN="https://openapi.alipaydev.com/gateway.do";

    /**  一、应用相关
     *
     */

    /**
     * 1.应用ID
     */
    public static final String APP_ID="2016091100487746";

    /**
     * 2.应用私钥
     */
    public static final String APP_PRIVATE_KEY="MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCMfvNFyaKVfvrxKV2lfjjMBFGxC55+taD0sID8F8CZLMju9T21LhLw4mDqmMMaHpSFCA/v85qcYE8l0ZPiJFUpSGJd/OLGexTJg88vwzBqX+xDFmaALxahbAxBuRyCqEVV+Uq3XlGaEcvjGU+KV5NzJSL7J7QxUTooJbduM1Ko6fNPlMSWqmEnyKqW592u3LJpQ2qui7fGO5al8Zr0r0mtVzJDx8tyAAx2HlCYAaT58btTwV6MtQ8fC1sv6LCagfKwkS9Oruwj9Y8ooHqZEvf4QtDXwBWKuBHHXs+OpkP1uuFPANU6N9L8lAL6xL0mo9H4XYRVE84OJKecScgSFKM1AgMBAAECggEAbI050VX1dKRjpyla3Z8kqx07MRvVHfmfnu8w+ZYwjSj5Jwf84ZvzroJ6d0gIlonCHvcXuUHy15fiD0pahIOl+PugZRYa8Vfvu7NHxZN+OPJcTYllMO0xAw/EeJNZ3+m7iK3QeNU7H1tYuOK5fh4kIvcyi/MlWmV0FcjubQridvcCfB/oJWkPQB27USaZLAc8JZKd8aWlEPKsNcuExouCrDet2xBYdTDzwKOSzJsl+QQgJiZGeID42YwnbyVLMdojyk/lJWihL0jp9MmC05s1eL+cvBVmH/Yv5XUSIVk9GtjQifO8WbJ7gcNk/QwR8y33eHtNY0w+ywI5L2w7vmw+EQKBgQDgXxiglrbO+t8OnmBL6XhCdtztgeM2jX8i/x/kSCVThi93zJgW+A6GW+r+l8j762qxODXVJE0/nDfaXCVLTCQQ3udneIQ/GEL4q6v/iV58IGA+MMy3psDCVJnW+A9Hy9cjQn9Xs1Zgj5OrYxLEpHcRP4FYfgORQVSa+RU8e4nFvwKBgQCgTQhNob9pw7BCpwrYCCp1LjSPt6bAfE09rLnBvuEn7Cx4Ykj8YXd+sVlNL9s32U+QAuGaCYC9CPBBSnJuohUNNvsZXkHHCEohh//T38RK4lre35BIxWM9bn9dynwOXRqrpwGhX+WlsHMnMn7AZOSGH9cv3xqUu38yoLXvSwfcCwKBgQC2kqsngXwf0GPRMW6KVuBUtQPw/9Azg9AAWjlJOKum23mksgbQKekny4PcxwX0eAvJSUQEvBVfvW51cKWoL7zpPXhu6dIyxTs5vfenZ9BKkM2/zVXH2xjfCJhmJFPKyEO3nVShuHyA9lPjEisjd/CrSFGoAGJGwDJoKGbvYFcrYQKBgDur8UdUyrhITDjDjdnVUFjGlnJZXw2QOACZZ5yjvZTq6bL2g0zPy3ex9RgylFw53NAzAmAg4Xd8+FKVr/tXApckvFw5Jis8/rt0sNriFWP61vDYMBGmyMZ5d5gmY//E0MTNKmI0HHyNLpCMz3o3FIqJF8WOO4raMQNbp94oBAj5AoGAW13MwUuoRRnN6DXuYjd6+9lzxRifszLbUm+oRXS65Ql4ZxrflE2CRwC89pWlbWUmJjpCee4XMGpGjfXhyAbH2ZHUYJq0wvRKKrUwingu/zdQ2OFHgf6LMACC9ORDz+5ZiGrgznsmzosuys1WchIdqnC66Dnq+EUIciS2pDytovw=";

    /**
     * 3.应用公钥
     */
    public static final String APP_PUBLIC_KEY="MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAjH7zRcmilX768SldpX44zARRsQuefrWg9LCA/BfAmSzI7vU9tS4S8OJg6pjDGh6UhQgP7/OanGBPJdGT4iRVKUhiXfzixnsUyYPPL8Mwal/sQxZmgC8WoWwMQbkcgqhFVflKt15RmhHL4xlPileTcyUi+ye0MVE6KCW3bjNSqOnzT5TElqphJ8iqlufdrtyyaUNqrou3xjuWpfGa9K9JrVcyQ8fLcgAMdh5QmAGk+fG7U8FejLUPHwtbL+iwmoHysJEvTq7sI/WPKKB6mRL3+ELQ18AVirgRx17PjqZD9brhTwDVOjfS/JQC+sS9JqPR+F2EVRPODiSnnEnIEhSjNQIDAQAB";

    /**
     * 4.支付宝公钥
     */
    public static final String ALIPAY_PUBLIC_KEY="MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAywcs1eulwKJcYqw8qFCk2TEcv2Lq/hIM12p2mwHoBfBwOKNX2b6ufizphGeNi2u1azhzuHwR4qoagDT/p6yHlQW6e50pWeFRgysLwJHxkC+jNeIFgvZrls9xFBi5sXUDSIYHraOuvK6v4d4ZUTB4+INusD/GYifN6g7BJ/NwyMk3YfTR7GV3GqN5p/mJIbwZDUObendFR2NPbBa2kqYdfwX+/f8z29ILLKnklFboFzM1yMZWYjPjC4963i8cAC3n9e4mikSlKbcqRQmCV31mwRnQ9nCuy7/hIH5XYr1ewBCFsqW0QgVoxbCOONYC0pioQJCOKXJh7BdEP3yy/P9kGQIDAQAB";

    /**
     * 5.app_auth_token在ISV代替商家调用接口时使用，商家自己调用，可传null。
     */
    public static final String APP_AUTH_TOKEN="";

    public static final String SIGN_TYPE = "RSA2";

    public static final String CHAR_SET = "UTF-8";

    public static final String FORMAT = "json";

    /**
     * 二、商家相关
     */

    /**
     * 1.app域名
     */
    public static final String APP_DOMAIN = "http://rayge.nat300.top";


    /**
     * 2.回跳url
     */
    public static final String RETURN_URL = APP_DOMAIN + "/return_url.jsp";

    /**
     * 3.通知url
     */
    public static final String NOTIFY_URL = APP_DOMAIN + "/notify_url.jsp";



}
