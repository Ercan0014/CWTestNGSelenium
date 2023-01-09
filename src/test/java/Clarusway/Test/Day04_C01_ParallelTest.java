package Clarusway.Test;

import Clarusway.utilites.BaseCrossBrowserTest;
import org.testng.annotations.Test;

public class Day04_C01_ParallelTest extends BaseCrossBrowserTest {


    @Test
    public void test01(){
        driver.get("http://google.com");
        System.out.println("Test01 is running....");
    }

    @Test
    public void test02(){
       driver.get("http://www.amazon.com");
        System.out.println("Test02 is running...");
    }

    @Test
    public void test03(){

       driver.get("http://www.trendyol.com");
        System.out.println("Test03 is running...");
    }


}
