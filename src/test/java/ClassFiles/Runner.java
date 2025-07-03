package ClassFiles;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		tags="@logo",
		features="src/test/java/one/one.feature",
		glue="ClassFiles",
		plugin={"pretty", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"}
		)
public class Runner extends AbstractTestNGCucumberTests {

}
