package com.petkanov.sec09;

import com.petkanov.common.Util;
import com.petkanov.sec09.assignment.ExternalServiceClient;
import reactor.core.publisher.Flux;

/*
    Ensure that the external service is up and running!
 */
public class Lec13ConcatMap {

    public static void main(String[] args) {

        var client = new ExternalServiceClient();

        Flux.range(1, 10)
            .concatMap(client::getProduct)
            .subscribe(Util.subscriber());

        Util.sleepSeconds(20);

    }

}
