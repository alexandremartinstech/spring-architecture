package com.example.msone.contoller;

import com.example.msone.config.ConfigCLientConfigurator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

    final ConfigCLientConfigurator configuration;

    public ExampleController(ConfigCLientConfigurator configuration) {
        this.configuration = configuration;
    }

    @GetMapping("/profile")
    public String retrieveLimits(){
        return configuration.getProfile();
    }
}
