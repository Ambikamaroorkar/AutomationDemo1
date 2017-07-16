package com.sgsoftware.actitime.driverscript;

import org.openqa.selenium.WebDriver;

import com.sgsoftware.actitime.testscripts.Initialize;
import com.sgsoftware.actitime.testscripts.LoginLogout;
import com.sgsoftware.actitime.testscripts.Users;

public class DriverScript {

	public static void main(String[] args) {
		WebDriver oBrowser=null;
		// Login Logout Scenario
		oBrowser=Initialize.launchBrowser();
		Initialize.navigate();
		LoginLogout.login(oBrowser);
		LoginLogout.logout(oBrowser);
		Initialize.closeApplication();
		System.out.println("+++++++++++++++");
		
		
		// Create User Scenario
		oBrowser=Initialize.launchBrowser();
		Initialize.navigate();
		LoginLogout.login(oBrowser);
		Users.createUser(oBrowser);
		Users.deleteUser(oBrowser);
		LoginLogout.logout(oBrowser);
		Initialize.closeApplication();
		System.out.println("+++++++++++++++");
		
		//Modify User Scenario
		oBrowser=Initialize.launchBrowser();
		Initialize.navigate();
		LoginLogout.login(oBrowser);
		Users.createUser(oBrowser);
		Users.modifyUser(oBrowser);
		Users.deleteUser(oBrowser);
		LoginLogout.logout(oBrowser);
		Initialize.closeApplication();
		System.out.println("+++++++++++++++");
		
		

	}

}
