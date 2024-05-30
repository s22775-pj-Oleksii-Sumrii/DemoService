package org.example.demoservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class DemoController {
    @GetMapping("/name")
    public String getName() {
        return "Feign";
    }
    @GetMapping("/address")
    public String getAddress() {
        return "Poland";
    }
    @GetMapping("/status")
    public String getStatus() {
        return "Active";
    }
}
