package com.example.demo;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class HelloController {
  
  @GetMapping("/hello")
  String sayHello(Principal principal) {
    if (principal != null)
       return "hello " + principal.getName();
    else
      return "hello none";
  }

  @GetMapping("/hi")
  String sayHi() {
    return "hi";
  }

  @GetMapping("/user")
  String helloUser() {
    return "hello, user";
  }
  @GetMapping("/admin")
  String helloAdmin() {
    return "hello, admin";
  }
}
