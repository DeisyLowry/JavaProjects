package com.dgl.core;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import static org.junit.jupiter.api.Assertions.*;


import com.dgl.core.service.PaymentService;
import org.springframework.test.context.junit4.SpringRunner;


//@RunWith(SpringRunner.class)
@SpringBootTest
class SpringBootCoreApplicationTests {

	//@Test
	//void contextLoads() {	}

	@Autowired
	PaymentService service;
	@Test
	public void TestDependencyInjection(){
		assertNotNull(service);

	}

}
