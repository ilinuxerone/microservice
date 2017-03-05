package com.example.web;

import com.example.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * Created by Administrator on 2017/3/3.
 */
@RestController
public class ComputeController {
    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value="/show", method= RequestMethod.POST)
    @ResponseBody
    public User show(@RequestParam("id") Long id){
        ServiceInstance instance = client.getLocalServiceInstance();
        User user = new User();
        user.setId(id);
        user.setName("scott");
        user.setBirthday(new Date());
        return user;
    }
}
