package ua.hillel.tests.homework15;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamTest {
    @Test
    @Parameters({"firstParameter", "secondParameter"})
    public void parameterTest (@Optional("optionalParam") String firstParam, @Optional("secondParam") String secondParam) {
        System.out.println("Parameterized value is : " + firstParam + " " + " " + secondParam);
    }
}
