package com.test.serviceImpl;

import org.springframework.cloud.netflix.feign.FeignClient;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;  
  
@FeignClient(name = "sbc-order", fallback = FeginClient.class)  
public interface FeginClient {  
  
    @RequestMapping(value = "/getOrder", method = RequestMethod.GET)  
    String getOrderFromUser(@RequestParam("name") String name);  
  
} 