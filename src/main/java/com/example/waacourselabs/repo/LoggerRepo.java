package com.example.waacourselabs.repo;

import com.example.waacourselabs.domain.Logger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoggerRepo extends JpaRepository<Logger, Long> {
    Logger findById(long id);
    Logger save(Logger logger);
    void deleteById(long id);
}
