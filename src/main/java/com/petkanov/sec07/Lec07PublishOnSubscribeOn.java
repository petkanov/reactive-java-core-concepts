package com.petkanov.sec07;

import com.petkanov.common.Util;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import reactor.core.publisher.Flux;
import reactor.core.scheduler.Schedulers;

/*
    publish on for downstream!
    subscribeOn for upstream
 */
public class Lec07PublishOnSubscribeOn {

    private static final Logger log = LoggerFactory.getLogger(Lec07PublishOnSubscribeOn.class);

    public static void main(String[] args) {

        var flux = Flux.create(sink -> {
                           for (int i = 1; i < 3; i++) {
                               log.info("generating: {}", i);
                               sink.next(i);
                           }
                           sink.complete();
                       })
                       .publishOn(Schedulers.parallel())
                       .doOnNext(v -> log.info("value: {}", v))
                       .doFirst(() -> log.info("first1"))
                       .subscribeOn(Schedulers.boundedElastic())
                       .doFirst(() -> log.info("first2"));


        Runnable runnable1 = () -> flux.subscribe(Util.subscriber("sub1"));

        Thread.ofPlatform().start(runnable1);

        Util.sleepSeconds(2);


    }

}
