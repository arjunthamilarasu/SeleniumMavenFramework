package seleniumTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;



public class OpenGoogle {

	public static void main(String[] args) {
		

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://s1.novade.net");
		
		driver.findElement(By.id("email")).sendKeys("arjun@novade.net");
		
		driver.findElement(By.className("right")).click();
		
		driver.findElement(By.id("password")).sendKeys("arjun2023");
		
		driver.findElement(By.className("right")).click();
		
		String text1="Welcome to Novade";
		
		String text2 =driver.findElement(By.className("title")).getText();
		
		if (text1.contentEquals(text2)){
			System.out.println(text2); 
			System.out.println("User logged in successfully");
			System.out.println("Test Passed");
	      } else {
	         System.out.println("Login unsuccessful or Error loading Welcome page");
	         System.out.println("Test Failed");
		
	         	            }
		
		}

}
