package com.example.blockingdemoapplication;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.time.Duration;

@Service
public class MathService {

    public Integer doHeavyMath(Integer a, Integer b) {

        return Mono.just(a + b).delaySubscription(Duration.ofSeconds(10)).block();
    }
}
