package config;

public class DefineConstants {
	// Test data file Path
	public static final String Path_TestData = "";

	// Application URL
	public static final String Droom_URL = "https://qa1.droom.in//proseller-onboard?q=proseller";
	
	//https://secure.droom.in/proseller-onboard?q=proseller
	
	// Explicit Wait Time
	public static final int explicitWait_10 = 10;
	
	public static final int explicitWait_20 = 20;
	
	public static final int explicitWait_30 = 30;

	public static final int explicitWait_60 = 60;

	public static final String PROJECT_PATH = System.getProperty("user.dir")+"/";

	public static final String PROJECT_OS = System.getProperty("os.name");

	public static final String TestData_Folder = "Test_Data";
	
	public static final String MobileNumber = "9673457306";
	
	public static final String verify_PackageText="Seller Packages";
	public static final String kycFileDocumentUpload = PROJECT_PATH+"FilesToUpload/carrots.jpg";
	
	//Register_NewUser_Details
	public static final String Register_NewUser_Details = TestData_Folder + "//" + "RegisterNewUserDetails.json";
			
	
}