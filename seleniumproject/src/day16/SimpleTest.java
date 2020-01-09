package day16;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SimpleTest {

    private boolean condition = false;

    @Test
    public void test(){
        // how to do:
        Assert.assertTrue( condition );



        //how not to do:
//        if(condition){
//            System.out.println("Success");
//        } else {
//            System.out.println("Failure");
//        }
    }
}
