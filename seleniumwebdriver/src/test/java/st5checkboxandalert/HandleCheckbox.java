package st5checkboxandalert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HandleCheckbox {
    public static void main(String args[]) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        //To select specific checkbox
       driver.findElement(By.id("sunday")).click();

        //To select all checkboxes
       List<WebElement> checkboxes=  driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
       for(int i =0; i<checkboxes.size();i++){
           checkboxes.get(i).click();
       }

       for (WebElement checkbox : checkboxes){
           checkbox.click();
       }

       //select last 3 checkboxes
        for(int i=4; i<checkboxes.size(); i++){
            checkboxes.get(i).click();

        }
        for(int i=checkboxes.size()-1; i>=checkboxes.size()-3; i--){
            checkboxes.get(i).click();

        }

        //select first 3 checkboxes
        for (int i=0 ; i<3;i++){
            checkboxes.get(i).click();
        }


        //unselect the selected checkboxes
        Thread.sleep(5000);
        for(int i =0 ; i< checkboxes.size(); i++)
        {
            if(checkboxes.get(i).isSelected())
            {
                checkboxes.get(i).click();
            }
        }



    }
}
