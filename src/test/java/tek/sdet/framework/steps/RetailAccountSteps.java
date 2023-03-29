package tek.sdet.framework.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;
import tek.sdet.framework.utilities.DataGeneratorUtility;

public class RetailAccountSteps extends CommonUtility {
	POMFactory factory = new POMFactory();

	@When("User click on Account option")
	public void userClickOnAccountOption() {
		click(factory.homePage().accountOption);
		logger.info("user clicked on Account option");
	}

	@When("User update Name {string} and Phone {string}")
	public void userUpdateNameAndPhone(String nameValue, String phoneValue) {
		clearTextUsingSendKeys(factory.accountPage().ProfileNameInput);
		sendText(factory.accountPage().ProfileNameInput, nameValue);
		clearTextUsingSendKeys(factory.accountPage().ProfilePhoneNumberInput);
		sendText(factory.accountPage().ProfilePhoneNumberInput, phoneValue);
		logger.info("user updated Name and Phone values ");
	}

	@When("User click on Update button")
	public void userClickOnUpdateButton() {
		click(factory.accountPage().ProfileUpdateButton);
		logger.info("user clicked on Update button");
	}

	@Then("User profile information should be updated")
	public void userProfileInformationShouldBeUpdated() {
		waitTillPresence(factory.accountPage().personalInfoUpdateSuccessMessage);
		Assert.assertTrue(isElementDisplayed(factory.accountPage().personalInfoUpdateSuccessMessage));
		logger.info("user profile information updated");
	}

	@When("User click on add option of card section")
	public void userClickOnAddAPaymentMethodLink() {
	click(factory.accountPage().updatePaymentMethod);
	logger.info("User clicked on add a payment method link");

	    }

	@When("User fill Debit or Credit Card information")
	public void userFillDebitOrCreditCardInformation(DataTable dataTable) {
	List<Map<String, String>> cardPaymentUpdate = dataTable.asMaps(String.class, String.class);
	 sendText(factory.accountPage().cardNumberAddinput, cardPaymentUpdate.get(0).get("cardNumber"));
	 sendText(factory.accountPage().nameOnTheAddCard, cardPaymentUpdate.get(0).get("nameOnCard"));
	selectByVisibleText(factory.accountPage().expirationMonthAddCard, cardPaymentUpdate.get(0).get("expirationMonth"));
	 selectByVisibleText(factory.accountPage().expirationyearAddCard, cardPaymentUpdate.get(0).get("expirationYear"));
	 sendText(factory.accountPage().securityCodeInputAddCard, cardPaymentUpdate.get(0).get("securityCode"));
	logger.info("User fill Debit or credit card information");
	    }

	@When("user click on add Your Card button")
	public void userClickOnAddYourCardButton() {
		click(factory.accountPage().paymentSubmitBtnAddCard);
		logger.info("User clicked on add your card button");
	}

	@Then("Message should be displayed added card {string}")
	 public void aMessageShouldBeDisplayedAddedCard(String messageValue) {
	 waitTillPresence(factory.accountPage().paymentSuccessMessageAddCard);
	  Assert.assertEquals(messageValue,factory.accountPage().paymentSuccessMessageAddCard.getText());
	  logger.info("message was displayed" + messageValue);
	     }

	@When("User click on bank card")
	public void userClickOnMasterCard() {
	 click(factory.accountPage().masterCard);
	 logger.info("User clicked on masterCard");
	    }
	
	@And ("User click on Edit option of card section")
	public void UserClickOnEditOptionOfCardSection() {
	 click(factory.accountPage().cardEditButton);
	 logger.info("User click on Edit option of card section");
	 
	    }


	@When("user edit information with below data")
	public void userEditInformationWithBelowData(DataTable dataTable) {
	List<Map<String, String>> updateCardInformation = dataTable.asMaps(String.class, String.class);
	clearTextUsingSendKeys(factory.accountPage().cardNumberAddinput);
	 sendText(factory.accountPage().cardNumberAddinput, updateCardInformation.get(0).get("cardNumber"));
	 clearTextUsingSendKeys(factory.accountPage().nameOnTheAddCard);
	 sendText(factory.accountPage().nameOnTheAddCard, updateCardInformation.get(0).get("nameOnCard"));
	 selectByVisibleText(factory.accountPage().expirationMonthAddCard, updateCardInformation.get(0).get("expirationMonth"));
	 selectByVisibleText(factory.accountPage().expirationyearAddCard, updateCardInformation.get(0).get("expirationYear"));
	 clearTextUsingSendKeys(factory.accountPage().securityCodeInputAddCard);
 sendText(factory.accountPage().securityCodeInputAddCard, updateCardInformation.get(0).get("securityCode"));
 
	    }

