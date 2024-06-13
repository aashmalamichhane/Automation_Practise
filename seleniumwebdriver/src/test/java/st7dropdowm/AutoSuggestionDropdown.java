package st7dropdowm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AutoSuggestionDropdown {
    public static void main (String args[]) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        driver.manage().window().maximize();
        driver.findElement(By.name("q")).sendKeys("java");
        Thread.sleep(3000);

        List<WebElement> options = driver.findElements(By.xpath("//div[@id='Alh6id' and @role='presentation']//ul//li"));
        System.out.println(options.size());
        for(WebElement op: options){
            System.out.println(op.getText());
            if (op.getText().equals("java"))
            {
                op.click();
                break;
            }
        }



    }
}

