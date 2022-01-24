package com.example.demo;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.test.context.junit4.SpringRunner;
@RunWith(SpringRunner.class)
public class HomebrewFormulaServiceTest {
    private HomebrewFormulaService homebrewFormulaService;
	
	@Test
	public void testGetHomebrewFormulaInfo() {
		HomebrewFormulaResponseVO homebrewFormulaResponseVO = new HomebrewFormulaResponseVO();
		homebrewFormulaResponseVO.setDesc("test desc");
		Versions versions = new Versions();
		homebrewFormulaResponseVO.setVersions(versions);
		HomebrewRestClient homebrewRestClient = Mockito.mock(HomebrewRestClient.class);
		Mockito.when(homebrewRestClient.fetchHomebrewFormulInfoByName("name"))
				.thenReturn(homebrewFormulaResponseVO);
		homebrewFormulaService = new HomebrewFormulaService(homebrewRestClient);
		homebrewFormulaService.getHomebrewFormulaInfo("name");
	}

}
