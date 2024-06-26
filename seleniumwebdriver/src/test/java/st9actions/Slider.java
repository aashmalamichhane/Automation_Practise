package st9actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {
    public static void main(String args[])
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
        driver.manage().window().maximize();

        //Minimum slider
        WebElement minSlider = driver.findElement(By.xpath("//span[1]"));
        //tO KNOW CURRENT POSITION ON X-T AXIS BASIS
        System.out.println("Location of min slider : " + minSlider.getLocation()); //(59, 250)
        Actions act = new Actions(driver);
        act.dragAndDropBy(minSlider,100 ,0).perform();

    }
}
