package com.evada.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author dingqin
 * @date 2017/9/1
 *spring2.5的注解
 * 需要通过处理器映射DefaultAnnotationHandlerMapping
 * 处理器适配器AnnotationMethodHandlerAdapter
 * 来开启支持@Controller 和 @RequestMapping注解的处理器。
 * 类用@Controller或@RequestMapping来申明该类是个处理器
 *
 * spring3.1后的注解
 * * 需要通过处理器映射RequestMappingHandlerMapping
 * 处理器适配器RequestMappingHandlerAdapter
 * 来开启支持@Controller 和 @RequestMapping注解的处理器。
 * 类用@Controller或@RequestMapping来申明该类是个处理器
 */
@Controller
@RequestMapping("/")
public class AnnotationHelloWorldController {

    @RequestMapping("annotationHello")
    public ModelAndView moveMain(Model model){
        ModelAndView modelAndView  = new ModelAndView("main");
        modelAndView.addObject("message1","添加的参数");
        model.addAttribute("message2","这个是传递的参数");
        return modelAndView;
    }


    /**
     * 或者这种写法@RequestParam String name
     * @param name
     * @param model
     * @return
     */
    @RequestMapping("annotation")
    public String moveMain(@RequestParam(value = "name",required = false,defaultValue = "ding") String name, Model model){
        model.addAttribute("message2","这个是传递的参数");
        model.addAttribute("name","传递的名称是:"+name);
        return "main";
    }

}
