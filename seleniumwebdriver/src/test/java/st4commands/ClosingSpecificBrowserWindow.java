package st4commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class ClosingSpecificBrowserWindow {

    public static void main(String args[]) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.findElement(By.xpath("//a[normalize-space()=\"OrangeHRM, Inc\"]")).click();

        Set<String> windowsIDs = driver.getWindowHandles();

        for (String winId: windowsIDs)
        {
            String title = driver.switchTo().window(winId).getTitle();
            if(title.equals("Human Resources Management Software | OrangeHRM"))
            {
                driver.close();
            }
        }



    }
}
