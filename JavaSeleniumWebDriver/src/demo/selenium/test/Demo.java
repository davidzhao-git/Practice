package demo.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.gecko.driver","C://Users//Jian//Desktop//geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver(); 
		driver.get("http://localhost:5000/"); 
		
		driver.navigate().to("http://localhost:5000/login");
//		driver.findElement(By.linkText("Login")).click();
		
		
		driver.findElement(By.name("email")).sendKeys("hello@demo.com");
		driver.findElement(By.name("password")).sendKeys("hello");
		driver.findElement(By.name("submit")).click();
		
		
	}

}
