package com.stepDefinitionTestNG;

import com.base.DriverManager;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import com.context.TestContext;


public class Hooks{

    public Hooks() {}

    @Before
    public void setup() throws Exception {
        System.out.println("=============== I am in BEFORE ===============");
        // initialize driver and pages in TestContext
        DriverManager.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(2000);
        TestContext.initPages();
        System.out.println("Pages initialized in TestContext");
    }
    
    @After
    public void teardown() {
        System.out.println("=============== I am in after ===============");
        DriverManager.quitDriver();
       
    }
    
}
