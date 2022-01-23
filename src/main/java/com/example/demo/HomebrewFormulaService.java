package com.example.demo;


import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class HomebrewFormulaService {
	private static final Logger logger = LoggerFactory.getLogger(HomebrewFormulaService.class);
	@Autowired
	private HomebrewRestClient homebrewRestClient;
	/**
	 * method to get HomebrewFormulaInfo by formulaName
	 * @param formulaName
	 * @return HomebrewFormulaOutputVO
	 */
	public HomebrewFormulaOutputVO getHomebrewFormulaInfo(String formulaName) {
		HomebrewFormulaOutputVO homebrewFormulaOutputVO = new HomebrewFormulaOutputVO();
		HomebrewFormulaResponseVO homebrewFormulaResponseVO = new HomebrewFormulaResponseVO();
		try {
			 homebrewFormulaResponseVO = 
					homebrewRestClient.fetchHomebrewFormulInfoByName(formulaName);
			if(!ObjectUtils.isEmpty(homebrewFormulaResponseVO)) {
				homebrewFormulaOutputVO.setDescription(homebrewFormulaResponseVO.getDesc());
				if(!ObjectUtils.isEmpty(homebrewFormulaResponseVO.getVersions()))
				homebrewFormulaOutputVO.setVersion(Arrays.asList(homebrewFormulaResponseVO.getVersions())
						.get(0).getStable());
				homebrewFormulaOutputVO.setDependencies(homebrewFormulaResponseVO.getDependencies());
				homebrewFormulaOutputVO.setGeneratedDate(homebrewFormulaResponseVO.getGenerated_date());
			}
		}catch(Exception exception) {
			
			logger.error("**** Exception occured at service layer while fetching HomebrewFormulaInfo *****{}"
					,exception.getCause());
		}
		return homebrewFormulaOutputVO;
		
	}

}
