package com.example.proxy;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Administrator on 2017/3/3.
 */
@Component
public class FeignConsumerClientHystrix implements  FeignConsumerClient{
    @Override
    public String getUser(@RequestParam("id") Long id) {
        return "error";
    }
}
