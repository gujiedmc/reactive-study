package com.gujiedmc.study.reactive.reactor;

import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author gujiedmc
 * @date 2023-03-22
 */
public class ReactiveTest {

    @Test
    public void testFlux() {

        Flux.range(0, 10)
                .filter(i -> i % 2 == 0)
                .subscribe(System.out::println);

    }

    @Test
    public void testMono() {
        Mono<Integer> mon = Mono.just(1);
    }
}
