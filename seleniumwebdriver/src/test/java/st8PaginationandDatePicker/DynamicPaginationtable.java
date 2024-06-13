package st8PaginationandDatePicker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class DynamicPaginationtable {

    public static void main (String args []) throws InterruptedException {
        //click on all the pages till it reach last page
        //extract data from table



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

        //counting pages
        List<WebElement> pagenum = driver.findElements(By.xpath("//ul[@class='oxd-pagination__ul']//li"));
        System.out.println("the total number of pages is :" + pagenum.size());

    }
}
