package package1;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.junit.Assert.assertEquals;

public class assigment1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        // initialization
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        
        driver.get("https://www.saucedemo.com/");
        driver.manage().window();
              
        //URL Link check
        //type 1:
        
        String ExpectedURL = "https://www.saucedemo.com/";
        String ActualURL = driver.getTitle();
        System.out.println(ActualURL);
        
        if(ActualURL.equals(ExpectedURL))
        {
        	System.out.println("URL Match");
        }
        else {
        	System.out.println("URL Doesn't match");
        }
        
        //type2:
        String ExpectedURLlink = "https://www.saucedemo.com/";
        String ActualURLlink = driver.getTitle();
        assertEquals(ActualURLlink,ExpectedURLlink);
    }

}

