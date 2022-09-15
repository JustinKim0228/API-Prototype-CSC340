package com.csc340.RestAPI;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RestController;


/**
 *
 * @author j_kim10@uncg.edu
 */
@RestController
public class RestApiController {

    private Map<String, Countries> countryMap = new HashMap<>(); 

    private static RestApiController instance = new RestApiController();
    public static RestApiController getInstance() {
        return instance;
    }

    private RestApiController() {
        countryMap.put("Afghanistan", new Countries("Afghanistan", "AF"));
        countryMap.put("Australia", new Countries("Australia", "AU"));
        countryMap.put("United States", new Countries("United States", "US"));
        countryMap.put("Japan", new Countries("Japan", "JP"));
        countryMap.put("Greece", new Countries("Greece", "GR"));
        countryMap.put("France", new Countries("France", "FR"));

    }
    public Countries getCountry(String country) {
		return countryMap.get(country);
	}

	public void putCountry(Countries country) {
		countryMap.put(country.getCountry(), country);

    }
}
