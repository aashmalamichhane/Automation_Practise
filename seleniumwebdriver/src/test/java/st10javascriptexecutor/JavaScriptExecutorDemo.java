package st10javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorDemo {

    public static void main (String ars[])
    {

        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
//        driver.manage().window().maximize();
//        driver.findElement(By.xpath("//input[@id=\"name\"]")).sendKeys("Aashma");


        WebElement inputbox = driver.findElement(By.xpath("//input[@id='name']"));
        JavascriptExecutor js =( JavascriptExecutor ) driver;
        js.executeScript("arguments[0].setAttribute('value','Aashma')", inputbox);


       WebElement checkbox =  driver.findElement(By.xpath("//input[@id=\"saturday\"]"));
       js.executeScript("arguments[0].click()",checkbox);


    }

}
