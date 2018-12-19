package com.springcloud.sellerbuyer.apiGateway.filter;

import com.google.common.util.concurrent.RateLimiter;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;
import com.springcloud.sellerbuyer.apiGateway.exception.RateLimitException;
import org.springframework.stereotype.Component;

import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.*;

/**
 * @program: api-gateway
 * @description: 限流过滤器
 * @author: JunOba
 * @create: 2018-12-19 21:29
 */
@Component
public class RateLimiFilter extends ZuulFilter {

    // 每秒放100个令牌
    private static final RateLimiter RATE_LIMITER = RateLimiter.create(100);

    @Override
    public String filterType() {
        return PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        return SERVLET_DETECTION_FILTER_ORDER - 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        if (!RATE_LIMITER.tryAcquire()) {   // 如果没有拿到令牌
            throw new RateLimitException();
        }
        return null;
    }
}
