package com.example.proxy;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Administrator on 2017/3/3.
 */
@Component
@FeignClient(value="server", fallback = FeignConsumerClientHystrix.class)
public interface FeignConsumerClient {
    @RequestMapping(method = RequestMethod.POST, value = "/show")
    public String getUser(@RequestParam(value = "id") Long id);
}
