package com.uaf;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import javax.annotation.PostConstruct;
import java.util.Map;

/**
 * Created by lsh on 2019-05-17.
 *
 * �ⲿ�ӿ� ��ǿ��װ
 *
 *
 * @Aspect:�����ǰѵ�ǰ���ʶΪһ�����湩������ȡ
 *
 */

@Aspect
public class OutterAspect implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    /**
     * 1.ֱ������spring��@PostConstruct ��δ���� todo
     * 2.ClassPathXmlApplicationContext ���أ�Ҳδ����
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
}
