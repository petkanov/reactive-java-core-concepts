package com.petkanov.sec09;

import com.petkanov.common.Util;
import com.petkanov.sec09.helper.Kayak;

public class Lec06MergeUseCase {

    public static void main(String[] args) {

        Kayak.getFlights()
                .subscribe(Util.subscriber());


        Util.sleepSeconds(3);


    }

}
