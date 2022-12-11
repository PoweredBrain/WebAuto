package webAuto;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CreatePatient {
	public static WebDriver driver;

    public static String doctorLoginLink="/html/body/app-root/app-home-page/div/div/div/header[2]/div/div[4]/button";
    public static String mobileNumber="/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div/form/div[2]/input";
    public static String sendOTP="/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div/form/div[4]/button";
    public static String verifyOTP="/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[6]/button";
    public static String createPatient="createPatient";
    public static String Number1="/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[1]/form/div/div[1]/div[1]/mat-form-field[2]/div/div[1]/div/input";
    public static String confirm="/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[1]/form/div/div[1]/div[1]/div";
    public static String confirmPopup="//button[text()='Confirm']";
    public static String number2="/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[1]/form/div/div[1]/div[2]/mat-form-field[2]/div/div[1]/div/input";
    public static String firstName="/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[1]/form/div/div[4]/mat-form-field[1]/div/div[1]/div/input";
    public static String middleName="/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[1]/form/div/div[4]/mat-form-field[1]/div/div[1]/div/input";
    public static String lastName="/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[1]/form/div/div[4]/mat-form-field[3]/div/div[1]/div/input";
    public static String birthDate="/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[1]/form/div/div[5]/div[1]/mat-form-field[1]/div/div[1]/div[1]/input";
    public static String birthAge="//*[@id='mat-input-49']";
    public static String genFemale="//*[text()='Female']";
    public static String address="/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[1]/form/div/div[6]/mat-form-field[1]/div/div[1]/div/input";
    public static String locality="/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[1]/form/div/div[6]/mat-form-field[2]/div/div[1]/div/input";
    public static String city="/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[1]/form/div/div[6]/mat-form-field[3]/div/div[1]/div/input";
    public static String pinCode="/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[1]/form/div/div[7]/mat-form-field/div/div[1]/div/input";
    public static String Next="/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[1]/form/div/div[8]/button[2]";
    public static String proceedWithSameRMN="//*[text()='Proceed With same RMN']";
    public static String clickClose="/html/body/ngb-modal-window/div/div/div[1]/div/button";
    public static String selectDelivery="//*[@id='mat-select-44']";
    public static String normalDelivery="//*[text()='Normal']";
    public static String weight="//*[@id='mat-input-88']";
    public static String height="//*[@id='mat-input-89']";
    public static String HC="//*[@id='mat-input-90']";
    public static String CC="//*[@id='mat-input-91']";
    public static String BP="//*[@id='mat-input-92']";
    public static String BPdia="//*[@id='mat-input-93']";
    public static String vaccinationDate="//*[@id='mat-input-94']";
    public static String bloodGrp="//*[@id='mat-input-95']";
    public static String bloodGrpOplus="//*[text()='O+']";
    public static String antentalNext="//*[@id='cdk-step-content-0-1']/form/div[2]/div[8]/button[2]";
    public static String medicalConditions="//*[@id='mat-input-137']";
    public static String allergies="//*[@id='mat-input-138']";
    public static String reactionToDrugs="//*[@id='mat-input-139']";
    public static String recurringComplaints="//*[@id='mat-input-140']";
    public static String hospitalization="//*[@id='mat-input-141']";
    public static String healthHistory="//*[@id='mat-input-142']";
    public static String emailID="//*[@id='mat-input-143']";
    public static String UHID="//*[@id='mat-input-144']";
    public static String geneticDisorder="//*[@id='mat-input-144']";
    public static String healthNext="//*[@id='cdk-step-content-0-2']/form/div[2]/div[6]/button[2]";
    public static String fatherHeightFt="//*[@id='mat-input-175']";
    public static String fatherHeightinch="//*[@id='mat-input-176']";
    public static String motherHeightFt="//*[@id='mat-input-177']";
    public static String motherHeightinch="//*[@id='mat-input-178']";
    public static String familyNext="//*[@id='cdk-step-content-0-3']/div[2]/div[5]/button[2]";
    public static String success="//*[text()='Success']";
    public static String welcomeUser="//*[text()='Success']";
  //*[text()='Done']
   
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
        

}






