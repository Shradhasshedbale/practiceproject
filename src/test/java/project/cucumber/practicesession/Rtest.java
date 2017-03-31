package project.cucumber.practicesession;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by SHRADHA on 10/02/2017.
 */

@RunWith(Cucumber.class)
@CucumberOptions(features = ".",tags = "@newtest",dryRun = false, strict = true)
public class Rtest {
}
