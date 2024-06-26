package st3webmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethod {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
		
		//isDisplayed
		WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		System.out.println("Logo is displayed : "+ logo.isDisplayed());
				
		//isEnabled
		WebElement searchbox = driver.findElement(By.id("small-searchterms"));
		System.out.println("Search box is enabled : "+ searchbox.isEnabled());

		//isSelected()
		
		WebElement checkbox = driver.findElement(By.id("Newsletter"));
		System.out.println("CHECKBOX IS Selected : " + checkbox.isSelected());
		
		


		

		
	
	}

}
