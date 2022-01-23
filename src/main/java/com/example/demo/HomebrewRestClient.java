package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
@Component
public class HomebrewRestClient {
	private static final Logger logger = LoggerFactory.getLogger(HomebrewRestClient.class);
	
	RestTemplate restTemplate = new RestTemplate();
	@Value("${rest.homebrewFormulaURL}")
	private String homebrewFormulaURL;
	public static final String JSON_FORMAT =".json";
	/**
	 * Method to fetch HomebrewFormulInfoByName from Homebrew through restTemplate
	 * @param formulaName
	 * @return HomebrewFormulaResponseVO
	 */
	public HomebrewFormulaResponseVO fetchHomebrewFormulInfoByName(String formulaName) {
		HomebrewFormulaResponseVO homebrewFormulaResponseVO = new HomebrewFormulaResponseVO();
		try {
			 homebrewFormulaResponseVO = 
					restTemplate.getForObject(homebrewFormulaURL.concat(formulaName).concat(JSON_FORMAT), HomebrewFormulaResponseVO.class);
		}catch(Exception exception) {
			logger.error("**** Exception occured while fetching fetchHomebrewFormulInfoByName from Homebrew *****"+exception.getCause());
		}
		return homebrewFormulaResponseVO;
	}

}
