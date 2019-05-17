package com.springlearn;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by LSH on 2019/5/3 - 12:44.
 * <p>
 * declaration :1.不用加项目名称
 * 2、了解RestController 和 Controller 区别
 *
 * --@RestController注解相当于@ResponseBody ＋ @Controller合在一起的作用
 * 使用@RestController这个注解，就不能返回jsp,html页面，视图解析器无法解析jsp,html页面


 /*
    总结一下 ：new ClassPathXmlApplicationContext +file +绝对路径，application.xml中要配置bean就可以拿到。




 */
@RestController
@RequestMapping("/hello")
public class HelloController {




    @RequestMapping("/login")
    //加上 responseBody就是返回String
    public String login(){
        System.out.println("hello Controller");
        //这也就是说用ClassPathXmlApplicationContext时默认的根目录是在WEB-INF/classes下面，而不是项目根目录。这个需要注意
//        ApplicationContext context  =new ClassPathXmlApplicationContext("file:D:\\MySpringBoot\\springdemo1\\web\\WEB-INF\\applicationContext.xml");

//        MyDispatcherServlet myDispatcherServlet = context.getBean("myDispatcherServlet",MyDispatcherServlet.class);
//        System.out.println(myDispatcherServlet.name);
        return "123";
        /*
         *为什么return 的是 /WEB-INF/啊啊啊啊.jsp，应该是直接返回内容
         * @ResponseBody 的 作用
         *
         */




    }



}
