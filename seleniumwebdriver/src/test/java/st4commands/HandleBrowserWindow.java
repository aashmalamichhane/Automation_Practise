package st4commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class HandleBrowserWindow {

    public static void main(String args[])  {

        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.findElement(By.xpath("//a[normalize-space()=\"OrangeHRM, Inc\"]")).click();

       Set<String> windowsIDs=  driver.getWindowHandles();

       //Approach1 -- Converting  set collection into list to get individual id

        List<String> windowList = new ArrayList(windowsIDs);
        String parentID= windowList.get(0);
        String childID= windowList.get(1);

        //switch to child window
        driver.switchTo().window(childID);
        System.out.println(driver.getTitle());

        //switch to parent window
        driver.switchTo().window(parentID);
        System.out.println(driver.getTitle());


    }
}

