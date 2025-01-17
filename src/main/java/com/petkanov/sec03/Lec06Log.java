package com.petkanov.sec03;

import com.petkanov.common.Util;
import reactor.core.publisher.Flux;

public class Lec06Log {

    public static void main(String[] args) {


        Flux.range(1, 5)
                .log()
                .map(i -> Util.faker().name().firstName())
                .log()
                .subscribe(Util.subscriber());


    }

}
