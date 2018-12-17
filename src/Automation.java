import java.io.File;
import java.io.IOException;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Automation {
	
	public static void main(String[] args) throws IOException, InterruptedException{
		
		System.setProperty("webdriver.gecko.driver", ""); //put location of geckodriver here


        //This creates an dynamic firefox object (an instance of firefox)
		WebDriver driver = new FirefoxDriver(); 
		
        //Now we can go to a specific url 
        driver.get("http://app.testudo.umd.edu/main/schedule");
        
        WebElement username = driver.findElement(By.name("j_username"));
        WebElement password = driver.findElement(By.name("j_password"));
        WebElement submit = driver.findElement(By.name("_eventId_proceed"));
        
        	username.sendKeys(""); // enter username here
        	password.sendKeys(""); // enter password here
        	submit.click();
        	
        	Thread.sleep(10000);
        	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);  
        FileUtils.copyFile(scrFile, new File(""));
        	
        
        
        

        //Close the instance of browser
        driver.close();    
    }

}
