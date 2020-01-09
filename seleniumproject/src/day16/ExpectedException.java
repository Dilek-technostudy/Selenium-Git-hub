package day16;

import org.testng.annotations.Test;

public class ExpectedException {

    @Test(expectedExceptions = ArithmeticException.class)
    public void testThatMustThrowAnException(){
        double res = 1.0 / 0;
        int result = 1 / 0;
    }
}
