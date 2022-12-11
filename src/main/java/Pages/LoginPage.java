package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;
import Helper.CommonFunctions;

public class LoginPage extends TestBase {

    CommonFunctions cf;
    @FindBy(xpath = "/html/body/app-root/app-home-page/div/div/div/header[2]/div/div[4]/button")
    WebElement doctorLoginLink;

    @FindBy(xpath = "/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div/form/div[2]/input")
    WebElement mobileNumber;

    @FindBy(xpath = "/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div/form/div[4]/button")
    WebElement sendOTP;

    @FindBy(xpath = "/html/body/app-root/app-home-page/div/div/div/header[2]/div/div[4]/button")
    WebElement enterOTP;

    @FindBy(xpath = "/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[6]/button")
    WebElement verifyOTP;
    
    @FindBy(xpath = "/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div/form/div[3]/div")
    WebElement validationMsg;

    public LoginPage() throws IOException {
	PageFactory.initElements(driver, this);
	cf = new CommonFunctions(driver);
    }

    public String validateLoginPageTitle() {
	return driver.getTitle();
    }

    public String getValidationMsg() {
   	return validationMsg.getText();
       }

    public void clickOnDoctorLink() {
	
	cf.waitForElement(doctorLoginLink);
	cf.highlightElement(doctorLoginLink);
	cf.clickUsingJavaScript(doctorLoginLink);
	//doctorLoginLink.click();
    }
    
    public void enterMobileNumber(String number) {
   	cf.waitForElement(mobileNumber);
   	cf.highlightElement(mobileNumber);
   	mobileNumber.sendKeys(number);
       }
    
    public void sendOTP() {
   	cf.waitForElement(sendOTP);
   	cf.highlightElement(sendOTP);
   	cf.clickUsingJavaScript(sendOTP);
       }
    
    public void verifyOtp() {
   	cf.waitForElement(verifyOTP);
   	cf.highlightElement(verifyOTP);
   	cf.clickUsingJavaScript(verifyOTP);
       }
}
