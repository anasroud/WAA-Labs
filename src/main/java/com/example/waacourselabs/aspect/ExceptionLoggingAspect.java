package com.example.waacourselabs.aspect;

import com.example.waacourselabs.domain.ExceptionLog;
import com.example.waacourselabs.repo.ExceptionLogRepo;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;
import java.util.Date;

@Aspect
@Component
public class ExceptionLoggingAspect {
    @Autowired
    private ExceptionLogRepo exceptionLogRepo;

    @AfterThrowing(pointcut = "execution(* com.example.waacourselabs..*(..))", throwing = "ex")
    public void logException(Exception ex) {
        ExceptionLog exceptionLog = new ExceptionLog();
        exceptionLog.setDate(new Date());
        exceptionLog.setTimestamp(new Timestamp(System.currentTimeMillis()));
        exceptionLog.setPrincipal("fakeUser");
        exceptionLog.setOperation("Operation name");
        exceptionLog.setExceptionType(ex.getClass().getName());

        exceptionLogRepo.save(exceptionLog);
    }
}
