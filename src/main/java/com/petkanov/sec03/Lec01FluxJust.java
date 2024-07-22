package com.petkanov.sec03;

import com.petkanov.common.Util;
import reactor.core.publisher.Flux;

/*
    To create a Flux with arbitrary items in memory
 */
public class Lec01FluxJust {


    public static void main(String[] args) {

        Flux.just(1, 2, 3, "sam")
                .subscribe(Util.subscriber());

    }

}
