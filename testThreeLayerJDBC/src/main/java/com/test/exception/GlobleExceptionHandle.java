package com.test.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
@ControllerAdvice
public class GlobleExceptionHandle {

	

	@ExceptionHandler(RuntimeException.class)
	@ResponseBody
	public Map<String,Object> handleException()
	{
		
		Map<String,Object> result=new HashMap<String,Object>();
		result.put("errorCode", "500");
		result.put("errorMsg",  "系统异常");
		return result;
		
	}

}
