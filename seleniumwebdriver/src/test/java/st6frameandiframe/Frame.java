package st6frameandiframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

    public static void main (String args[])
    {
        WebDriver driver= new ChromeDriver();
        driver.get("https://ui.vision/demo/webtest/frames/");
        driver.manage().window().maximize();

        //Frame One
        WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
        driver.switchTo().frame(frame1);  //passed frame as webelement
        driver.findElement(By.xpath("//input[@name=\"mytext1\"]")).sendKeys("Hello");

        driver.switchTo().defaultContent(); //go back to page that is go out of frame

       //Frame2
        WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
        driver.switchTo().frame(frame2);
        driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Hello Again");
        driver.switchTo().defaultContent();


        //Frame3
        WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
        driver.switchTo().frame(frame3);
        driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Hello Again Frame3");

        //iframe inside the frame3
        driver.switchTo().frame(0); //swiching to frame using index
        driver.findElement(By.xpath("//div[@id=\"i8\"]//div[@class=\"AB7Lab Id5V1\"]")).click();
        driver.switchTo().defaultContent();

    }
}
