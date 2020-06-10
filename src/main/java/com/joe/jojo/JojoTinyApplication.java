package com.joe.jojo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
@ComponentScans({
        @ComponentScan("com.joe.jojo.config"),
        @ComponentScan("com.joe.jojo.common"),
        @ComponentScan("com.joe.jojo.component")
})
public class JojoTinyApplication {

    public static void main(String[] args) {
        SpringApplication.run(JojoTinyApplication.class, args);
    }

}
