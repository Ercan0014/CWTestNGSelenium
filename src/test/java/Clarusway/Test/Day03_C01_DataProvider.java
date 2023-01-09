package Clarusway.Test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day03_C01_DataProvider {

    @Test (dataProvider = "dataProvider")
    public void test01(String name){
        // verileri dataProvider methodundan alarak calışacak olan test
        System.out.println(name);
    }


@DataProvider
   public Object [][] dataProvider(){
        // verileri teste sağlayacak olan method
      Object[][] data = {
               {"Karl"},
               {"Ortis"},
               {"Clarusway"}


       };
return data;
   }

}
