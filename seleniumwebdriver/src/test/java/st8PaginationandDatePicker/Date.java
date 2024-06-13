package st8PaginationandDatePicker;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Date {
    public  static void main (String arge[])
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/datepicker/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Switch to frame
        driver.switchTo().frame(0);

        //Using send keys
//        WebElement dateinput = driver.findElement(By.id("datepicker"));  //DD/MM/YY
//        dateinput.sendKeys("02/02/2022");
//        dateinput.sendKeys(Keys.ENTER);


        //Using date picker


        String year = "2025";
        String month = "September";
        String date =  "12";
        driver.findElement(By.id("datepicker")).click();

        //select month and year

        while (true) {
            String curMonth = driver.findElement(By.xpath("//span[@class=\"ui-datepicker-month\"]")).getText();
            String curYear = driver.findElement(By.xpath("//span[@class=\"ui-datepicker-year\"]")).getText();

            if (curMonth.equals(month) && curYear.equals(year))
            {
                break;
            }
            else {
                driver.findElement(By.xpath("//span[@class=\"ui-icon ui-icon-circle-triangle-e\"]")).click(); //Next Button
//                driver.findElement(By.xpath("//span[@class=\"ui-icon ui-icon-circle-triangle-w\"]")).click(); //Previous Button

            }
        }

       List<WebElement> dates=  driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
        for(WebElement day : dates){
            System.out.println(day.getText());

            if (day.getText().equals(date)){
                day.click();
            }
        }

    }
}
