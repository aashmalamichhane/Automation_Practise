package st5checkboxandalert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HandleAlertwithExplicitWait {

public static void main (String args[]) throws InterruptedException {
    WebDriver driver = new ChromeDriver();
    WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
    driver.get("https://testautomationpractice.blogspot.com/");
    driver.manage().window().maximize();


    // Normal Alert with OK button
    driver.findElement(By.xpath("//button[normalize-space()=\"Alert\"]")).click();
    Thread.sleep((2000));
    Alert myalert = mywait.until(ExpectedConditions.alertIsPresent());
    myalert.accept();

}}
