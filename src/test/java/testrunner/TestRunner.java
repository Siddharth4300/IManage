/**
 * 
 */
package testrunner;

import org.junit.runner.RunWith;

import utils.SeleniumSupport;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



/**
 * @author siddharth.patil
 *
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resources/features/ImanageLogin.feature" }, glue = "stepDefs", monochrome = true, strict = true)
public class TestRunner extends SeleniumSupport {

}
