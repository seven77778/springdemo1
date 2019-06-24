package com.springlearn.start;

import com.myspring.MyDispatcherServlet;
import com.uaf.OutterAspect;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lsh on 2019-05-10.
 *
 * springlearn ����������ʽ
 *
 * applicationContext.xml �� resources �ź�ʹ
 *
 * 1.ApplicationContext �̳��� ListableBeanFactory����� Listable ����˼���ǣ�
 * ͨ������ӿڣ����ǿ��Ի�ȡ��� Bean����� BeanFactory �ӿڵķ������ǻ�ȡ���� Bean �ġ�
 *
 * 2.ApplicationContext �̳��� HierarchicalBeanFactory��Hierarchical ���ʱ����Ѿ���˵�������ˣ�
 * Ҳ����˵���ǿ�����Ӧ�������� BeanFactory��Ȼ����Խ����� BeanFactory ����Ϊ���ӹ�ϵ
 *
 * 3.AutowireCapableBeanFactory ��������е� Autowire ��Ҷ��ǳ���Ϥ�������������Զ�װ�� Bean �õģ�
 * ������ϸ����ͼ��ApplicationContext ��û�м̳������������õ��ģ���ʹ�ü̳У�����������ʹ����ϣ�
 * ����㿴�� ApplicationContext �ӿڶ����е����һ������ getAutowireCapableBeanFactory() ��֪����
 *
 * 4.ConfigurableListableBeanFactory Ҳ��һ������Ľӿڣ�
 * ��ͼ������֮���������̳��˵ڶ������е������ӿڣ��� ApplicationContext û�С����֮����õ�
 *
 * then BeanFactory��ListableBeanFactory��HierarchicalBeanFactory��AutowireCapableBeanFactory��ApplicationContext �⼸���ӿڵĴ���
 *
 * see  https://blog.csdn.net/nuomizhende45/article/details/81158383
 *
 *
 *
 */

public class EveryStart {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        MyDispatcherServlet myDispatcherServlet = context.getBean("myDispatcherServlet", MyDispatcherServlet.class);
        OutterAspect outterAspect = context.getBean("outterAspect",OutterAspect.class);
        System.out.println(myDispatcherServlet.name);
    }

}
