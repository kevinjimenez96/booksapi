package dev.kevinjimenez.bookapi;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookapiApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(BookapiApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
