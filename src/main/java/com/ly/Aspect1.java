package com.ly;

import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;

@Aspect
@Order(1)
public class Aspect1 {
    @Pointcut("execution(* com.ly.MultiBeanImpl.testMulti(..))")
    public void print(){}

    @Before("print()")
    public void before(){
        System.out.println("before 1 ......");
    }

    @After("print()")
    public void after(){
        System.out.println("after 1 ......");
    }

    @AfterThrowing("print()")
    public void afterThrowing(){
        System.out.println("afterThrowing 1 ......");
    }

    @AfterReturning("print()")
    public void afterReturning(){
        System.out.println("afterReturning 1 ......");
    }
}
