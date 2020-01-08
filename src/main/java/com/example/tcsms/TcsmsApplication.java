package com.example.tcsms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class TcsmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(TcsmsApplication.class, args);
    }

}
