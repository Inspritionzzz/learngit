package com.xiaoyu.toutiao.aspect;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.After;
import org.slf4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Component;
import java.util.Date;

//import java.util.logging.Logger;
import org.slf4j.LoggerFactory;
@Aspect
@Component
public class LogAspect {
    private static final Logger logger = LoggerFactory.getLogger(LogAspect.class);
    @Before("execution(* com.xiaoyu.toutiao.controller.IndexController.*(..))")
    public void beforeMethod(JoinPoint joinPoint) {
        StringBuilder sb = new StringBuilder();
        for (Object arg : joinPoint.getArgs()) {
            sb.append("arg:" + arg.toString() + "|");
        }
        logger.info("before method: " + sb.toString());
    }
    @After("execution(* com.xiaoyu.toutiao.controller.IndexController.*(..))")
    public void afterMethod(JoinPoint joinPoint) {
        //logger.info("after method: ");
        StringBuilder sb = new StringBuilder();
        for (Object arg : joinPoint.getArgs()) {
            sb.append("arg:" + arg.toString() + "|");
        }
        logger.info("after method: " + sb.toString());
    }
}
