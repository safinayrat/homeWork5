package com.safin;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com.safin",
        tags = "@all"
)
public class RunnerTest extends AbstractTestNGCucumberTests {
}
