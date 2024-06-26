package st9actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {
    public static void main(String args[]) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://text-compare.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//textarea[@name=\"text1\"]")).sendKeys("Hello I am Aashma");

        Actions act = new Actions(driver);

        // Pressing Control A to select text
        act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();

        //Copy
        act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();

        //Tab = To shift to Text2
        act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();

        //Paste text
        act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();

    }
}
