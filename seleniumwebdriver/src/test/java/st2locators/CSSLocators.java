package st2locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocators {

	public static void main (String args[])
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//tag#id
		driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-shirts" + Keys.ENTER);
		driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("T-shirts" + Keys.ENTER);
		
		//tag.class
		driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("T-shirts");

		//tag[attribute="value"]
		driver.findElement(By.cssSelector("input[placeholder='Search store']"));
		
		//tag.classname [attribute=”value”]
		driver.findElement(By.cssSelector("input.search-box-text[placeholder='Search store']"));
		
	}
}
