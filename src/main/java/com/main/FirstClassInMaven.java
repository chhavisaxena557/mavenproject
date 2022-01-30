package com.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class FirstClassInMaven {
@Test	
public  void mathod() {
WebDriver driver = new ChromeDriver();	
driver.get("https://opensource-demo.orangehrmlive.com");
/*

System.out.println("+++++++++"+System.getProperty("env.BROWSER"));
if(System.getProperty("env.BROWSER").equalsIgnoreCase("chrome")) {
driver = new ChromeDriver();
}
else if(System.getProperty("env.BROWSER").equalsIgnoreCase("firefox")) {
driver = new FirefoxDriver();
}
*/
driver.quit();


}
}
