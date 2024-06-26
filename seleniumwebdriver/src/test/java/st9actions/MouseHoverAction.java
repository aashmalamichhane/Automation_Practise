package st9actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAction {

    public static void main(String args[])
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/");
        driver.manage().window().maximize();

        WebElement desktop =  driver.findElement(By.xpath("//a[normalize-space()=\"Desktops\"]"));
        WebElement mac = driver.findElement(By.xpath("//a[normalize-space()=\"Mac (1)\"]"));

        Actions act = new Actions(driver);

        //mousehover action
        act.moveToElement(desktop).moveToElement(mac).click().build().perform();

        //this will also work, here perform method will both create and complete the action
//        act.moveToElement(desktop).moveToElement(mac).click().perform();





    }
}
