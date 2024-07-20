package st9actions;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class KeyboardActionOpenLinkNeTab {

    public static void main(String args[]) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.daraz.com.np/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement logLink = driver.findElement(By.xpath("//a[normalize-space()=\"Sign Up\"]"));

        Actions act = new Actions(driver);

        act.keyDown(Keys.CONTROL).click(logLink).keyDown(Keys.CONTROL).perform();

        //switchingg to registration page-child page

        Set<String> windowsId = driver.getWindowHandles();

        //To convert set to the list , pass the set in Array List Constructor
        List<String> ids = new ArrayList<>(windowsId);

        //REGISTRATION PAGE
        driver.switchTo().window(ids.get(1));
        WebElement h3 = driver.findElement(By.xpath("//h3[normalize-space()=\"Create your Daraz Account\"]"));
        System.out.println(h3.isDisplayed());
        driver.findElement(By.xpath("//input[@placeholder=\"Please enter your phone number\"]")).sendKeys("90909000");


        //To open new TAB of differen URL
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.orangehrm.com/");

        //To open new window of differen URL
        driver.switchTo().newWindow(WindowType.WINDOW);




    }
}

