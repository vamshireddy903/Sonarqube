package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @GetMapping("/")
    public String home() {
        return "<!DOCTYPE html>" +
                "<html>" +
                "<head>" +
                "<title>Styled Spring Boot Page</title>" +
                "<style>" +
                "body { background-color: #f0f4f8; font-family: Arial, sans-serif; text-align: center; padding-top: 100px; }" +
                "h1 { color: #1a73e8; font-size: 48px; }" +
                "p { color: #555; font-size: 20px; }" +
                ".btn { background-color: #1a73e8; color: white; padding: 12px 24px; font-size: 16px; border: none; border-radius: 6px; cursor: pointer; }" +
                ".btn:hover { background-color: #0c59cf; }" +
                "</style>" +
                "</head>" +
                "<body>" +
                "<h1>🚀 Spring Boot App Running</h1>" +
                "<p>This page is styled directly from Java!</p>" +
                "<button class='btn' onclick=\"alert('Hello from Spring Boot!')\">Click Me</button>" +
                "</body>" +
                "</html>";
    }
}
