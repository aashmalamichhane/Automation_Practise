package st8PaginationandDatePicker;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class Date2 {
    public static  void main(String args[]){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");


        driver.switchTo().frame(0);

        String year = "2023";
        String month = "April";
        String date = "22";
        driver.findElement(By.xpath("//div[@id='q4']//span[@class='icon_calendar']")).click();

        //Select year
        WebElement yeardrp = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        Select selectyear = new Select(yeardrp);
        selectyear.selectByVisibleText(year);

        //select month
        while (true) {
            WebElement monthtext = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
            String currmonth = monthtext.getText();

          
            if (currmonth.equals(month)) {
                break;
            }
            else {
                driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click(); //for previous month
               // driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click(); //for coming month
            }
        }

        //select date
         List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//td"));
        for(WebElement day :dates)
        {
            if(day.getText().equals(date))
            {
                day.click();
            }
        }





    }
}
