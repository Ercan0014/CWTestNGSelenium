package Clarusway.Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day02_C04_TestNGParametersSeleniumExample {

/*
    Go to URL: https://www.amazon.com
    Search words: Java, Selenium
    Assert get text result est that the result text contains the searched Word.
    Run tests from XML file.


 */

    WebDriver driver;

    @BeforeMethod
    @Parameters ("browser")
    public void setup(String browserValue){
        {
            switch(browserValue){
                
            }
        }


    }

    @AfterMethod
    public void tearDown(){


    }

    @Test
    public void test(){


    }




}
