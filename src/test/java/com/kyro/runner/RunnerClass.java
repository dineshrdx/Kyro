package com.kyro.runner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;


import com.kyro.properties.FileReadManager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import kyroBaseClass.org.BaseClass;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\kyro\\feauture",
glue = "com.kyro.stepdefinition",
monochrome = true,
dryRun = false,
strict = true,
tags = "@smokeTest,@sanityTest,@regressionTest",
plugin = {"html:Report/Htmlreport",
		"pretty",
		"json:Report/Jsonreport.json",
		"com.cucumber.listener.ExtentCucumberFormatter:Extentfolder/Extentreport.html"
})
public class RunnerClass {
	public static WebDriver driver;
	@BeforeClass
	public static void setUp() throws IOException {
		String browser=FileReadManager.getinstance().getinstanceCR().getBrowser();
		driver=BaseClass.getBrowser(browser);
	
	}
	

	@AfterClass
	public static void turnDown() {
		
		driver.close();

	}
	

}
