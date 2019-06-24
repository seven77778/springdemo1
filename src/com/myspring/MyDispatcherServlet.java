package com.myspring;

import org.springframework.web.context.ContextLoaderListener;

/**
 * Created by lsh on 2019-05-05.
 *
 *
 * @see org.springframework.web.servlet.DispatcherServlet
 *
 * HandlerMapping 路由
 * HandlerAdapter 适配器
 * HandlerExceptionResolver 异常解析策略
 * InternalResourceViewResolver 内部资源视图解析器
 *
 * RequestToViewNameTranslator 请求视图转换器
 *
 * MultipartResolver 大多数请求策略
 * LocaleResolver 地区解析器
 *
 * ThemeResolver 主题解析器
 *
 * ContextLoaderListener
 *
 * WebApplicationContext
 *
 * 看方法：
 * 1. initStrategies 会初始化上面的各种bean 9个
 *
 *      initMultipartResolver(context);
 * 		initLocaleResolver(context);
 * 		initThemeResolver(context);
 * 		initHandlerMappings(context);
 * 		initHandlerAdapters(context);
 * 		initHandlerExceptionResolvers(context);
 * 		initRequestToViewNameTranslator(context);
 * 		initViewResolvers(context);
 * 		initFlashMapManager(context);
 *
 * 10 WEB_APPLICATION_CONTEXT_ATTRIBUTE 属性来保存web上下文  doService中 return is WebApplicationContext
 *
 *
 */

    /*
    ThemeResolver 主题解析器
    主题就是系统的整体样式或风格，可通过Spring MVC框架提供的主题（theme）设置应用的整体样式风格，提高用户体验。
    Spring MVC的主题就是一些静态资源的集合，即包括样式及图片，用来控制应用的视觉风格。
     */

    /*
    ContextLoaderListener 应该会去读取 applicationContext.xml todo
     */

public class MyDispatcherServlet {

    public String name = "Is MyDispatcherServlet";

    public static void main(String[] args) {

        ContextLoaderListener contextLoaderListener = new ContextLoaderListener();

    }

}
