package st7dropdowm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class SelectDropdown {
    public static void main(String args[]) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        //Select dropdown
        WebElement DCElement= driver.findElement(By.id("country"));
        Select drpcountry = new Select(DCElement);

        //Select option from dropdown
        drpcountry.selectByVisibleText("Japan");
        drpcountry.selectByValue("germany");
        drpcountry.selectByIndex(2);

        //total number of dropdowns , capture number of options
        List<WebElement> options = drpcountry.getOptions();
        System.out.println("Number of options is : "+ options.size());

        //printing those options
        for(int i = 0 ; i< options.size(); i++)
        {
            System.out.println(options.get(i).getText());
        }


        //enhance loop to print the options
        for(WebElement op : options){
            System.out.println(op.getText());
        }


    }
}

