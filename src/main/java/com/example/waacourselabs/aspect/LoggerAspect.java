package com.example.waacourselabs.aspect;

import com.example.waacourselabs.domain.Logger;
import com.example.waacourselabs.repo.LoggerRepo;
import com.example.waacourselabs.service.UserService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.Time;
import java.util.Date;

@Aspect
@Component
public class LoggerAspect {
    @Autowired
    private LoggerRepo loggerService;
    private UserService userService;

    @Pointcut("execution(* com.example.waacourselabs..*(..))")
    public void allServiceMethods() {}

    @Before("allServiceMethods()")
    public void log(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        String args = joinPoint.getArgs().toString();
        String operation = methodName + " " + args;
        String principle = joinPoint.getThis().getClass().getName();
        Logger logger = new Logger(
                userService.getAllUsers().get(1),
                new Date(System.currentTimeMillis()),
                new Time(System.currentTimeMillis()),
                principle,
                operation
        );
        loggerService.save(logger);
    }
}
