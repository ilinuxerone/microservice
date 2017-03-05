package com.example;

import com.example.service.BlogProperties;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ConfigApplicationTests {

	@Autowired
	private BlogProperties blogProperties;

	@Test
	public void getHello() {
		Assert.assertEquals(blogProperties.getName(), "zzh");
		Assert.assertEquals(blogProperties.getTitle(), "hello springboot");
	}

}
