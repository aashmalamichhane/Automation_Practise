package st5checkboxandalert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlert {

    public static void main (String args[]) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();


        // Normal Alert with OK button
        driver.findElement(By.xpath("//button[normalize-space()=\"Alert\"]")).click();
        Alert alert1 = driver.switchTo().alert();
        System.out.println(alert1.getText());
        alert1.accept();

        // Confirmation Alert with Cancel and OK button
        driver.findElement(By.xpath("//button[normalize-space()=\"Confirm Box\"]")).click();
//        driver.switchTo().alert().accept(); //close alert using OK button
        driver.switchTo().alert().dismiss(); // Close allert using dismiss button

        //Prompt Alert which has input box
        driver.findElement(By.xpath("//button[normalize-space()=\"Prompt\"]")).click();
        Alert alert2 = driver.switchTo().alert();
        alert2.sendKeys("Ok");
        alert2.accept();

    }


}
