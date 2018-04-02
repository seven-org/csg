package org.seven.caishigou.test;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TestUtils {

	@Test
	public void test1() {
		try {
			System.out.println(new ObjectMapper().writeValueAsString(new java.util.Date()));
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
