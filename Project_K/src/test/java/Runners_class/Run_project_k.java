package Runners_class;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "//Project_K//src//test//java//Features", glue = "//Project_K//src//test//java//Step_definations")
public class Run_project_k {

}
