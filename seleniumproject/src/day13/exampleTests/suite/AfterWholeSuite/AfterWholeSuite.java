package day13.exampleTests.suite.AfterWholeSuite;

import org.testng.annotations.AfterSuite;

public class AfterWholeSuite {
    @AfterSuite
    public void afterSuite(){
        System.out.println("Running after the whole suite");
    }
}
