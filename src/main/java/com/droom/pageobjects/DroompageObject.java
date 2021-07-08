package com.droom.pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import config.DefineConstants;
import helperMethods.DropDown;
import helperMethods.JavascriptClick;
import helperMethods.Keyboard;
import helperMethods.Log;
import helperMethods.Screenshots;
import helperMethods.ScrollTypes;
import helperMethods.SwitchWindow;
import helperMethods.WaitTypes;

public class DroompageObject {
	private WebDriver driver;
	private WaitTypes applyWait;
	private ExtentTest test;
	private SwitchWindow switchToWindow;
	private Keyboard keyboard;
	private ScrollTypes scrolltype;
	private DropDown dropdown;
	JavascriptClick jsClick;

	public DroompageObject(WebDriver driver, ExtentTest test) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.applyWait = new WaitTypes(driver);
		this.test = test;
		new JavascriptClick(driver);
		switchToWindow = new SwitchWindow(driver);
		keyboard = new Keyboard();
		scrolltype = new ScrollTypes(driver);
		dropdown = new DropDown(driver);
		jsClick = new JavascriptClick(driver);

	}

	@FindBy(xpath = "//button[contains(text(),'Continue ')]")
	private WebElement Continue_btn;

	@FindBy(id = "mobile_phone")
	private WebElement phone_textBox;

	@FindBy(id = "otpTimer")
	private WebElement continueBtnBefore_otp;

	@FindBy(xpath = "//div[@class='toast-message']")
	private WebElement otp_sentTextMsg;

	@FindBy(id = "digit-1")
	private WebElement otpDigit_1;

	@FindBy(id = "digit-2")
	private WebElement otpDigit_2;

	@FindBy(id = "digit-3")
	private WebElement otpDigit_3;

	@FindBy(id = "digit-4")
	private WebElement otpDigit_4;

	@FindBy(xpath = "//button[contains(@class,'seller_setting_submit')]")
	private WebElement prferencesNext_btn;

	@FindBy(xpath = "(//*[@class='owl-item cloned']//../button)[3]")
	private WebElement getStarted_btn;

	@FindBy(id = "first_name")
	private WebElement firstName_textBox;

	@FindBy(id = "last_name")
	private WebElement lastName_textBox;

	@FindBy(id = "email")
	private WebElement email_textBox;

	@FindBy(xpath = "//button[contains(@class,'basic_details')]")
	private WebElement basicDetailContinue_btn;

	@FindBy(xpath = "//div[text()='Car']")
	private WebElement vehicle_Icon;

	@FindBy(xpath = "//label[@for='req_new']")
	private WebElement vehicle_conditionType;

	@FindBy(xpath = "//*[@id='location_div']/input")
	// div[@id='pro_seller_city']
	//*[@placeholder='Enter Your City']
	//*[@id='location_div']
	private WebElement location_DropDown;

	@FindBy(xpath = "//*[@id='pro_seller_city']/div[2]/div[4]/ul/li[1]")
	private WebElement locationCity_value;

	@FindBy(xpath = "//button[contains(@class,'category-submit')]")
	private WebElement locationNext_btn;

	@FindBy(id = "company_name")
	private WebElement dealershipName_textBox;

	@FindBy(id = "how_long_in_business")
	private WebElement businessEstablished_dropDown; // select class

	@FindBy(id = "number_of_employess")
	private WebElement number_of_employess_textBox;

	@FindBy(xpath = "//input[@placeholder='Ex - Cars24']")
	private WebElement companiesWorkWith_textBox;

	@FindBy(xpath = "//label[@for='car-dekho']")
	private WebElement companiesWorkWith_value;

	@FindBy(xpath = "//button[contains(@class,'showroom-submit')]")
	private WebElement showroomNext_btn;

	@FindBy(xpath = "//div[contains(text(),'Cash')]")
	private WebElement payment_option;

	@FindBy(xpath = "//input[@placeholder='Ex - Monday']")
	private WebElement availableDay_dropDwn;

	@FindBy(xpath = "//label[contains(text(),'Tuesday')]")
	private WebElement availableDay_dropDwnValue;

	@FindBy(xpath = "//input[@placeholder='Ex-9 AM to 6 PM']")
	private WebElement availableTime_dropDwn;

	@FindBy(xpath = "//label[contains(text(),'9 AM to Noon')]")
	private WebElement availableTime_dropDwnValue;

	@FindBy(xpath = "//label[@for='opt_4891']")
	private WebElement differentTimeSlot_option;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement preferenceNext_btn;

	@FindBy(xpath = "//span[contains(text(),'KYC Details')]/parent::div/label/span[2]")
	private WebElement kycDetail_btn;

	@FindBy(id = "zip")
	private WebElement kycPinCode_textBox;

	@FindBy(id = "city")
	private WebElement kycCity_dropDown;

	@FindBy(id = "location")
	private WebElement kycArea_dropDown;

	@FindBy(id = "address")
	private WebElement kycdetailAdress_textBox;

	@FindBy(id = "pan_number")
	private WebElement kycPanNumber_textBox;

	@FindBy(id = "aadhar_number")
	private WebElement kycaadharNumber_textBox;

	@FindBy(id = "gst_number")
	private WebElement kycgstNumber_textBox;

	@FindBy(id = "OpenImgUpload")
	private WebElement kycGstDocument_upload;

	@FindBy(id = "kyc_submit")
	private WebElement kycNext_btn;

	@FindBy(xpath = "//span[contains(text(),'Lead Packages')]/parent::div/label/span[2]")
	private WebElement leadPakages_btn;

	@FindBy(xpath = "//span[contains(text(),'₹20,000')]")
	private WebElement leadPakages_amount;

	@FindBy(xpath = "//span[contains(text(),'Seller Packages')]")
	private WebElement pkg_text;

	@FindBy(xpath = "//span[contains(text(),'Visibility Packages')]/parent::div/label/span[2]")
	private WebElement visibilityPakages_btn;

	@FindBy(xpath = "//*[contains(text(),'Active')]/parent::figure/ul[1]//div/input")
	private WebElement visibilityPakagesActiveAmount_checkBox;

	@FindBy(id = "txt_rupees")
	private WebElement leadPakagesPay_btn;

	// Payment Page

	@FindBy(xpath = "//label[contains(text(),'Credit Card')]/parent::a/label")
	private WebElement crediCardOnPaymentPage;
	
	

	@FindBy(xpath = "//button[contains(text(),'Continue to Pay  ₹ ')]")
	private WebElement continueBtnOnPaymentPage;

	
	@FindBy(xpath = "//input[@name='paymode']")
	private WebElement PaymentMode_radioBtn;

	@FindBy(xpath = "//input[@type='tel'and contains(@class,'cardNo input')]")
	private WebElement creditCardNumber_textBox;

	@FindBy(xpath = "//input[@placeholder='MM']")
	private WebElement creditCardExpiaryMonth_textBox;

	@FindBy(xpath = "//input[@placeholder='YY']")
	private WebElement creditCardExpiaryYear_textBox;

	@FindBy(xpath = "//input[@type='password']")
	private WebElement creditCardCVVNumber_textBox;

	@FindBy(xpath = "//span[contains(text(),'PAY')]")
	private WebElement finalAmtPay_Btn;
	
