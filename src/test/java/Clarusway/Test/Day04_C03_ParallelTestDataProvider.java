package Clarusway.Test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day04_C03_ParallelTestDataProvider {


    @Test(dataProvider = "getData")
    public void test(String name, String surname){
        System.out.println(name + " " + surname);
    }



    @DataProvider(parallel = true)
    public Object[][] getData(){

        return new Object[][]{
                {"yusuf", "celik"},
                {"can", "efe"},
                {"merve", "aslan"}
        };

    }
}