	@When("User click on Update Your Card button")
	public void userClickOnUpdateYourCardButton() {
	 click(factory.accountPage().updateYourCardBtn);
	logger.info("user clicked on Update Your Card button");
	    }



	 @Then("a message should be displayed card edited {string}")
	public void messageShouldBeDisplayed(String updateMessageValue) {
	 waitTillPresence(factory.accountPage().paymentUpdatedSuccessfully);
	 Assert.assertEquals(updateMessageValue,factory.accountPage().paymentUpdatedSuccessfully.getText());
	 logger.info("A message was displayed" + updateMessageValue);

	 

	    }

	@When("User click on remove option of card section")
	 public void userClickOnRemoveOptionOfCardSection() {
	 click(factory.accountPage().removeCardBtn);
	logger.info("User clicked on remove option of card section");
	    }
	
	@Then("payment details should be removed")
	public void paymentDetailsShouldBeRemoved() {
	 Assert.assertTrue(isElementDisplayed(factory.accountPage().masterCard));
	 logger.info("payment details was removed"+isElementDisplayed(factory.accountPage().masterCard));  
	

	@When("User click on Add address option")
	public void userClickOnAddAddressOption() {
		click(factory.accountPage().addAddressOption);
		logger.info("user clicked on add address option");

	}

	@When("user fill new address form with below information")
	public void userFllNewAddressFormWithBelowInformation(DataTable dataTable) {
		List<List<String>> addressInfo = dataTable.asLists(String.class);
		selectByVisibleText(factory.accountPage().country, DataGeneratorUtility.data(addressInfo.get(0).get(0)));
		sendText(factory.accountPage().fullNameField, DataGeneratorUtility.data(addressInfo.get(0).get(1)));
		sendText(factory.accountPage().phoneNumberField, DataGeneratorUtility.data(addressInfo.get(0).get(2)));
		sendText(factory.accountPage().streetAddressField, DataGeneratorUtility.data(addressInfo.get(0).get(3)));
		sendText(factory.accountPage().apartmentNumber, DataGeneratorUtility.data(addressInfo.get(0).get(4)));
		sendText(factory.accountPage().cityField, DataGeneratorUtility.data(addressInfo.get(0).get(5)));
		selectByVisibleText(factory.accountPage().stateDropDown, DataGeneratorUtility.data(addressInfo.get(0).get(6)));
		sendText(factory.accountPage().zipCodeField, DataGeneratorUtility.data(addressInfo.get(0).get(7)));
		logger.info("user filled the new address form with information provided in data table");

	}

	@Then("A message should be displayed for added address {string}")
	public void MessageShouldBeDisplayed(String messageValue) {
		waitTillPresence(factory.accountPage().addressMessageSuccessfull);
		Assert.assertTrue(isElementDisplayed(factory.accountPage().addressMessageSuccessfull));
		logger.info("The successfull message was displayed" + messageValue);
	}

	@When("User click on edit address option")
	public void userClickOnEditAddressOption() {
		click(factory.accountPage().addressEditButton);
		logger.info("User clicked on edit address option");
	}

	@When("User click update Your Address button")
	 public void userClickUpdateYourAddressButton() {
	 click(factory.accountPage().addressEditUpdateButton);
	 logger.info("User clicked update Your Address button");
	 
	    }

	@Then("A message should be displayed for edit address {string}")
	public void AMessageShouldBeDisplayed(String string) {
	 waitTillPresence(factory.accountPage().addressEdtieddButtonMessageSuccessfull);
	 Assert.assertTrue(isElementDisplayed(factory.accountPage().addressEdtieddButtonMessageSuccessfull));
	logger.info("A message was displayed"+string);
	
	    }
	@When("User click on remove option of Address section")
	public void userClickOnRemoveOptionOfAddressSection() {
	 click(factory.accountPage().removeAddressButton);
	 logger.info("User clicked on remove option of Address section");

	    }
	 @Then("Address details should be removed")
	 public void addressDetailsShouldBeRemoved() {
	 waitTillPresence(factory.accountPage().addressValidationButton);
	 Assert.assertTrue(isElementDisplyed(factory.accountPage().addressValidationButton));
	 logger.info("Address details was removed");

}