//NetBanking Card Option
	@FindBy(xpath = "(//label[contains(text(),'Net Banking')])[1]")
	private WebElement netBankingOptionOnPaymentPage;
	
	@FindBy(xpath = "//div[contains(text(),'Visa, MasterCard, RuPay & More')]")
	private WebElement netBankingOptionCreditCard;
	
	@FindBy(id = "tab-title")
	private WebElement netBankingBack_btn;
	
	@FindBy(id = "card_number")
	private WebElement netBankingCardNumber_textBox;
	
	@FindBy(id = "card_expiry")
	private WebElement netBankingCardExpiry_textBox;
	
	@FindBy(id = "card_name")
	private WebElement netBankingCardHolderName_textBox;
	
	@FindBy(id = "card_cvv")
	private WebElement netBankingCardCVVNumber_textBox;
	
	@FindBy(id = "should-save-card")
	private WebElement netBankingRemember_checkBox;
	
	@FindBy(id = "footer-cta")
	private WebElement netBankingPayBtn;
	
	@FindBy(xpath ="//button[contains(text(),'Success')]")
	private WebElement successBtn;
	
	@FindBy(xpath ="//button[contains(text(),'Failure')]")
	private WebElement failureBtn;
	
	
	
	SoftAssert softAssert = new SoftAssert();

	public void getPakageDeatils() throws InterruptedException {

		applyWait.waitForElementToBeClickable(leadPakages_btn, DefineConstants.explicitWait_30);
		// leadPakages_btn.click();

		softAssert.assertEquals(pkg_text.getText(), DefineConstants.verify_PackageText);
		jsClick.click(leadPakages_btn);
		test.log(Status.INFO, "lead package selected ");
		Log.info("lead package selected");

		applyWait.waitForElementToBeClickable(leadPakages_amount, DefineConstants.explicitWait_30);
		leadPakages_amount.click();
		test.log(Status.INFO, "lead package amount selected ");
		Log.info("lead package amount selected");

		leadPakages_btn.click();

		scrolltype.scrollByParameter(0, 300);
		applyWait.waitForElementToBeClickable(visibilityPakages_btn, DefineConstants.explicitWait_30);
		// visibilityPakages_btn.click();
		jsClick.click(visibilityPakages_btn);
		test.log(Status.INFO, "visibility package selected ");
		Log.info("visibility package selected");

		applyWait.waitForElementToBeClickable(visibilityPakagesActiveAmount_checkBox, DefineConstants.explicitWait_30);
		// scrolltype.scrollInToView(visibilityPakagesActiveAmount_checkBox);
		visibilityPakagesActiveAmount_checkBox.click();
		test.log(Status.INFO, "visibility package active amount checkbox selected ");
		Log.info("visibility package active amount checkbox selected");

		leadPakagesPay_btn.click();
		test.log(Status.INFO, "Pay button clicked ");
		Log.info("Pay button clicked");
		softAssert.assertAll();

	}

	public void enterKyCDetails(String pinCode, String area, String address, String panCard, String adharCard,
			String gstNumber, String kycDocument) throws InterruptedException {
		applyWait.waitForElementToBeClickable(kycDetail_btn, DefineConstants.explicitWait_30);
		jsClick.click(kycDetail_btn);
		// kycDetail_btn.click();
		test.log(Status.INFO, "Kyc detail button clicked");
		Log.info("Kyc detail button clicked");

		// kycDetail_btn.click();
		kycPinCode_textBox.sendKeys(pinCode);
		test.log(Status.INFO, "Pincode entered");
		Log.info("Pincode entered");

		Keyboard.pressTab();
		Thread.sleep(3000);
		dropdown.selectByVisibleText(kycArea_dropDown, area);

		test.log(Status.INFO, "Area selected");
		Log.info("Area selected");
		kycdetailAdress_textBox.sendKeys(address);

		test.log(Status.INFO, "Adress entered");
		Log.info("Address entered");

		kycPanNumber_textBox.sendKeys(panCard);

		test.log(Status.INFO, "Pancard number entered");
		Log.info("Pancard number entered");

		kycaadharNumber_textBox.sendKeys(adharCard);
		test.log(Status.INFO, "Adhar number entered");
		Log.info("Adhar number entered");

		kycgstNumber_textBox.sendKeys(gstNumber);
		test.log(Status.INFO, "GST number entered");
		Log.info("GST number entered");

		kycGstDocument_upload.sendKeys(kycDocument);

		test.log(Status.INFO, "GST document uploaded");
		Log.info("GST document uploaded");
		kycNext_btn.click();
		test.log(Status.INFO, "User clicked Kyc Next button");
		Log.info("User clicked Kyc Next button");

	}

	public void enterOtp(String mobileNumber) throws InterruptedException {
		applyWait.waitforElementToBeDisplayed(Continue_btn, DefineConstants.explicitWait_30);
		Continue_btn.click();

		test.log(Status.INFO, "User clicked on Continue button");
		Log.info("User clicked on Continue button");

		applyWait.waitforElementToBeDisplayed(phone_textBox, DefineConstants.explicitWait_30);
		phone_textBox.sendKeys(mobileNumber);
		test.log(Status.INFO, "User entered Mobile number");
		Log.info("User entered Mobile number");

		continueBtnBefore_otp.click();
		test.log(Status.INFO, "User clicked on Continue button");
		Log.info("User clicked on Continue button");

		applyWait.waitforElementToBeDisplayed(otp_sentTextMsg, DefineConstants.explicitWait_30);
		String otpTextMsg = otp_sentTextMsg.getText();
		softAssert.assertEquals(otpTextMsg, "OTP sent");
		softAssert.assertAll();
		Thread.sleep(25000);
	}

	public void enterBasicDetails(String fname, String lname, String email) {
		applyWait.waitforElementToBeDisplayed(getStarted_btn, DefineConstants.explicitWait_30);
		jsClick.click(getStarted_btn);
		// getStarted_btn.click();
		test.log(Status.INFO, "Get Started button clicked");
		Log.info("Get Started button clicked");

		/*
		 * continueBtnBefore_otp.click(); test.log(Status.INFO,
		 * "Continue button clicked"); Log.info("Continue button clicked");
		 */
		firstName_textBox.sendKeys(fname);
		test.log(Status.INFO, "first name entered");
		Log.info("first name entered");

		lastName_textBox.sendKeys(lname);
		test.log(Status.INFO, "last name entered");
		Log.info("last name entered");

		email_textBox.sendKeys(email);
		test.log(Status.INFO, "email_id  entered");
		Log.info("email_id entered");

		basicDetailContinue_btn.click();
		test.log(Status.INFO, "continue button on basic detail page clicked");
		Log.info("continue button on basic detail page clicked");

	}

	public void enterVehicleDetails() throws Exception {
		applyWait.waitforElementToBeDisplayed(vehicle_Icon, DefineConstants.explicitWait_30);
		vehicle_Icon.click();
		test.log(Status.INFO, "Vehicle selected");
		Log.info("Vehicle selected");

		vehicle_conditionType.click();
		test.log(Status.INFO, "Vehicle condition type selected");
		Log.info("Vehicle condition type selected");

		Thread.sleep(2000);
		scrolltype.scrollByParameter(0, 400);
		applyWait.waitforElementToBeDisplayed(location_DropDown, DefineConstants.explicitWait_30);
		 new Actions(driver).doubleClick(location_DropDown).build().perform();
		//jsClick.click(location_DropDown);
		test.log(Status.INFO, " location dropdown selected");
		Log.info("location dropdown selected");

		applyWait.waitforElementToBeDisplayed(locationCity_value, DefineConstants.explicitWait_30);
		locationCity_value.click();
		test.log(Status.INFO, " city location selected");
		Log.info("city location selected");

		locationNext_btn.click();
		test.log(Status.INFO, "clicked on location next button");
		Log.info("clicked on location next button");
	}

	public void enterDealershipDetails(String dealership, String businessYear, String NoOfemployees) {
		applyWait.waitforElementToBeDisplayed(dealershipName_textBox, DefineConstants.explicitWait_30);
		dealershipName_textBox.sendKeys(dealership);
		test.log(Status.INFO, "dealership name entered");
		Log.info("dealership name entered");
		dropdown.selectByVisibleText(businessEstablished_dropDown, businessYear);
		test.log(Status.INFO, "dealership business established In year");
		Log.info("dealership business established In year");
		number_of_employess_textBox.sendKeys(NoOfemployees);
		test.log(Status.INFO, "number of emplyoees entered");
		Log.info("dealership number of emplyoees entered");

		companiesWorkWith_textBox.click();
		test.log(Status.INFO, "companies WorkWith textBox");
		Log.info("companies WorkWith textBox");

		companiesWorkWith_value.click();
		test.log(Status.INFO, "companies WorkWith value");
		Log.info("companies WorkWith textBox");

		scrolltype.scrollByParameter(0, 500);
		;
		showroomNext_btn.click();
		test.log(Status.INFO, "Showroom next button clicked");
		Log.info("Showroom next button clicked");

	}

	public void selectPaymentPerfrencesOption() {

		applyWait.waitforElementToBeDisplayed(payment_option, DefineConstants.explicitWait_30);
		payment_option.click();
		test.log(Status.INFO, "payment option selected");
		Log.info("payment option selected");

		scrolltype.scrollByParameter(0, 300);
		availableDay_dropDwn.click();
		//jsClick.click(availableDay_dropDwn);
		test.log(Status.INFO, "available Day selected from drop down");
		Log.info("available Day selected from drop down");

		applyWait.waitforElementToBeDisplayed(availableDay_dropDwnValue, DefineConstants.explicitWait_30);

		availableDay_dropDwnValue.click();
		test.log(Status.INFO, "available Day value selected from drop down");
		Log.info("available Day value selected from drop down");

		availableTime_dropDwn.click();
		//jsClick.click(availableTime_dropDwn);
		test.log(Status.INFO, "available Time selected from drop down");
		Log.info("available Time selected from drop down");

		applyWait.waitforElementToBeDisplayed(availableTime_dropDwnValue, DefineConstants.explicitWait_30);

		availableTime_dropDwnValue.click();
		test.log(Status.INFO, "available Time value selected from drop down");
		Log.info("available Day Time selected from drop down");

		differentTimeSlot_option.click();
		test.log(Status.INFO, "Time slot value selected");
		Log.info("Time slot value selected");

		preferenceNext_btn.click();

		test.log(Status.INFO, "Prference next button clicked");
		Log.info("Prference next button clicked");
	}

	public void enterPaymentDetails(String crediCardNumber, String exMonth, String exYear, String cvvNumber) {
		applyWait.waitforElementToBeDisplayed(crediCardOnPaymentPage, DefineConstants.explicitWait_30);
		softAssert.assertTrue(crediCardOnPaymentPage.isDisplayed());
		crediCardOnPaymentPage.click();
		test.log(Status.INFO, "Credit card Selected");
		Log.info("Credit card Selected");

		continueBtnOnPaymentPage.click();
		test.log(Status.INFO, "continue btn on payment page clicked");
		Log.info("continue btn on payment page clicked");

		applyWait.waitforElementToBeDisplayed(PaymentMode_radioBtn, DefineConstants.explicitWait_30);
		PaymentMode_radioBtn.click();
		test.log(Status.INFO, "Payment mode on payment page Selected");
		Log.info("Payment mode on payment page Selected");

		creditCardNumber_textBox.sendKeys(crediCardNumber);
		softAssert.assertTrue(creditCardNumber_textBox.isDisplayed());
		test.log(Status.INFO, "Credit Card Number entered");
		Log.info("Credit Card Number entered");

		creditCardExpiaryMonth_textBox.sendKeys(exMonth);
		test.log(Status.INFO, "Credit Card Expiray Month entered");
		Log.info("Credit Card Expiray Month entered");

		creditCardExpiaryYear_textBox.sendKeys(exYear);
		test.log(Status.INFO, "Credit Card Expiray Year entered");
		Log.info("Credit Card Expiray year entered");

		creditCardCVVNumber_textBox.sendKeys(cvvNumber);
		test.log(Status.INFO, "Credit Card CVV Number entered");
		Log.info("Credit Card CVV Number entered");

		finalAmtPay_Btn.click();
		test.log(Status.INFO, "Final Pay button clicked ");
		Log.info("Final Pay button clicked ");

		softAssert.assertAll();
	}
	
	
	public void enterPaymentDetailsNetBanking(String crediCardNumber, String cardExpDate, String cvvNumber) throws Exception {
		applyWait.waitforElementToBeDisplayed(crediCardOnPaymentPage, DefineConstants.explicitWait_30);
		softAssert.assertTrue(crediCardOnPaymentPage.isDisplayed());
		netBankingOptionOnPaymentPage.click();
		
		test.log(Status.INFO, "Net Banking Option Selected");
		Log.info("Net Banking Option Selected");

		continueBtnOnPaymentPage.click();
		test.log(Status.INFO, "continue btn on payment page clicked");
		Log.info("continue btn on payment page clicked");

		//Thread.sleep(5000);	
		//driver.navigate().back();
		applyWait.waitforElementToBeDisplayed(netBankingBack_btn, DefineConstants.explicitWait_30);
		//netBankingBack_btn.click();
		driver.navigate().back();
		applyWait.waitforElementToBeDisplayed(netBankingOptionCreditCard, DefineConstants.explicitWait_30);
		//Thread.sleep(2000);
		
		driver.switchTo().frame(0);
		
		netBankingOptionCreditCard.click();
		
		
		
		test.log(Status.INFO, "Card is selected");
		Log.info("Card is selected");

		jsClick.sendKeys(netBankingCardNumber_textBox, crediCardNumber);
		//netBankingCardNumber_textBox.sendKeys(crediCardNumber);		
		test.log(Status.INFO, "Credit Card Number entered");
		Log.info("Credit Card Number entered");

		jsClick.click(netBankingCardExpiry_textBox);
		jsClick.sendKeys(netBankingCardExpiry_textBox, cardExpDate);
		//netBankingCardExpiry_textBox.sendKeys(cardExpDate);
		test.log(Status.INFO, "Credit Card Expiray Month entered");
		Log.info("Credit Card Expiray Month entered");
		//netBankingCardExpiry_textBox.sendKeys(Keys.TAB);
		
		
		jsClick.click(netBankingCardHolderName_textBox);
		//jsClick.sendKeys(netBankingCardHolderName_textBox, "abcd test");
		new Actions(driver).moveToElement(netBankingCardHolderName_textBox).sendKeys("abc test").build().perform();
		//netBankingCardCVVNumber_textBox.sendKeys("abcd test");
		test.log(Status.INFO, "Credit Card Holder Name entered");
		Log.info("Credit Card Holder Name entered");
		//netBankingCardHolderName_textBox.sendKeys(Keys.TAB);
		
		
        jsClick.click(netBankingCardCVVNumber_textBox);
		jsClick.sendKeys(netBankingCardCVVNumber_textBox, cvvNumber);
		//netBankingCardCVVNumber_textBox.sendKeys(cvvNumber);
		test.log(Status.INFO, "Credit Card CVV Number entered");
		Log.info("Credit Card CVV Number entered");
	
		
	

		jsClick.click(netBankingRemember_checkBox);
		//netBankingRemember_checkBox.click();
		test.log(Status.INFO, "check box clicked ");
		Log.info("check box clicked");

		scrolltype.scrollByParameter(0, 400);
		applyWait.waitforElementToBeDisplayed(netBankingPayBtn, DefineConstants.explicitWait_30);
		//jsClick.click(netBankingPayBtn);
		jsClick.click(netBankingPayBtn);	
		
		
		//netBankingPayBtn.click();		
		test.log(Status.INFO, "Final Pay button clicked ");
		Log.info("Final Pay button clicked ");
		
		successBtn.click();
		test.log(Status.INFO, "Success button clicked");
		Log.info("Success button clicked");


	}

}