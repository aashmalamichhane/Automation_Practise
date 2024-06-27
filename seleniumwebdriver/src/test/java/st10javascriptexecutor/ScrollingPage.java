package st10javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingPage {

public static void main (String args[]) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor)driver;

        //Scroll down to page by pixel
        js.executeScript("window.scrollBy(0,500)", "");

        //Scroll unless element is visible
        WebElement el = driver.findElement(By.xpath("//strong[normalize-space()=\"Featured products\"]"));
        js.executeScript("arguments[0].scrollIntoView();" , el);

        //Scroll page till end
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        Thread.sleep(4000);

        //Scroll to initial position
        js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");



}
}

