package com.litethinkingretos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Find {

    public  void FindTarget(WebDriver driver,String target){
        WebElement element = driver.findElement(By.linkText(target));
        element.click(); 
    }

    public  int FindPrice(WebDriver driver,String cssClass,int star,int end){
        
        WebElement Price = driver.findElement(By.cssSelector(cssClass));
        int PriceProduct = Integer.parseInt(Price.getText().substring(star, end));

        return PriceProduct;
    }
    
}
