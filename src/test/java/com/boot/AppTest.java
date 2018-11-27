package com.boot;

import static org.junit.Assert.assertEquals;

import com.boot.controller.HomeController;
import org.junit.Test;


public class AppTest 
{

    @Test
    public void testApp()
    {
        HomeController homeController = new HomeController();
        String result = homeController.home();
        assertEquals( result, "Das Boot, reporting for duty!");
    }
}
