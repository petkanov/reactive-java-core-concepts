package com.petkanov.sec03;


import com.petkanov.common.Util;
import com.petkanov.sec03.assignment.StockPriceObserver;
import com.petkanov.sec03.client.ExternalServiceClient;

/*
    Ensure that the external service is up and running!
 */
public class Lec12Assignment {

    public static void main(String[] args) {

        var client = new ExternalServiceClient();
        var subscriber = new StockPriceObserver();
        client.getPriceChanges()
                .subscribe(subscriber);


        Util.sleepSeconds(20);

    }

}
