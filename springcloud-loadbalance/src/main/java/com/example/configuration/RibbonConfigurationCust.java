package com.example.configuration;

import com.example.rule.MyRule;
import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.IRule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

/**
 * Created by Administrator on 2017/3/19.
 */
public class RibbonConfigurationCust {
    @Autowired
    private IClientConfig ribbonClientConfig;


    @Bean
    public IRule ribbonRule(IClientConfig config) {

        return new MyRule();
    }
}
