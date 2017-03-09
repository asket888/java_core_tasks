package add_to_card;

import test.BaseDriver;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        plugin = {"pretty", "json:target/Cucumber.json",
                "html:target/cucumber-html-report"
        }
)

public class AddToCardTest {

    @BeforeClass
    public static void initSelenium(){
        BaseDriver.init();
    }
    @AfterClass
    public static void closeSelenium(){
        BaseDriver.close();
    }

}
