package com.petkanov.sec13;

import com.petkanov.common.Util;
import com.petkanov.sec13.client.ExternalServiceClient;
import reactor.util.context.Context;

/*
    Ensure that the external service is up and running!
 */
public class Lec04ContextRateLimiterDemo {

    public static void main(String[] args) {

        var client = new ExternalServiceClient();
        for (int i = 0; i < 20; i++) {
            client.getBook()
                  .contextWrite(Context.of("user", "mike"))
                  .subscribe(Util.subscriber());
            Util.sleepSeconds(1);
        }

        Util.sleepSeconds(5);

    }

}
