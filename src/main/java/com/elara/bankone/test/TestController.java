package com.elara.bankone.test;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/testing")
public class TestController {
    private final RestTemplate discoveryRestTemplate;

    public TestController(@Qualifier("discoveryRestTemplate") RestTemplate discoveryRestTemplate) {
        this.discoveryRestTemplate = discoveryRestTemplate;
    }

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello World!";
    }

    @GetMapping("/validate")
    public String validateUser() {
        String url = "http://TestClient/test/login";
        LoginDto loginDto = new LoginDto("admin", "admin");

        return discoveryRestTemplate.postForObject(url, loginDto, String.class);
    }
}
