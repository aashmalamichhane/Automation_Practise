package st7dropdowm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class HiddenDropdown {
    public static  void main (String args[])
    {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

        //Login
        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("Admin");
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("admin123");
        WebElement loginbtn = driver.findElement(By.xpath("//button[normalize-space()=\"Login\"]"));
        loginbtn.click();

        //Clicking PIM menu
        driver.findElement(By.xpath("//a[normalize-space()='PIM']")).click();

        //Clicking on dropdown
        driver.findElement(By.xpath("//body/div[@id=\"app\"]/div[@class=\"oxd-layout\"]/div[@class=\"oxd-layout-container\"]/div[@class=\"oxd-layout-context\"]/div[@class=\"orangehrm-background-container\"]/div[@class=\"oxd-table-filter\"]/div[@class=\"oxd-table-filter-area\"]/form[@class=\"oxd-form\"]/div[@class=\"oxd-form-row\"]/div[@class=\"oxd-grid-4 orangehrm-full-width-grid\"]/div[3]/div[1]/div[2]/div[1]/div[1]")).click();

        //Clicking on One Element
//        driver.findElement(By.xpath("//span[normalize-space()=\"Full-Time Contract\"]")).click();

        //Count Total Number of option

        List<WebElement> options = driver.findElements(By.xpath("//div[@role='listbox']//span"));
        System.out.println(options.size());

        for (WebElement op : options){
            System.out.println(op.getText());
        }




    }
}
