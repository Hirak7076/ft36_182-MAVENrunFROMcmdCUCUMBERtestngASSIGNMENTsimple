package SIMPLErunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = "C:\\Users\\User\\Documents\\workspace-spring-tool-suite-4-4.23.1.RELEASE\\MAVENrunFROMcmdCUCUMBERtestngASSIGNMENTsimple\\src\\test\\resources\\SIMPLEfeature\\SIMPLE.feature",
		glue = "SIMPLEsteps"
		
		)

public class Runner extends AbstractTestNGCucumberTests {

}
