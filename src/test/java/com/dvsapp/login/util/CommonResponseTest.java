package com.dvsapp.login.util;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.dvsapp.login.utils.POJOTest;

class CommonResponseTest {

	@Test
	void test() {
		POJOTest.validateAccessors(CommonResponse.class);
	}
	
	@Test
	public void testEqualsAndHashCode() {
		
		assertEquals(new CommonResponse().hashCode(), new CommonResponse().hashCode());
	}

}
