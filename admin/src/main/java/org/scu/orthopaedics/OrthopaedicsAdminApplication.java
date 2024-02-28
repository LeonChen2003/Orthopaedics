package org.scu.orthopaedics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class OrthopaedicsAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrthopaedicsAdminApplication.class, args);
    }
}
