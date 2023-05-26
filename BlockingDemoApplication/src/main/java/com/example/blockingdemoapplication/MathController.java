package com.example.blockingdemoapplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/calculate")
public class MathController {
    @Autowired
    MathService mathService;

    @GetMapping()
    public Integer calculate(@RequestParam Integer value1, @RequestParam Integer value2) {
        System.out.println("request");
        return mathService.doHeavyMath(value1, value2);
    }

}
