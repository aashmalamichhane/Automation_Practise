package st9actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightandDoubleClickAction {

    public static void main(String args[]) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
        driver.manage().window().maximize();

        WebElement button = driver.findElement(By.xpath("//span[@class=\"context-menu-one btn btn-neutral\"]"));

        Actions act = new Actions(driver);

        //Right Click action
        act.contextClick(button).perform();

        //Click on copy
        driver.findElement(By.xpath("//span[normalize-space()=\"Copy\"]")).click();
        Thread.sleep(2000);

        //Close the alert
        driver.switchTo().alert().accept();


        //Double click
        WebElement dblclickButton = driver.findElement(By.xpath("//button[normalize-space()=\"Double-Click Me To See Alert\"]"));
        act.doubleClick(dblclickButton).perform();
    }
}