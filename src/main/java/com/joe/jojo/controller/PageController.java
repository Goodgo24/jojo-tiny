package com.joe.jojo.controller;

import com.joe.jojo.common.api.CommonResult;
import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: Joe
 * @Date: 2020/6/5 0005 下午 3:38
 */
@Api(tags = "PageController", description = "页面管理")
@Controller
public class PageController {
    @GetMapping(value="/toLogin")
    public String loginPage(){
        return "login";
    }
    @GetMapping(value="/toIndex")
    public String IndexPage(){
        return "index";
    }

}
