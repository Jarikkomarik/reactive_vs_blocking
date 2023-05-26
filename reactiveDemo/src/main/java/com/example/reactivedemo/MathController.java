package com.example.reactivedemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("api/v1/calculate")
public class MathController {
    @Autowired
    MathService mathService;

    @GetMapping()
    public Mono<Integer> calculate(@RequestParam Integer value1, @RequestParam Integer value2) {
        return mathService.doHeavyMath(value1, value2);
    }

}
