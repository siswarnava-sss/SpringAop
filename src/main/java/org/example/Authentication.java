package org.example;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component

public class Authentication {

    @Pointcut("within(org.example.*)")
    public void authenticationPointCut(){

    }
    @Pointcut("within(org.example.*)")
    public void authorizationPointCut(){

    }
    @Before("authenticationPointCut() && authorizationPointCut()")
    public void authenticate(){
        System.out.println("Authenticatoin the Request");
    }

}
