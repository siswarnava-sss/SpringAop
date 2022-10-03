package org.example;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class LoggingAspect {
    @Before("execution(* org.example.ShoppingCart.checkout())")
    public void logger(JoinPoint jp){
        System.out.println(jp.getSignature());

        System.out.println("This is beforelogger function");
    }
    @After("execution(* org.example.ShoppingCart.checkout())")
            public void afterlogger(){
            System.out.println("This is Afterlogger function");
            }
}
