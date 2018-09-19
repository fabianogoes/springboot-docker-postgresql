package com.app99.townhall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@SpringBootApplication
public class FinanceTownhallApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(FinanceTownhallApiApplication.class, args);
    }

    @GetMapping
    public String welcome() {
        return "It's Wonking...";
    }


}
