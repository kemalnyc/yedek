package javat;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features/loyalty_cards",
        glue = "loyalty_cards")
 public class SuperSmoothieProgramTestSuite {
}
