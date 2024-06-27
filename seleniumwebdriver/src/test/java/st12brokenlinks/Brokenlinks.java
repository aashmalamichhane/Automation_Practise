package st12brokenlinks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

public class Brokenlinks {


    //CAPTURE HREF ATTRIBUTE VALUE
    //VALIDATE STATUS CODE

    public static void main(String args[]) throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.deadlinkcity.com/");
        driver.manage().window().maximize();
         List<WebElement> links = driver.findElements(By.tagName("a"));
         System.out.println("The number of links are" + links.size());

         for (WebElement link : links)
         {
            String hrefAttriValue= link.getAttribute("href");
            if(hrefAttriValue==null || hrefAttriValue.isEmpty())
            {
                System.out.println("Href Value is empty or null , not possible to check");
                continue;
            }

            //passing the URl o server to get status code, converting string to URL

             try {
                 URL linkURL = new URL(hrefAttriValue); //converted to URL
                 HttpURLConnection connlinkURL = (HttpURLConnection) linkURL.openConnection(); //Open connection to server
                 connlinkURL.connect();  //connect to server and send request to server

                 if (connlinkURL.getResponseCode() >= 400) {
                     System.out.println(hrefAttriValue + "----------------->Broken link");
                 } else {
                     System.out.println(
                             (hrefAttriValue + "------------------>Not broken link")
                     );
                 }
             }
             catch (Exception e)
             {

             }

         }
    }
}
