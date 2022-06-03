package singleFeatureRunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import utils.Browser;
import utils.Driver;

@CucumberOptions(
        features = {"src/test/java/features/_08_comparisonPage.feature"},
        glue = {"stepdefs"}
)
public class ComparisonPageRunner extends AbstractTestNGCucumberTests {
    @Parameters({"browser"})
    @BeforeMethod
    public void beforeMethod(Browser browser){

        Driver.getDriver(browser);

    }


    @AfterMethod
    public void afterMethod(){

        Driver.quitDriver();

    }
}