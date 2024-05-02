package org.wei.design.spring;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class Log {
    @Before("execution(public int org.wei.design.spring.CalcImpl.*(..))")
    public void before(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
//        log.info(methodName + "方法执行" + "方法参数：" + Arrays.toString(args));
        System.out.println("Before" + methodName + "method" + " args：" + Arrays.toString(args));
    }
    @After("execution(public int org.wei.design.spring.CalcImpl.*(..))")
    public void after(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        System.out.println("After method executed" + name);
    }
    @AfterReturning(value = "execution(public int org.wei.design.spring.CalcImpl.*(..))",returning = "result")
    public void afterReturning(JoinPoint joinPoint,Object result) {
        String methodName = joinPoint.getSignature().getName();
//        log.info(methodName + "方法执行" + "返回值结果：" + result);
        System.out.println("AfterReturning" + methodName + "before method" + "result：" + result);
    }
}
