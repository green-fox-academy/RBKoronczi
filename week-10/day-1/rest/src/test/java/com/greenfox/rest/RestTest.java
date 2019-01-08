package com.greenfox.rest;


import com.greenfox.rest.Log.LogServiceInterface;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;



@RunWith(SpringRunner.class)
@WebMvcTest(ApiController.class)
public class RestTest {
  @Autowired
  private MockMvc mockMvc;

  @MockBean
  LogServiceInterface mockLogService;

  @Test
  public void doublingSanityTest() throws Exception {
    this.mockMvc.perform(get("/doubling"))
        .andExpect(jsonPath("$.error", is("Please provide an input!")));
  }

  @Test
  public void doublingTest() throws Exception {
    this.mockMvc.perform(get("/doubling?input=15"))
        .andExpect(jsonPath("$.result", is(30)));
  }

}
