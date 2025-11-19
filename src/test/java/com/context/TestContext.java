package com.context;

import com.pages.*;
import com.base.DriverManager;

public class TestContext {
	
    public static LoginPage login;

    public static void initPages() {
        // ensure driver is initialized
        DriverManager.getDriver();
        login = new LoginPage();
    }
}
