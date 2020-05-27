package com.example.demo;

import com.example.demo.model.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	Teacher teacher;

	@Test
	void contextLoads() {
		System.out.println(teacher);
	}

}
