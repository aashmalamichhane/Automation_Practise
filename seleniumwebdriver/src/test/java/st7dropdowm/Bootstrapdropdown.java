package st7dropdowm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Bootstrapdropdown {


    public static void main(String args[]) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[@id=\"menu1\"]")).click();

        //Select single option from dropdown
        driver.findElement(By.xpath("//a[normalize-space()=\"HTML\"]")).click();

        //List of elements
        List<WebElement> options = driver.findElements(By.xpath("//a[@role=\"menuitem\"]"));
        System.out.println("Number of optioms: "+ options.size());
        for(WebElement op :options){
            System.out.println(op.getText());
        }
    }
}
