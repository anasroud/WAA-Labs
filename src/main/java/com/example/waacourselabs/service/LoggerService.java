package com.example.waacourselabs.service;

import com.example.waacourselabs.domain.User;

import java.sql.Date;
import java.sql.Time;

public interface LoggerService {
    void log(String principle, String operation);
}
