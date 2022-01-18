import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty","html:target/homeRunner.html","rerun:target/rerun/homeRunner.txt"},
        features = "src/main/resources/features/home.feature",
        glue = {"steps"}
)
public class HomeRunner {
}
