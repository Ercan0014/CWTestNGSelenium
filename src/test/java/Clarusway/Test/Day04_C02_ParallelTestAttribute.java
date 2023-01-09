package Clarusway.Test;

import org.testng.annotations.Test;

public class Day04_C02_ParallelTestAttribute {


    @Test(
            threadPoolSize =4, // testimizin kaç çekirdet paralel olarak çalışacağını belirler
             invocationCount =7  // testimizin kaç defa çalıştırılacağını belirler.
    )


    public void test(){
        System.out.println("Current thread ıd =" + Thread.currentThread().getId());

    }



}
