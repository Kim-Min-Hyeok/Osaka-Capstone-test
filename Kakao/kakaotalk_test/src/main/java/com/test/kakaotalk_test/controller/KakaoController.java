package com.test.kakaotalk_test.controller;

import org.json.JSONObject;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KakaoController {
    @PostMapping("/message")
    public String test(@RequestBody String test) {
        System.out.println(test);
        return test;
    }
}
