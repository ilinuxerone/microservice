package com.example.filter;

import com.netflix.loadbalancer.Server;
import org.springframework.cloud.netflix.ribbon.ZonePreferenceServerListFilter;

import java.util.List;

/**
 * Created by Administrator on 2017/3/20.
 */
public class MyListFilter extends ZonePreferenceServerListFilter {
    @Override
    public List<Server> getFilteredListOfServers(List<Server> servers) {
        System.out.println("This is my version");
        return super.getFilteredListOfServers(servers);
    }
}
