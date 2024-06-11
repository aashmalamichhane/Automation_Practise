package st4commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class NavigationalCommands {

    public static void main (String args[]) throws MalformedURLException {

        WebDriver driver = new ChromeDriver();

        //driver.get("https://demo.nopcommerce.com/register"); // Accept URL only in String format
        driver.navigate().to("https://demo.nopcommerce.com/register"); //// Accept URL  String or object format

//        URL myurl = new URL ("https://demo.nopcommerce.com/register");
//        driver.navigate().to(myurl);

        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        driver.navigate().back();
        System.out.println(driver.getCurrentUrl());

        driver.navigate().forward();
        System.out.println(driver.getCurrentUrl());

        driver.navigate().refresh();

    }
}
