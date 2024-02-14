package com.litethinkingretos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class ReToHome {

    public void returnToHome(WebDriver driver){
        WebElement btnHome = driver.findElement(By.xpath("//*[@id='navbarExample']/ul/li[1]/a"));
        btnHome.click();
    }
    
}