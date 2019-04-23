package com.test.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;

public class FeginClientImpl implements FeginClient {
	
//    @Autowired  
//    private FeginClient feginClient;  
	

	@Override
	public String getOrderFromUser(@RequestParam("name") String name) {
		// TODO Auto-generated method stub
		String res=name;
		return "----------------FeginClientImpl invoke successful!:"+res;
	}

}
