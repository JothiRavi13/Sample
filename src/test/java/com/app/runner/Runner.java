package com.app.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\HP\\eclipse-workspace\\CucumberSample\\"
		+ "src\\test\\java\\com\\app\\featurefile",
		glue="com.app.stepdefenition",dryRun=true,
		publish=true,
		monochrome=true,
		tags="@asForm")
public class Runner {

}
