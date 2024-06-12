package st3webmethods;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		System.out.println("Title od the page is:  "  + driver.getTitle());
		
		System.out.println("Current URL is :  " + driver.getCurrentUrl());
				
//		System.out.println("Page Source is  :  " + driver.getPageSource());
		
		System.out.println("Window ID is  :  " + driver.getWindowHandle());
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		System.out.println("Window IDs are   :  " + driver.getWindowHandles()); //[F682D9E15142C977ACDFFDD4B7859A2E, A952523044339067D7874B16A046F622]
		
		Set<String> windowid =driver.getWindowHandles();
		System.out.println(windowid);
		
		//Driver focus on first window unless switch command is used.
		driver.close();

	}

}
