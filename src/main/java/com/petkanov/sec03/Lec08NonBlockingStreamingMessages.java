package com.petkanov.sec03;

import com.petkanov.common.Util;
import com.petkanov.sec03.client.ExternalServiceClient;

/*
    To demo non-blocking IO with streaming messages
    Ensure that the external service is up and running!
 */
public class Lec08NonBlockingStreamingMessages {

    public static void main(String[] args) {

        var client = new ExternalServiceClient();

        client.getNames()
                .subscribe(Util.subscriber("sub1"));

        client.getNames()
                .subscribe(Util.subscriber("sub2"));

        Util.sleepSeconds(6);

    }

}
