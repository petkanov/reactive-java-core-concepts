package com.petkanov.sec04;

import com.petkanov.common.Util;
import com.petkanov.sec04.helper.NameGenerator;
import reactor.core.publisher.Flux;

public class Lec02FluxCreateRefactor {

    public static void main(String[] args) {

        var generator = new NameGenerator();
        var flux = Flux.create(generator);
        flux.subscribe(Util.subscriber());

        // somewhere else!
        for (int i = 0; i < 10; i++) {
            generator.generate();
        }

    }

}
