package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class Demo1Application {

  public static void main(String[] args) {
    SpringApplication.run(Demo1Application.class, args);
  }

  @Bean
  CommandLineRunner commandLineRunner(UserRepository userRepository, PasswordEncoder encoder) {
    return args -> {
      userRepository.save(new User("user", encoder.encode("user"), "ROLE_USER"));
      userRepository.save(new User("admin", encoder.encode("admin"), "ROLE_ADMIN"));
    };
  }
}
