package com.simplilearn.bookzy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookzyApplication {

    private final String message = "Hello World!";

    public BookzyApplication() {}

    private final String getMessage() {
        return message;
    }
	
    public static void main(String[] args) {
        System.out.println(new BookzyApplication().getMessage());
    }
}
