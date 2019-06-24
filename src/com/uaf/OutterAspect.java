package com.uaf;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import javax.annotation.PostConstruct;
import java.util.Map;

/**
 * Created by lsh on 2019-05-17.
 *
 * 外部接口 增强组装
 *
 * @Aspect:作用是把当前类标识为一个切面供容器读取
 *
 */

@Aspect
public class OutterAspect implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    /**
     * 1.直接启动spring，@PostConstruct 并未启动 todo
     * 2.ClassPathXmlApplicationContext 加载，也未启动
     *
     */
    @PostConstruct
    public void init(){
        Map beansOfType = applicationContext.getBeansOfType(OutterInface.class);
        System.out.println("OutterAspect " + beansOfType);

    }



    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("setApplicationContext");
        this.applicationContext = applicationContext;
    }


    @Around("@annotation(OutterInface)")
    public Object doAspect(final ProceedingJoinPoint pjp, OutterInface outterInface) throws Throwable{
        System.out.println("doAspect");


        return null;
    }



}
