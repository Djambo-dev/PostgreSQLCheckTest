package ru.check.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(
        scanBasePackages = "ru"
)
@EnableJpaRepositories(
        basePackages = "ru.check.data.repository"
)
@EntityScan(
        basePackages = "ru.check.data.entity"
)
@EnableScheduling
@EnableTransactionManagement
public class PostgreSQLCheckTestApplication {
    public static void main(String[] args) {
        SpringApplication.run(PostgreSQLCheckTestApplication.class, args);
    }
}
