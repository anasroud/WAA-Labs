package com.example.waacourselabs.repo;


import com.example.waacourselabs.domain.ExceptionLog;
import org.springframework.stereotype.Repository;

@Repository
public interface LoggerRepo {
    void save(ExceptionLog exceptionLog);

    void log(String message);
}
