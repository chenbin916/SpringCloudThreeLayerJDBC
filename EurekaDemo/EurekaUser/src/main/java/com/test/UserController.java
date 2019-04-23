package com.test;

import org.slf4j.Logger;  
import org.slf4j.LoggerFactory;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;  
import org.springframework.http.ResponseEntity;  
import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.ResponseBody;  
import org.springframework.web.client.RestTemplate;
import com.alibaba.fastjson.JSON; 
import com.test.serviceImpl.FeginClient;
import com.test.serviceImpl.FeginClientImpl;  
  
  
@Controller  
@EnableAutoConfiguration  
public class UserController {  
  
    /*@Autowired 
    private RestTemplate restTemplate;*/  
      
    @Autowired  
    private FeginClient feginClient;  
      
    private final static Logger logger = LoggerFactory.getLogger(UserController.class);  
      
    @RequestMapping("/getUser")  
    @ResponseBody  
    public String getUser() {  
  
         //调用远程服务  
//      ResponseEntity<String> responseEntity = restTemplate.getForEntity("http://sbc-order/getOrder", String.class);  
//        logger.info("res="+JSON.toJSONString(responseEntity));  
       
        String res;
       // res=feginClient.getOrderFromUser();  
      
        res=JSON.toJSONString(feginClient.getOrderFromUser("zhang shan"));
        logger.info("getUser Call order res:"+res);  
        return "getUser Call order res:"+res;  
    }  
      
}  
