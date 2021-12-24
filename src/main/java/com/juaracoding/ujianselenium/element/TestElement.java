package com.juaracoding.ujianselenium.element;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.juaracoding.ujianselenium.driver.DriverSingleton;



public class TestElement {
	
	private WebDriver driver;
	
	public TestElement( ) {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "#header > div.nav > div > div > nav > div.header_user_info > a")
	private WebElement btnSignIn;
//	create account
	@FindBy(id = "email_create")
	private WebElement textboxCreateAcc;
	
	@FindBy(id = "SubmitCreate")
	private WebElement submitBtn;
	
//	isi form
	
	@FindBy(id = "uniform-id_gender1")
	private WebElement btnRadioButton;
	
	@FindBy(id = "customer_firstname")
	private WebElement textboxCstFirstName;
	
	@FindBy(id = "customer_lastname")
	private WebElement textboxCstLastName;
	
	@FindBy(id = "email")
	private WebElement textboxEmail;
	
	@FindBy(id = "passwd")
	private WebElement textboxPassword;
	
	@FindBy(id = "days")
	private WebElement selectDays;
	
	@FindBy(id = "months")
	private WebElement selectMonths;
	
	@FindBy(id = "years")
	private WebElement selectYears;
	
	@FindBy(id = "newsletter")
	private WebElement chckboxNewsLetter;
	
	@FindBy(id = "optin")
	private WebElement chckboxRef;
	
	@FindBy(id = "firstname")
	private WebElement textboxFirstName;
	
	@FindBy(id = "lastname")
	private WebElement textboxLastName;
	
	@FindBy(id = "company")
	private WebElement textboxtCompany;
	
	@FindBy(id = "address1")
	private WebElement textboxAddress;
	
	@FindBy(id = "address2")
	private WebElement textboxAddress2;
	
	@FindBy(id = "city")
	private WebElement textboxCity;

	@FindBy(id = "id_state")
	private WebElement selectState;
	
	@FindBy(id = "postcode")
	private WebElement textboxPostCode;
	
	@FindBy(id = "id_country")
	private WebElement selectCountry;
	
	@FindBy(id = "other")
	private WebElement textboxAddInfo;
	
	@FindBy(id = "phone")
	private WebElement textboxHomePhone;
	
	@FindBy(id = "phone_mobile")
	private WebElement textboxMblPhone;
	
	@FindBy(id = "alias")
	private WebElement textboxAddressAlias;
	
	@FindBy(id = "submitAccount")
	private WebElement btnSubmitAccount;
	
	@FindBy(css = "#block_top_menu > ul > li:nth-child(2) > a")
	private WebElement btnDresses;
	
	@FindBy(css = "#center_column > ul > li.ajax_block_product.col-xs-12.col-sm-6.col-md-4.first-in-line.first-item-of-tablet-line.first-item-of-mobile-line > div > div.right-block")
	private WebElement divDresses;
	
	@FindBy(css = "#center_column > ul > li.ajax_block_product.col-xs-12.col-sm-6.col-md-4.first-in-line.first-item-of-tablet-line.first-item-of-mobile-line > div > div.right-block > div.button-container > a.button.ajax_add_to_cart_button.btn.btn-default")
	private WebElement btnDressesAddToCart;
	
	@FindBy(css = "#layer_cart > div.clearfix > div.layer_cart_product.col-xs-12.col-md-6 > span")
	private WebElement btnDressesClose;
	
	@FindBy(css = "#block_top_menu > ul > li:nth-child(3) > a")
	private WebElement btnTextTshirts;
	
	@FindBy(css = "#center_column > ul > li > div > div.right-block")
	private WebElement divTshirts;
	
	@FindBy(css = "#center_column > ul > li > div > div.right-block > div.button-container > a.button.ajax_add_to_cart_button.btn.btn-default")
	private WebElement btnTshirtsAddToCart;
	
	@FindBy(css = "#layer_cart > div.clearfix > div.layer_cart_product.col-xs-12.col-md-6 > span")
	private WebElement btnTshirtsClose;
	
	@FindBy(css = "#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > a")
	private WebElement btnCheckout;
		
	@FindBy(css = "#center_column > p.cart_navigation.clearfix > a.button.btn.btn-default.standard-checkout.button-medium")
	private WebElement btnProceedToCheckout1;
		
	@FindBy(css = "#center_column > form > p > button")
	private WebElement btnProceedToCheckout2;

	@FindBy(id = "cgv")
	private WebElement chkIGree;

	@FindBy(css = "#form > p > button")
	private WebElement btnProceedToCheckout3;


	@FindBy(css = "#HOOK_PAYMENT > div:nth-child(2) > div > p > a")
	private WebElement btnPayByCheck;

	@FindBy(css = "#cart_navigation > button")
	private WebElement btnOrder;
	
	public void signIn() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		btnSignIn.click();
	}
	
	public void regisEmail(String userEmail) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		textboxCreateAcc.sendKeys(userEmail);
		submitBtn.click();
	}
	
	public void fillForm(String cstFirstName, String cstLastName, String passWord, String days , String months , String years , 
			String firstName, String lastName, String company , String mainAddress , String secondAddress , String city , String state, String postCode , String country, 
			String addInfo , String homePhone , String mobilePhone , String addressAlias ) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(btnRadioButton));
		btnRadioButton.click();
		textboxCstFirstName.sendKeys(cstFirstName);
		textboxCstLastName.sendKeys(cstLastName);
		textboxPassword.sendKeys(passWord);
		selectDays.sendKeys(days);
		selectMonths.sendKeys(months);
		selectYears.sendKeys(years);
		chckboxNewsLetter.click();
		chckboxRef.click();
		textboxFirstName.sendKeys(firstName);
		textboxLastName.sendKeys(lastName);
		textboxtCompany.sendKeys(company);
		textboxAddress.sendKeys(mainAddress);
		textboxAddress2.sendKeys(secondAddress);
		textboxCity.sendKeys(city);
		selectState.sendKeys(state);
		textboxPostCode.sendKeys(postCode);
		selectCountry.sendKeys(country);
		textboxAddInfo.sendKeys(addInfo);
		textboxHomePhone.sendKeys(homePhone);
		textboxMblPhone.sendKeys(mobilePhone);
		textboxAddressAlias.sendKeys(addressAlias);
		btnSubmitAccount.click();
		
//		add to cart
		btnDresses.click();
		Actions action = new Actions(driver);
		action.moveToElement(divDresses).moveToElement(btnDressesAddToCart).click().build().perform();
		btnDressesClose.click();
		btnTextTshirts.click();
		js.executeScript("arguments[0].scrollIntoView();", divTshirts);
		action = new Actions(driver);
		action.moveToElement(divTshirts).moveToElement(btnTshirtsAddToCart).click().build().perform();
		
//		checkout
		btnCheckout.click();
		btnProceedToCheckout1.click();
		btnProceedToCheckout2.click();
		chkIGree.click();
		btnProceedToCheckout3.click();
		btnPayByCheck.click();
		btnOrder.click();
		
		}
	
	
	
	

}
