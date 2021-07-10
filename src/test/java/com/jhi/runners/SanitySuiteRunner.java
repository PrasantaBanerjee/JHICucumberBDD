package com.jhi.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resources/features" }, glue = { "com/jhi/step_def" , "com/jhi/hooks"}, tags = "@Sanity")
public class SanitySuiteRunner {

}
