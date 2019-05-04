package com.spring;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by LSH on 2019/5/3 - 12:44.
 * <p>
 * declaration :1.不用加项目名称
 * 2、了解RestController 和 Controller 区别
 *
 * --@RestController注解相当于@ResponseBody ＋ @Controller合在一起的作用
 *使用@RestController这个注解，就不能返回jsp,html页面，视图解析器无法解析jsp,html页面
 */
@RestController
@RequestMapping("/hello")
public class HelloController {




    @RequestMapping("/login")
    //加上 responseBody就是返回String
    public String login(){
        System.out.println("hello Controller");
        return "123";
        /*
         *为什么return 的是 /WEB-INF/啊啊啊啊.jsp，应该是直接返回内容
         */
    }



}
