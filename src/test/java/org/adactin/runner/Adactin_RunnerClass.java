package org.adactin.runner;

import java.time.Duration;

import org.base.base_class1;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\org\\adactin\\feature\\Adactin.feature" , 
glue = "org.adactin.stepdefinition",
monochrome = true,
dryRun = false,
publish = true,

plugin = {"html:Report/rep.html","pretty"})

	

public class Adactin_RunnerClass {

	public static WebDriver driver;
	@BeforeClass
	public static void start() {
    driver = base_class1.Browser_Launch("chrome");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}

    @AfterClass
    public static void end() {
    driver.close();
	}

    



}
