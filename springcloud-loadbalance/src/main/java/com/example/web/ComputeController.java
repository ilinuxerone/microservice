package com.example.web;

import com.example.configuration.RibbonConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Administrator on 2017/3/19.
 */

@RestController
@RibbonClient(name = "compute-service2", configuration = RibbonConfiguration.class)//name是provider的服务
public class ComputeController
{
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/add2", method = RequestMethod.GET)
    public String addCust() {
/*        ServiceInstance serviceInstance = this.loadBalancerClient.choose("COMPUTE-SERVICE");
        System.out.println("===" + ":" + serviceInstance.getServiceId() + ":" + serviceInstance.getHost() + ":"
                + serviceInstance.getPort());// 打印当前调用服务的信息*/
        return restTemplate.getForEntity("http://COMPUTE-SERVICE/add?a=10&b=20", String.class).getBody();
    }
}
