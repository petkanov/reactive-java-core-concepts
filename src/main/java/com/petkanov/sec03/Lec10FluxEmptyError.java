package com.petkanov.sec03;

import com.petkanov.common.Util;
import reactor.core.publisher.Flux;

/*
    To create empty/error flux
 */
public class Lec10FluxEmptyError {

    public static void main(String[] args) {

        Flux.empty()
                .subscribe(Util.subscriber());

        Flux.error(new RuntimeException("oops"))
                .subscribe(Util.subscriber());

    }

}
