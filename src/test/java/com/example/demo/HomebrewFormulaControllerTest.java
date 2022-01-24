package com.example.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.mockito.InjectMocks;
import org.mockito.Mockito;

@WebMvcTest
public class HomebrewFormulaControllerTest {
    private MockMvc mockMvc;
    @InjectMocks
    private HomebrewFormulaController homebrewFormulaController;
   @MockBean
    private HomebrewFormulaService homebrewFormulaService;
    @BeforeEach
    	public void setUp() {
    	mockMvc = MockMvcBuilders.standaloneSetup(homebrewFormulaController).build();
    }
    @Test
    public void testGetHomebrewFormulaDetail() throws Exception {
    	String name = "wget";
    	HomebrewFormulaOutputVO homebrewFormulaOutputVO = new HomebrewFormulaOutputVO();
        Mockito.when(homebrewFormulaService.getHomebrewFormulaInfo("wget")).thenReturn(homebrewFormulaOutputVO);
        mockMvc.perform(get("/formula").param("name",name).accept(MediaType.APPLICATION_JSON))
        .andDo(print())
        .andExpect(status().isOk());
    }
}
