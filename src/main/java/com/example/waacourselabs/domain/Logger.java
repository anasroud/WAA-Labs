package com.example.waacourselabs.domain;

import jakarta.persistence.*;

import java.sql.Time;
import java.util.Date;

@Entity
public class Logger {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.EAGER)
    private User user;
    private Date date;
    private Time time;
    private String principal;
    private String operation;

    public Logger() {
    }

    public Logger(User user, Date date, Time time, String principal, String operation) {
        this.user = user;
        this.date = date;
        this.time = time;
        this.principal = principal;
        this.operation = operation;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public Long getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public Time getTime() {
        return time;
    }

    public String getPrincipal() {
        return principal;
    }

    public String getOperation() {
        return operation;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    @Override
    public String toString() {
        return "Logger{" +
                "id=" + id +
                ", date=" + date +
                ", time=" + time +
                ", principal='" + principal + '\'' +
                ", operation='" + operation + '\'' +
                '}';
    }
}
