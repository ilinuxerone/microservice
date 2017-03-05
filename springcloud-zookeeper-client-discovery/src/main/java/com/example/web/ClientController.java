package com.example.web;

import com.example.proxy.FeignConsumerClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Administrator on 2017/3/3.
 */
@RestController
public class ClientController {
    @Autowired
    private FeignConsumerClient feignConsumerClient;

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public String add(@RequestParam(value = "id") Long id) {
        return feignConsumerClient.getUser(id);
    }
}
