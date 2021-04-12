package com.dvsapp.login.dto;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.dvsapp.login.utils.POJOTest;

class UserDTOTest {

	@Test
	void test() {
		POJOTest.validateAccessors(UserDTO.class);
	}
	
	@Test
	public void testEqualsAndHashCode() {
		
		assertEquals(new UserDTO().hashCode(), new UserDTO().hashCode());
	}


}
