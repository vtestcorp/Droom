package com.droom.testcases;

import org.testng.annotations.Test;

import com.droom.pageobjects.DroompageObject;

import base.BaseClass;
import config.DefineConstants;
import helperMethods.DataGenerator;
import helperMethods.JsonUtils;

public class droom_test_001 extends BaseClass {

	DroompageObject droom_page;
	DataGenerator dataGenrator;

	@Test(enabled = true)
	public void registerUserOnDroomApp() throws Exception {

		test = extent.createTest("droom_test_001",
				"User should be able to register successfully on  droom application");

		dataGenrator = new DataGenerator();
		droom_page = new DroompageObject(driver, test);
		driver.get(DefineConstants.Droom_URL);

		droom_page.enterOtp(JsonUtils.getData(DefineConstants.Register_NewUser_Details, "Mobile_Number"));

		
		  droom_page.enterBasicDetails(JsonUtils.getData(DefineConstants.
		  Register_NewUser_Details, "firstname"),
		  JsonUtils.getData(DefineConstants.Register_NewUser_Details, "lastname"),
		  dataGenrator.generateEmailAddress());
		  
		  droom_page.enterVehicleDetails();
		  
		  droom_page.enterDealershipDetails(JsonUtils.getData(DefineConstants.
		  Register_NewUser_Details, "dealerName"),
		  JsonUtils.getData(DefineConstants.Register_NewUser_Details,
		  "yearBusinessEstablished"),
		  JsonUtils.getData(DefineConstants.Register_NewUser_Details,
		  "noOfEmployees"));
		  
		  droom_page.selectPaymentPerfrencesOption();
		  droom_page.enterKyCDetails(JsonUtils.getData(DefineConstants.
		  Register_NewUser_Details, "kycPinCode"),
		  JsonUtils.getData(DefineConstants.Register_NewUser_Details, "kycAreaDetail"),
		  JsonUtils.getData(DefineConstants.Register_NewUser_Details, "kycAddress"),
		  JsonUtils.getData(DefineConstants.Register_NewUser_Details,
		  "kycPanCardNumber"),
		  JsonUtils.getData(DefineConstants.Register_NewUser_Details,
		  "kycAdharCardNumber"),
		  JsonUtils.getData(DefineConstants.Register_NewUser_Details, "kycGSTNumber"),
		  DefineConstants.kycFileDocumentUpload);
		 

		droom_page.getPakageDeatils();

		/*
		 * droom_page.enterPaymentDetails(JsonUtils.getData(DefineConstants.
		 * Register_NewUser_Details, "CrediCardNumber"),
		 * JsonUtils.getData(DefineConstants.Register_NewUser_Details, "CCExpMonth"),
		 * JsonUtils.getData(DefineConstants.Register_NewUser_Details, "CCExpYear"),
		 * JsonUtils.getData(DefineConstants.Register_NewUser_Details, "CVVNumber"));
		 */

		droom_page.enterPaymentDetailsNetBanking(
				JsonUtils.getData(DefineConstants.Register_NewUser_Details, "CrediCardNumber"),
				JsonUtils.getData(DefineConstants.Register_NewUser_Details, "CCExpDate"),
				JsonUtils.getData(DefineConstants.Register_NewUser_Details, "CVVNumber"));
	}

}