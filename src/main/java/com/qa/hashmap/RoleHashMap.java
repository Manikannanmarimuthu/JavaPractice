package com.qa.hashmap;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RoleHashMap {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://192.168.0.79:8443/mdynamics-webui-gsswitch2/wui/");
		driver.findElement(By.id("username8")).sendKeys(getUsername("Fie Checker"));
		driver.findElement(By.id("passworda")).sendKeys(getPassword("Finaince Checker"));
		driver.findElement(By.id("loginBtne")).click();
		driver.quit();
	}

	public static HashMap<String, String> getCredentialsMap() {
		HashMap<String, String> credentialsMap = new HashMap<String, String>();
		credentialsMap.put("Finaince Maker", "manikannan@welocme123");
		credentialsMap.put("Finaince Checker", "gsswuser@welcome123");
		return credentialsMap;
	}

	public static String getUsername(String role) {
		String Credentials = getCredentialsMap().get(role);
		return Credentials.split("@")[0];
	}

	public static String getPassword(String role) {
		String Credentials = getCredentialsMap().get(role);
		return Credentials.split("@")[1];
	}

}
