package com.restapi.api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.api.model.JasonRequest;
import com.restapi.api.model.JsonResponse;

@RestController
public class Rcontroller {
	
	@SuppressWarnings("unchecked")
	@PostMapping("/users")
	@ResponseBody
	public ResponseEntity printUser(@RequestBody JasonRequest json) throws InterruptedException {
		int oldValue=json.getCategoryCode();
		int newValue=update(oldValue);
		
		return new ResponseEntity(
				new JsonResponse(oldValue, 
						newValue) 
				,HttpStatus.OK);
	}
	
	public int update(int old) throws InterruptedException {
		int newN=0;
		
		while(old>0 || newN>9) {
		
		if(old==0) {
			old=newN;
			newN=0;
		}
		//remove last digit
		newN += old%10;
		old /= 10;
		
		
		}
	    Thread.sleep(5000);
		return newN;

	}

}
