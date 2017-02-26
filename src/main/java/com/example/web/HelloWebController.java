package com.example.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.xml.ws.RequestWrapper;

/**
 * Created by Administrator on 2017/2/23.
 */
@Controller()
public class HelloWebController {
    @RequestMapping("/index")
    public String index(ModelMap model)
    {
        //添加一个属性，用来在模板中读取
        model.addAttribute("host", "http:/www.baidu.com");
        // return模板文件的名称，对应src/main/resources/templates/index.html
        return "index";
    }
}
