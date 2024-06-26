package st9actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragamdDrop {

    public static void main(String args[]) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
        driver.manage().window().maximize();

        WebElement frame1 = driver.findElement(By.xpath("//iframe[@class=\"demo-frame lazyloaded\"]"));
        driver.switchTo().frame(frame1);

        WebElement sourceElement1 = driver.findElement(By.xpath("//ul[@id=\"gallery\"]//li[1]"));
        WebElement destinationElement = driver.findElement(By.xpath("//div[@id=\"trash\"]"));

        Actions act = new Actions(driver);
        //Drap and Drop
        act.dragAndDrop(sourceElement1,destinationElement).perform();


        driver.findElement(By.xpath("//a[@href=\"images/high_tatras.jpg\"]")).click();

    }
}
