package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @GetMapping("/")
    public myResponse welcome() {
        myResponse response = new myResponse();
        response.setMessage("Welcome to my API");
        System.out.println("test");
        return response;
    }

    static class myResponse {
        private String message;

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

    }
}
