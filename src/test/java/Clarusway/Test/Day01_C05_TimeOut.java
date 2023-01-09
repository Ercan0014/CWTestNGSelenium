package Clarusway.Test;

import org.testng.annotations.Test;

public class Day01_C05_TimeOut {


    // timeOut set edildiginde test suresi bu sureyi gecmemelidir. Gecmesi durumunda test exception firlatir
    // timeOut gerceklestigi andan itibaren sonraki satirlar execute edilmez (calistirilmaz)
    // Exception sonrasi kod bloklarimiz execute edilmez kod yarida kesilir

    @Test (  timeOut=1000)

    public void passetTest(){
        System.out.println("1 saniyeden önce calıştı");

    }

    @Test(timeOut =1000)

    public void timeOutTest(){
        System.out.println("1 saniyeden önce çalıştı");


    }


}
