package st11screenshots;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class Screenshots {
    public static void main(String args[]) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();


        //Full page Screenshot -typecasting
        TakesScreenshot tss = (TakesScreenshot) driver;
        File sourcefile = tss.getScreenshotAs(OutputType.FILE);
        String currpath = System.getProperty("user.dir");
        String targetloc = currpath + "\\screenshots\\fullpage.png";
        File targetfile = new File(targetloc);
        sourcefile.renameTo(targetfile);

        //Specific area Screenshot
        WebElement specificArea = driver.findElement(By.xpath("//div[@class=\"product-grid home-page-product-grid\"]"));
        File sourcefile1  = specificArea.getScreenshotAs(OutputType.FILE);
        String targetloc1 = currpath + "\\screenshots\\specificpage.png";
        File targetfile1 = new File(targetloc1);
        sourcefile1.renameTo(targetfile1);

        //Specific Web Element
        WebElement specificElement = driver.findElement(By.xpath("//img[@title=\"Show details for Apple MacBook Pro 13-inch\"]"));
        File sourcefile2 = specificElement.getScreenshotAs(OutputType.FILE);
        String targetloc2 = currpath + "\\screenshots\\specificwebelement.png";
        File targetfile2 = new File(targetloc2);
        sourcefile2.renameTo(targetfile2);




    }
}
