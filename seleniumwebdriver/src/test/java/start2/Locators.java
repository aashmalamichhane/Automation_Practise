package start2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Keys;


public class Locators {
	
	public static void main (String args[]) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		//name locator
		driver.findElement(By.name("search")).sendKeys("Mac" +Keys.ENTER);
		 
	   //id locator
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		boolean logodisplaystatus= driver.findElement(By.id("logo")).isDisplayed();
		System.out.println("Logo is displayed: " +logodisplaystatus);
		
		//link text locator
		driver.findElement(By.linkText("Tablets")).click();
		
		//partial text locator
		driver.findElement(By.partialLinkText("Tab")).click();
	 
		//class to find group of elements, find elements will have return type of List and every value is Web Element Type
		List<WebElement> headerLinks = driver.findElements(By.className("list-inline"));
		System.out.println("total number of header link is "+headerLinks.size());
		
		//tag name
		List<WebElement> links= driver.findElements(By.tagName("a"));
		System.out.println("total number of the link in page is :"+ links.size());
		List<WebElement> image= driver.findElements(By.tagName("img"));
		System.out.println("total number of the image in page is :"+ image.size());
		
		
		
		
		
		
	
		
	}

}
