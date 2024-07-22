package com.petkanov.sec05;

import com.petkanov.common.Util;
import reactor.core.publisher.Flux;

/*
    Similar to error handling.
    Handling empty!
 */
public class Lec07DefaultIfEmpty {

    public static void main(String[] args) {

        Flux.range(1, 10)
                .filter(i -> i > 11)
                .defaultIfEmpty(50)
                .subscribe(Util.subscriber());

    }


}
