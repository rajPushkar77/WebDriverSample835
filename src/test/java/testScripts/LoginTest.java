package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://the-internet.herokuapp.com/login");
//		driver.findElement(By.linkText("Elemental Selenium")).click();
		driver.findElement(By.partialLinkText("Elemental")).click();
	}

}
