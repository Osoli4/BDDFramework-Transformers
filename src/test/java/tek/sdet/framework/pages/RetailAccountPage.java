package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tek.sdet.framework.base.BaseSetup;

public class RetailAccountPage extends BaseSetup {

	public RetailAccountPage() {
		PageFactory.initElements(getDriver(), this);
	}

	// UpdatingProfileElements
	@FindBy(xpath = "//img[@id='profileImage']")
	public WebElement profileImage;

	@FindBy(id = "nameInput")
	public WebElement ProfileNameInput;

	@FindBy(id = "personalPhoneInput")
	public WebElement ProfilePhoneNumberInput;

	@FindBy(id = "emailInput")
	public WebElement ProfileEmailInput;

	@FindBy(xpath = "//button[@id='personalUpdateBtn']")
	public WebElement ProfileUpdateButton;

	@FindBy(xpath = "//body/div[@id='root']/div[2]")
	public WebElement personalInfoUpdateSuccessMessage;

	// Thses below codes are for adding address to the retail app
	// @FindBy(xpath ="div{@class = 'account__address-new']")
	// @FindBy(xpath ="//p[contains(text(),'Add Address')]")
	// public WebElement addAddressOption;

	// Adding address web elements
	@FindBy(xpath = "//div[@class='account__address-new']")
	public WebElement addAddressOption;

	@FindBy(xpath = "//select[@id='countryDropdown']")
	public WebElement country;

	@FindBy(id = "fullNameInput")
	public WebElement fullNameField;

	@FindBy(id = "phoneNumberInput")
	public WebElement phoneNumberField;

	@FindBy(id = "streetInput")
	public WebElement streetAddressField;

	@FindBy(xpath = "//input[@id='apartmentInput']")
	public WebElement apartmentNumber;

	@FindBy(id = "cityInput")
	public WebElement cityField;

	@FindBy(xpath = "(//select[@class='account__address-new-dropdown'])[2]")
	public WebElement stateDropDown;

	@FindBy(id = "zipCodeInput")
	public WebElement zipCodeField;

	@FindBy(id = "addressBtn")
	public WebElement addYourAddressButton;

	@FindBy(xpath = "//div[contains(text(),'Address Added Successfully')]")
	public WebElement addressMessageSuccessfull;

	// Editing previous address web elements
	@FindBy(xpath = "//button[@class='account__address-btn'][1]")
	public WebElement addressEditButton;

	@FindBy(xpath = "//div[contains(text(),'Address Updated Successfully')]")
	public WebElement addressEdtieddButtonMessageSuccessfull;

	@FindBy(xpath = "//input[@value='Anna Daive']")
	public WebElement editAddressNameInput;

	@FindBy(xpath = "//input[@value='7038998850']")
	public WebElement addressEditPhoneInput;

	@FindBy(xpath = "//input[@value='4654 Chantilly BLVD']")
	public WebElement addressStreetEditInput;

	@FindBy(xpath = "//button[@id='addressBtn']")
	public WebElement addressEditUpdateButton;

	// Editing Debit card/credit card elements
	@FindBy(xpath = "//p[contains(text(),'Add a payment method')]")
	public WebElement updatePaymentMethod;

	@FindBy(xpath = "//input[@id='cardNumberInput']")
	public WebElement cardNumberAddinput;

	@FindBy(xpath = "//input[@id='nameOnCardInput']")
	public WebElement nameOnTheAddCard;

	@FindBy(xpath = "//select[@id='expirationMonthInput']")
	public WebElement expirationMonthAddCard;

	@FindBy(xpath = "//select[@id='expirationYearInput']")
	public WebElement expirationyearAddCard;

	@FindBy(css = " #securityCodeInput")
	public WebElement securityCodeInputAddCard;

	@FindBy(xpath = "//button[@id='paymentSubmitBtn']")
	public WebElement paymentSubmitBtnAddCard;

	@FindBy(xpath = "//div[contains(text(),'Payment Method added sucessfully')]")
	public WebElement paymentSuccessMessageAddCard;

	@FindBy(xpath = "//img[@src='/images/master_card.png'][1]")
	public WebElement masterCard;

	@FindBy(xpath = "//button[contains(text(),'Edit')]")
	public WebElement cardEditBtn;

	@FindBy(xpath = "//button[@class='text-blue-800 cursor-pointer hover:underline'][1]")
	public WebElement cardEditButton;

	@FindBy(xpath = "//button[@id='paymentSubmitBtn']")
	public WebElement updateYourCardBtn;

	@FindBy(xpath = "//div[text()='Payment Method updated Successfully']")
	public WebElement paymentUpdatedSuccessfully;

	// RemovingPaymentCard
	@FindBy(xpath = "//button[contains(text(),'remove')]")
	public WebElement removeCardBtn;

}
