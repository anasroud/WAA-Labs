package com.example.waacourselabs.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.sql.Timestamp;
import java.util.Date;

@Entity
public class Logger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date date;
    private Timestamp timestamp;
    private String principal;
    private String Operation;

    public Logger() {
    }

    public Logger(Date date, Timestamp timestamp, String principal, String operation) {
        this.date = date;
        this.timestamp = timestamp;
        this.principal = principal;
        Operation = operation;
    }

    public Long getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public String getPrincipal() {
        return principal;
    }

    public String getOperation() {
        return Operation;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    public void setOperation(String operation) {
        Operation = operation;
    }
}
