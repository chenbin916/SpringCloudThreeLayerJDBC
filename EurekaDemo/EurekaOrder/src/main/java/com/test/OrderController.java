package com.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.ResponseBody;  
  
@Controller  
@EnableAutoConfiguration  
public class OrderController {
    @Autowired
    private LoadBalancerClient loadBalancer;
	
    @Autowired
    private DiscoveryClient client;
    
	@RequestMapping("/getOrder")  
    @ResponseBody  
    public String getOrder(String name) {  
		 ServiceInstance instance = client.getLocalServiceInstance();
	      String res=  "--------:hello, host:" + instance.getHost() + "port: "+instance.getPort()+",service_id:" + instance.getServiceId();
	     //  return "Hello SpringCloud~HOST:" + instance.getHost() + ",PORT:" + port + ",service_id:" + instanc
         System.out.println(res);
        return "-------------------------->this is order response............orderName:............"+name;  
    }  

}
