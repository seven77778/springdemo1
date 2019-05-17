package com.springlearn.start;

import com.myspring.MyDispatcherServlet;
import com.uaf.OutterAspect;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lsh on 2019-05-10.
 *
 * springlearn 各种启动方式
 *
 * applicationContext.xml 放 resources 才好使
 *
 * 1.ApplicationContext 继承了 ListableBeanFactory，这个 Listable 的意思就是，
 * 通过这个接口，我们可以获取多个 Bean，最顶层 BeanFactory 接口的方法都是获取单个 Bean 的。
 *
 * 2.ApplicationContext 继承了 HierarchicalBeanFactory，Hierarchical 单词本身已经能说明问题了，
 * 也就是说我们可以在应用中起多个 BeanFactory，然后可以将各个 BeanFactory 设置为父子关系
 *
 * 3.AutowireCapableBeanFactory 这个名字中的 Autowire 大家都非常熟悉，它就是用来自动装配 Bean 用的，
 * 但是仔细看上图，ApplicationContext 并没有继承它，不过不用担心，不使用继承，不代表不可以使用组合，
 * 如果你看到 ApplicationContext 接口定义中的最后一个方法 getAutowireCapableBeanFactory() 就知道了
 *
 * 4.ConfigurableListableBeanFactory 也是一个特殊的接口，
 * 看图，特殊之处在于它继承了第二层所有的三个接口，而 ApplicationContext 没有。这点之后会用到
 *
 * then BeanFactory、ListableBeanFactory、HierarchicalBeanFactory、AutowireCapableBeanFactory、ApplicationContext 这几个接口的代码
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
