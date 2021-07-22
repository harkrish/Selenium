package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Harikrishnan.S3\\Automation\\chrome_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String text="Hari";
		driver.get("https://the-internet.herokuapp.com/dropdown");
		driver.findElement(By.cssSelector("select[id='dropdown']")).click();
//		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//
//		driver.findElement(By.id("name")).sendKeys(text);
//
//		driver.findElement(By.cssSelector("[id='alertbtn']")).click();
//
//		System.out.println(driver.switchTo().alert().getText());
//
//		driver.switchTo().alert().accept();
//
//		driver.findElement(By.id("confirmbtn")).click();
//
//		System.out.println(driver.switchTo().alert().getText());
//
//		driver.switchTo().alert().dismiss(); 
//		
//		//isSelected() -> check box or radio button
//		//isDisplayed() -> to verify webelement is displayed 
      
	}

}

