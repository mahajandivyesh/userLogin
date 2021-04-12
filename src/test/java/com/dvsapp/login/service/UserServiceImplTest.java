package com.dvsapp.login.service;

import static org.junit.Assert.assertEquals; 
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.BeanUtils;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.dvsapp.login.dto.UserDTO;
import com.dvsapp.login.entity.UserEntity;
import com.dvsapp.login.repository.IUserRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
class UserServiceImplTest {

	@InjectMocks
	private UserServiceImpl iUserService;
	
	@Mock
	private IUserRepository  iUserRepository;
	
	
	
	@Test
	void testLoginUser() {
		UserDTO dto = new UserDTO();
		dto.setEmail("dvsmahajan");
		dto.setPassword("12345");
		
		
		
		UserEntity expectationEntity = new UserEntity();
		expectationEntity.setId(2);
		expectationEntity.setName("Divyesh Mahajan");
		expectationEntity.setAddress("Banglore");
		expectationEntity.setPhNumber(987563211l);
		expectationEntity.setEmail("dvsmahajan");
		expectationEntity.setPassword("12345");
		
		
		
		when(iUserRepository.findByEmailAndPassword(dto.getEmail(), dto.getPassword())).thenReturn(expectationEntity);
		

		UserDTO actual = iUserService.loginUser(dto);
		
		UserDTO expectation = new  UserDTO();
		BeanUtils.copyProperties(expectationEntity, expectation);
		assertEquals(expectation, actual);
	}
	
	@BeforeEach
	public void  checkNullProperties() {
		assertNotNull(iUserService);
		assertNotNull(iUserRepository);
		System.out.println("\n\n\n\n\n\nDONE \n\n\n\n\n\n");
	}
	
	@Test
	public void falsePositiveInput() {
		UserDTO dto = new UserDTO();
		dto.setEmail("dvsmahajan1");
		dto.setPassword("12345");
		
		
		when(iUserRepository.findByEmailAndPassword(dto.getEmail(), dto.getPassword())).thenReturn(null);
		

		UserDTO actual = iUserService.loginUser(dto);
		
		assertEquals(null, actual);
	}
	
	

}
