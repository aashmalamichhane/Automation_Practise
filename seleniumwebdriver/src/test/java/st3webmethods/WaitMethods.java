package st3webmethods;

import com.google.common.base.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class WaitMethods {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		//Implicit waits
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.manage().window().maximize();
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		driver.findElement(By.xpath("//input[@placeholder=\"Username\"]")).sendKeys("Admin");


		//Explicit waits
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10)); //declaration
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();

		WebElement usernametext = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder=\"Username\"]")));
		usernametext.sendKeys("Admin");

		WebElement password = driver.findElement(By.xpath("//input[@placeholder=\"Password\"]"));
		password.sendKeys("admin123");

		WebElement loginbtn = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()=\"Login\"]")));
		loginbtn.click();
		driver.close();


		//FluentWaits rarely used
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		driver.manage().window().maximize();
//		Wait<WebDriver> wait1 = new FluentWait<WebDriver>(driver)
//				.withTimeout(Duration.ofSeconds(30))
//				.pollingEvery(Duration.ofSeconds(5))
//				.ignoring(NoSuchElementException.class);
//
//		WebElement usernametext = wait1.until(new Function<WebDriver, WebElement>() { //arrow Function
//			public WebElement apply(WebDriver driver) {
//				return driver.findElement(By.xpath("//input[@placeholder=\"Username\"]"));
//			}
//		});
//			usernametext.sendKeys("Admin");

	}

}
