package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomebrewFormulaController {
	private static final Logger logger = LoggerFactory.getLogger(HomebrewFormulaController.class);
	@Autowired
	private HomebrewFormulaService homebrewFormulaService;
	/**
	 * Controller method to get the HomebrewFormulaDetail
	 * @param name
	 * @return HomebrewFormulaOutputVO
	 */
	@GetMapping("/formula")
	public ResponseEntity<HomebrewFormulaOutputVO> getHomebrewFormulaDetail(@RequestParam String name) {
		HomebrewFormulaOutputVO homebrewFormulaOutputVO = new HomebrewFormulaOutputVO();
		try {
			homebrewFormulaOutputVO = homebrewFormulaService.getHomebrewFormulaInfo(name);
		}catch(Exception exception) {
			logger.error("**** Exception occured while fetching HomebrewFormulaInfo *****{}"
					,exception.getCause());
		}
		return new ResponseEntity<>(homebrewFormulaOutputVO, HttpStatus.OK);
	}

}
