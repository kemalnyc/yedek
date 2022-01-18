import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class CalculatorTest {
    @CucumberOptions (plugin= {"pretty"},
            glue = "src/test/java/CalculatorStepDefinitions.java",
            features = "src/main/resources/features")
    public class AcceptanceTestSuit{}

}
