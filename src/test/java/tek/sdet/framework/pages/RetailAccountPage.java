package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailAccountPage extends BaseSetup {

		public RetailAccountPage () {
			PageFactory.initElements(getDriver(), this);
		}
		@FindBy(xpath= "//img[@id='profileImage']")
		public WebElement profileImage;
		
		@FindBy(id = "nameInput")
		public WebElement ProfileNameInput;
		
		@FindBy(id= "personalPhoneInput")
		public WebElement ProfilePhoneNumberInput;
		
		@FindBy(id= "emailInput")
		public WebElement ProfileEmailInput;
		
		@FindBy(xpath="//button[@id='personalUpdateBtn']")
		public WebElement ProfileUpdateButton;
		
		@FindBy(xpath="//body/div[@id='root']/div[2]")
		public WebElement personalInfoUpdateSuccessMessage;


		
		
		
}
