package pl.synchronize.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import pl.synchronize.SpringSynchronizeDataApplication;



@RunWith(SpringRunner.class)
@WebMvcTest(DataController.class)
public class DataControllerTest {

	@Autowired
    private MockMvc mockMvc;
	
	@Test
    public void postDataTest() throws Exception {
		 mockMvc.perform(post("/data")
		.contentType(MediaType.APPLICATION_JSON)
		.param("data","testData")
		)
		.andExpect(status().isCreated());
	  }
}
