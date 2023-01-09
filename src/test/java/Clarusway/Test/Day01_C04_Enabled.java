package Clarusway.Test;

import org.testng.annotations.Test;

public class Day01_C04_Enabled {

    @Test (enabled =true)
    public void anabledTest(){
        System.out.println("Enabled test");


    }

    @Test (enabled = false)
    public void disabledTest(){

        System.out.println("Disblad Test");


    }


}
