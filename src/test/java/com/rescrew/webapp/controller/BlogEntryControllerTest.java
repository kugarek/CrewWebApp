package com.rescrew.webapp.controller;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.springframework.test.web.server.MockMvc;
//import org.springframework.test.web.server.samples.context.WebContextLoader;
//import org.springframework.test.web.server.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

public class BlogEntryControllerTest {
	
	@InjectMocks
	private BlogEntryController controller;
	
	//private MockMvc mockMvc;
	
	@Before
	public void setup()
	{
		MockitoAnnotations.initMocks(this);
		
		//mockMvc = Mockm
	}
	
	
}
