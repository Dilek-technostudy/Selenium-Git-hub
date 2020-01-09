package day13.exampleTests.grouping;

import org.testng.annotations.AfterGroups;

public class afterGroups {
    @ AfterGroups("regression")
public void afterRegressionGroup(){
    System.out.println("After Regression Group");
}

    @AfterGroups("functional")
    public void afterFunctionalGroup(){
        System.out.println("After Functional Group");
    }
}
