package package1;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.junit.Assert.assertEquals;

public class addtocart {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        // initialization
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        
        driver.get("https://www.saucedemo.com/");
        driver.manage().window();
        
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        
        //relative path
        driver.findElement(By.xpath("//button[@id = 'add-to-cart-sauce-labs-backpack']")).click();
        
        //absolute path
        //driver.findElement(By.xpath("html/body/form/div/div/div[2]/div/div/div/div/div[2]/div[2]/button")).click();
        
        //absolute path
        driver.findElement(By.cssSelector("button#add-to-cart-sauce-labs-bike-light")).click();
        
    }

}