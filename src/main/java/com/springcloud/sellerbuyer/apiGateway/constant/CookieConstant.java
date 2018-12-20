package com.springcloud.sellerbuyer.apiGateway.constant;

/**
 * @program: user
 * @description: Cookie常量
 * @author: JunOba
 * @create: 2018-12-19 22:33
 */
public interface CookieConstant {

    String TOKEN = "token";

    String OPENID = "openid";

    /**
     * 过期时间(单位:s)
     */
    Integer expire = 7200;
}
