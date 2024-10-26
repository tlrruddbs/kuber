package com.example.orderservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

  @GetMapping("/order")
  public String getOrder() {
    return "Hello from Order Service";
  }
}