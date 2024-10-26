package com.example.orderservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
@Slf4j
public class OrderController {

  @GetMapping("/order")
  public String getOrder() {
    log.info("order controller");
    return "Hello from Order Service";
  }
}