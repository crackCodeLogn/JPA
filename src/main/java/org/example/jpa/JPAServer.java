package org.example.jpa;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Vivek
 * @since 24/10/21
 */
@Slf4j
@SpringBootApplication
public class JPAServer {
    public static void main(String[] args) {
        SpringApplication.run(JPAServer.class, args);
    }
}