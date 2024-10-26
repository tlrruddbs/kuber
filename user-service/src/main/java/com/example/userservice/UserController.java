package com.example.userservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

  private final OrderService orderService;

  public UserController(OrderService orderService) {
    this.orderService = orderService;
  }

  @GetMapping("/user")
  public String getUserWithOrder() {
    log.info("user controller");
    String order = orderService.getOrder();
      return "User Service - Order Details: " + order;
  }
}