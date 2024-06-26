package st2locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath {

	public static void main(String args[]) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		//Relative XPATH with single attribute
        //driver.findElement(By.xpath("//img[@title='MacBook']")).click();
		
		//Relative XPATH with single attribute  Syntax :  //tagname[@attribute=”value”
		driver.findElement(By.xpath("//img[@title='MacBook'][@alt='MacBook']")).click();

		// and or operator in XPATH
//		driver.findElement(By.xpath("//img[@title='MacBook' or @alt='MacBook']")).click();
//		driver.findElement(By.xpath("//img[@title='MacBook' and @alt='MacBook']")).click();

		
		//XPATH with inner text -text()
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));	
		driver.findElement(By.xpath("//a[text()='Desktops']")).click();	
		
		
	}
}
