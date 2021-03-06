package com.dvsapp.login.resource;



import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import com.dvsapp.login.dto.UserDTO;
import com.dvsapp.login.dto.UserJsonPojo;
import com.dvsapp.login.service.IUserService;
import com.dvsapp.login.util.CommonResponse;
import com.google.gson.Gson;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = UserJsonPojo.class)
@SpringBootTest
@TestPropertySource(locations = "classpath:/inputparameter.properties")
public class UserResourceTest {

	
	@Mock
	private IUserService iUserService;

	@InjectMocks
	private UserResource userResource;
	

	@Autowired
	private UserJsonPojo userJsonPojo;
	
	@Test
	public void testUserPojo() {
		System.out.println(userJsonPojo.getJsonProperties());
		
		Gson gson = new Gson();
		  
        // Converting json to object
        // first parameter should be prpreocessed json
        // and second should be mapping class
		UserJsonPojo pojo
            = gson.fromJson(userJsonPojo.getJsonProperties(), UserJsonPojo.class);
		
		System.out.println(pojo);
	}
	
	@Test
	public void testLoginUser() {
		UserDTO dto = new UserDTO();
		dto.setEmail("dvsmahajan");
		dto.setPassword("12345");
		System.out.println(userResource);
		
		
		CommonResponse response = new CommonResponse();
		response.setSuccess(true);
		UserDTO dto2 = new UserDTO();
		dto2.setId(2);
		dto2.setName("Divyesh Mahajan");
		dto2.setAddress("Banglore");
		dto2.setPhNumber(987563211l);
		dto2.setEmail("dvsmahajan");
		dto2.setPassword("12345");
		response.setResp(dto2);
		ResponseEntity<CommonResponse> res = new ResponseEntity<CommonResponse>(response, HttpStatus.OK);
		
		when(iUserService.loginUser(dto)).thenReturn(dto2);
			
		ResponseEntity<CommonResponse> resp = userResource.loginUser(dto);


		
		assertEquals(res, resp);
		System.out.println("BYE");
	}
	
	
	 @BeforeEach
	public void checkNullProperties() {
		System.out.println("\n\n\n\n HI\n\n\n\n\n\n");
		assertNotNull(userResource);		
		assertNotNull(iUserService);

	}
	 
	 
		@Test
		public void falseTestLoginUser() {
			UserDTO dto = new UserDTO();
			dto.setEmail("dvsmahajan1");
			dto.setPassword("12345");
			System.out.println(userResource);
			
			
			CommonResponse response = new CommonResponse();
			response.setSuccess(false);
			
			ResponseEntity<CommonResponse> res = new ResponseEntity<CommonResponse>(response, HttpStatus.OK);
			
			when(iUserService.loginUser(dto)).thenReturn(null);
				
			ResponseEntity<CommonResponse> resp = userResource.loginUser(dto);


			
			assertEquals(res, resp);
			System.out.println("BYE");
		}

}
