package com.springlearn.test ;

import com.myspring.MyDispatcherServlet;
import org.springframework.context.ApplicationContext;
import org.springframework.web.servlet.FrameworkServlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by lsh on 2019-05-08.
 */
public class GetBeanTest  extends FrameworkServlet {


    @Override
    protected void doService(HttpServletRequest request, HttpServletResponse response) throws Exception {


    }

    @Override
    protected void onRefresh(ApplicationContext context) {
        System.out.println("onRefresh");
        MyDispatcherServlet myDispatcherServlet = context.getBean("myDispatcherServlet",MyDispatcherServlet.class);
        System.out.println(myDispatcherServlet.name);
    }

    public static void main(String[] args) {

    }
}
