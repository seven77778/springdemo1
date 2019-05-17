package com.myspring;

import org.springframework.web.context.ContextLoaderListener;

/**
 * Created by lsh on 2019-05-05.
 *
 *
 * @see org.springframework.web.servlet.DispatcherServlet
 *
 * HandlerMapping ·��
 * HandlerAdapter ������
 * HandlerExceptionResolver �쳣��������
 * InternalResourceViewResolver �ڲ���Դ��ͼ������
 *
 * RequestToViewNameTranslator ������ͼת����
 *
 * MultipartResolver ������������
 * LocaleResolver ����������
 *
 * ThemeResolver ���������
 *
 * ContextLoaderListener
 *
 * WebApplicationContext
 *
 * ��������
 * 1. initStrategies ���ʼ������ĸ���bean 9��
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
 * 10 WEB_APPLICATION_CONTEXT_ATTRIBUTE ����������web������  doService�� return is WebApplicationContext
 *
 *
 */

    /*
    ThemeResolver ���������
    �������ϵͳ��������ʽ���񣬿�ͨ��Spring MVC����ṩ�����⣨theme������Ӧ�õ�������ʽ�������û����顣
    Spring MVC���������һЩ��̬��Դ�ļ��ϣ���������ʽ��ͼƬ����������Ӧ�õ��Ӿ����
     */

    /*
    ContextLoaderListener Ӧ�û�ȥ��ȡ applicationContext.xml todo
     */

public class MyDispatcherServlet {

    public String name = "Is MyDispatcherServlet";

    public static void main(String[] args) {

        ContextLoaderListener contextLoaderListener = new ContextLoaderListener();

    }

}
