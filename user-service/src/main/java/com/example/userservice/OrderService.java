package com.example.userservice;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderService {

  private final RestTemplate restTemplate;

  // RestTemplate을 생성자 주입
  public OrderService(RestTemplate restTemplate) {
    this.restTemplate = restTemplate;
  }

  public String getOrder() {
    // order-service에 GET 요청을 보냄
    return restTemplate.getForObject("http://order-service:1002/order", String.class);
//    return restTemplate.getForObject("http://localhost:1002/order", String.class);
  }
}