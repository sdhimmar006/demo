package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
@Slf4j
public class SampleController {

    @GetMapping("/service2")
    public String hello() {
        log.info("some msg");
        return "hello";
    }
}
