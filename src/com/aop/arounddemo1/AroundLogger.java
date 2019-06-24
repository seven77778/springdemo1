package com.aop.arounddemo1;

import org.aspectj.lang.ProceedingJoinPoint;

import java.util.Arrays;
import java.util.logging.Logger;

/**
 * Created by lsh on 2019-05-30.
 * @author lsh
 */
public class AroundLogger {

    private static Logger log = Logger.getLogger("Around");

    public Object aroundLogger(ProceedingJoinPoint jp) throws Throwable {
        log.info("调用" + jp.getTarget() + "的" + jp.getSignature() + "方法,方法参数: " + Arrays.toString(jp.getArgs()));
        try {
            Object result = jp.proceed();
            log.info("调用 " + jp.getTarget() + " 的 " + jp.getSignature().getName() + " 方法。方法返回值：" + result);
            return result;
        } catch (Throwable throwable) {
            System.out.println((jp.getSignature().getName() + "方法发生异常" + throwable));
            throw throwable;
        } finally {
            log.info(jp.getSignature().getName() + "方法执行结束");
        }
    }

}
