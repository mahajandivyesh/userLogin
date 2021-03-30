package com.dvsapp.login.resource;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dvsapp.login.dto.UserDTO;
import com.dvsapp.login.service.IUserService;
import com.dvsapp.login.util.CommonResponse;

@RestController
public class UserResource {

	@Autowired
	public IUserService iUserService;
	
	@PostMapping("/user/login")
	public ResponseEntity<CommonResponse> loginUser(@RequestBody UserDTO user){
		CommonResponse commonResponse = new CommonResponse();		
		UserDTO dto = iUserService.loginUser(user);
		if(dto != null) {
			commonResponse.setSuccess(true);
			commonResponse.setResp(dto);
		}else {
			commonResponse.setSuccess(false);
			commonResponse.setResp(null);
		}
		return new ResponseEntity<>(commonResponse,HttpStatus.OK);
	}
	
}
