package com.automation_maven_project.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.automation_maven_project.baseclass.Base_Class;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\automation_maven_project\\feature",
                 glue = "com.automation_maven_project.stepdefinition",
                 monochrome = true,dryRun = false,strict = true)

public class Runner {
	public static WebDriver driver;
	@BeforeClass
	public static void setUp() {
		driver= Base_Class.getBrowser("chrome browser");
	}
	@AfterClass
	public static void tearDown() {
		Base_Class.close();
	}

}
