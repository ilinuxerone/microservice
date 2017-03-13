package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/3/13.
 */
@RefreshScope
@RestController
public class ConfigServer {
        @Value("${from}")
        private String from;
        @RequestMapping("/from")
        public String from() {
            return this.from;
        }
}
