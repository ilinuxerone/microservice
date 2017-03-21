package com.example.configuration;

import com.example.annotion.ExcludeFromComponentScan;
import com.example.filter.MyListFilter;
import com.example.rule.MyRule;
import com.netflix.client.config.DefaultClientConfigImpl;
import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Administrator on 2017/3/19.
 */
@Configuration
@ExcludeFromComponentScan
public class CustomersRibbonConfiguration  {
    private String name = "compute-service2";

    @Bean
    public IClientConfig ribbonPing(){
        IClientConfig config = new DefaultClientConfigImpl();
        config.loadProperties(this.name);
        return config;
    }

    @Bean
    public IRule ribbonRule(IClientConfig config) {
        return new MyRule();
    }

    @Bean
    public ServerListFilter<Server> ribbonServerListFilter(IClientConfig config) {
        System.out.println("My ribbonServerListFilter will be used");
        MyListFilter filter = new MyListFilter();
        filter.initWithNiwsConfig(config);
        return filter;
    }

    @Bean
    public ILoadBalancer ribbonLoadBalancer(IClientConfig config,
                                            ServerListFilter<Server> filter) {
        ZoneAwareLoadBalancer<Server> balancer = new ZoneAwareLoadBalancer<>(config);
        balancer.setFilter(filter);
        return balancer;
    }
}
