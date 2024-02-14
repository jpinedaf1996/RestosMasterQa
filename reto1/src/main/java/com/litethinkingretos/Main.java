package com.litethinkingretos;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        String page = "https://demoblaze.com/";
        WebDriver driver = new ChromeDriver();
        ReToHome Home =  new ReToHome();
        Find target = new Find();

        driver.get(page);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        
        target.FindTarget(driver,"HTC One M9");
        int HtcOneprecio = target.FindPrice(driver, "h3.price-container", 1, 4);

        Home.returnToHome(driver);

        target.FindTarget(driver,"Laptops"); 
        target.FindTarget(driver,"MacBook Pro");
        int MacBookProprice = target.FindPrice(driver, "h3.price-container", 1, 5);

        Home.returnToHome(driver);
        //Dell i7 8gb
        target.FindTarget(driver,"Laptops"); 
        target.FindTarget(driver,"Dell i7 8gb");
        int Dellprice= target.FindPrice(driver, "h3.price-container", 1, 4);

        Home.returnToHome(driver);

        target.FindTarget(driver,"Monitors"); 
        target.FindTarget(driver,"ASUS Full HD");
        int Asusprice= target.FindPrice(driver, "h3.price-container", 1, 4);

        Home.returnToHome(driver);

        if (HtcOneprecio == 700) {
            System.out.println("Precio correto! HTC One M9: $"+HtcOneprecio);
            
        }
        if (MacBookProprice == 1100) {
            System.out.println("Precio correto! MacBook Pro: $"+MacBookProprice);
            
        }
        if (Dellprice == 700) {
            System.out.println("Precio correto! Dell i7 8gb: $"+Dellprice);
            
        }
        if (Asusprice == 230) {
            System.out.println("Precio correto! ASUS Full HD: $"+Asusprice);
            
        }
        
        System.out.println("Test Finalizado exitosamente!");
        driver.quit();
        


        //WebElement menu = driver.findElement(By.linkText("Laptops"));
      
        //WebElement menu = driver.findElement(By.linkText("Laptops"));
        //menu.click();
/* 
        List<WebElement> nombres = driver.findElements(By.cssSelector(".card-block"));
         

        List<WebElement> nombres2 = driver.findElements(By.cssSelector(".card-block"));

        List<List<?>> arrayDeListas = new ArrayList<>();
            arrayDeListas.add(nombres);
            arrayDeListas.add(nombres2);

        System.out.println(arrayDeListas);
*/
        
/*  
        driver.quit();for (WebElement elemento : nombres) {
            
            String title = elemento.findElement(By.className("card-title")).getText();

            
            
            switch (title) {
                case "HTC One M9":
                    System.out.println(elemento.findElement(By.tagName("h5")).getText());
                    continue;
                case "MacBook air":
                    System.out.println(elemento.findElement(By.tagName("h5")).getText());
                    break;
            
                default:
                    break;
            }

            

            //System.out.println(title);
            
        }
*/

    }
  
}


