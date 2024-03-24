package com.medlas.videochatapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.CommandLineRunner;

import com.medlas.videochatapp.user.User;
import com.medlas.videochatapp.user.UserService;

@SpringBootApplication
public class VideoChatAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(VideoChatAppApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(UserService service) {
        return args -> {
            service.register(User.builder()
                    .username("Med")
                    .email("med@icloud.com")
                    .password("1234")
                    .build());

            service.register(User.builder()
                    .username("John")
                    .email("john@icloud.com")
                    .password("1234")
                    .build());

            service.register(User.builder()
                    .username("Jerry")
                    .email("jerry@icloud.com")
                    .password("1234")
                    .build());
        };

    }
}
