package webAuto;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class EndToEndTest {
    public static WebDriver driver;
   public static String aboutUs="//*[text()='about us']";
    public static String doctorLoginLink="/html/body/app-root/app-home-page/div/div/div/header[2]/div/div[4]/button";
    public static String mobileNumber="/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div/form/div[2]/input";
    public static String sendOTP="/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div/form/div[4]/button";
    
    
     

     public static void clickUsingJavaScript(By by) {
	
	 JavascriptExecutor js= (JavascriptExecutor)driver;
	 js.executeScript("arguments[0].click();", driver.findElement(by));
     }
     
     public static void highlightElement(By by) {
	 JavascriptExecutor js= (JavascriptExecutor)driver;
	 js.executeScript("arguments[0].setAttribute('style', 'background: pink; border: 2px solid red;');", driver.findElement(by));
     }
     @BeforeClass
     public void setUp() {
 	
 	
     }
     
     @Test(priority=0)
 	public  void clickDoctorLoginLink() {
 	
 	//waitForVisibilityOf(By.xpath(doctorLoginLink));
 	//highlightElement(By.xpath(doctorLoginLink));
 	//clickUsingJavaScript(By.xpath(doctorLoginLink));
	 driver.findElement(By.xpath(aboutUs)).click();;
 	
	 
 	}
     
     @Test(priority=1)
   	public  void enterMobileNumber() {
   	//waitForVisibilityOf(By.xpath(mobileNumber));
   	//highlightElement(By.xpath(mobileNumber));
   	
   	//  driver.findElement(By.xpath(mobileNumber)).sendKeys("9665002440");
   	}
     
     @Test(priority=2)
	public  void clickSendOTP() {
	//waitForVisibilityOf(By.xpath(sendOTP));
	//highlightElement(By.xpath(sendOTP));
	//clickUsingJavaScript(By.xpath(sendOTP));
	//  driver.findElement(By.xpath(sendOTP)).click();
	}
    
       
     @AfterClass
     public void close() throws IOException {

 	// driver.quit();
 	//Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
     }
}
