package com.example.demo

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.data.jpa.repository.config.EnableJpaAuditing
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@EnableAutoConfiguration
@SpringBootApplication
@EnableJpaRepositories
@EnableJpaAuditing
class DemoApplication {

    static void main(String[] args) {
        SpringApplication.run(DemoApplication, args)
    }

}
