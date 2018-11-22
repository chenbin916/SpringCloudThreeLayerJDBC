package com.test.contrller;

import java.util.List;
import java.util.Map;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class FreemarkController {
	
/**
 * use freemarker as show page
 * 
 * 
 * 
 * 
 * @param res
 * @return
 */

	@RequestMapping("/freeMarkerIndex")
	 public String helloFreeMark(Map<String,Object> res) 
	 {
		res.put("name", "zhangshan");
		res.put("age", "18");
		 return "freeMarkIndex";
		 
		 
	 }
	 
	 
	
	 
	 
	 
	 //
	 
	 
	 
	
	 
	 
	
	 
	 
	 
}
