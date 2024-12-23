package com.example.demo.Controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {
	
	@Value("${common.property}")
    private String commonProperty;

    @Value("${service-a.property}")
    private String serviceAProperty;

    @GetMapping("/config")
    public String getConfig() {
        return "Common Property: " + commonProperty + ", Service A Property: " + serviceAProperty;
    }

}
