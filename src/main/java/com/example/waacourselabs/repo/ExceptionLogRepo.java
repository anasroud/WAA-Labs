package com.example.waacourselabs.repo;

import com.example.waacourselabs.domain.ExceptionLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExceptionLogRepo extends JpaRepository<ExceptionLog, Long> {
    ExceptionLog findById(long id);
    ExceptionLog save(ExceptionLog exceptionLog);
    void deleteById(long id);
}
