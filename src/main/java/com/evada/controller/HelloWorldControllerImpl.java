package com.evada.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 使用非注解而是实现接口的方式  这边对应的spring配置是默认的路径下 WEB-INF下springmvc-servlet.xml
 * @author dingqin
 * @date 2017/9/1
 */
public class HelloWorldControllerImpl implements Controller {


    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView mv = new ModelAndView();
//        mv.addObject("message", "HelloWorld");
        mv.setViewName("main");
        mv.getModel().put("message", "message");
        return mv;
    }
}
