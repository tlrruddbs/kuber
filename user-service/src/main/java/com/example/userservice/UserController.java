package com.example.userservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

  private final OrderService orderService;

  public UserController(OrderService orderService) {
    this.orderService = orderService;
  }

  @GetMapping("/user")
  public String getUserWithOrder() {
    String order = orderService.getOrder();
    return "User Service - Order Details: " + order;
  }
}