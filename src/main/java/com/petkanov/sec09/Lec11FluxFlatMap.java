package com.petkanov.sec09;

import com.petkanov.common.Util;
import com.petkanov.sec09.applications.OrderService;
import com.petkanov.sec09.applications.User;
import com.petkanov.sec09.applications.UserService;

/*
    Sequential non-blocking IO calls!
    flatMap is used to flatten the inner publisher / to subscribe to the inner publisher
 */
public class Lec11FluxFlatMap {

    public static void main(String[] args) {

        /*
            Get all the orders from order service!
         */

        UserService.getAllUsers()
                   .map(User::id)
                   .flatMap(OrderService::getUserOrders)
                   .subscribe(Util.subscriber());

        Util.sleepSeconds(5);

    }

}
