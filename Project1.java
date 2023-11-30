package package1;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.junit.Assert.assertEquals;

public class Project1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        // initialization
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        
        driver.get("https://www.saucedemo.com/");
        driver.manage().window();
        
//        driver.findElement(By.id("user-name")).sendKeys("standard_user");
//        driver.findElement(By.id("password")).sendKeys("secret_sauce");
//        driver.findElement(By.id("login-button")).click();
        
        //title check
        //type 1:
        
        String ExpectedTitle = "Swag Labs";
        String Actualtitle = driver.getTitle();
        System.out.println(Actualtitle);
        
        if(Actualtitle.equals(ExpectedTitle))
        {
        	System.out.println("Title Match");
        }
        else {
        	System.out.println("Title Doesn't match");
        }
        
        //type2:
        String ExpectedTitlee = "Swag Labs";
        String ActualTitle = driver.getTitle();
        assertEquals(ActualTitle,ExpectedTitlee);
    }

}
