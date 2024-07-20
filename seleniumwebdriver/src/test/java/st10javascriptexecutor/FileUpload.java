package st10javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
    public static void main(String args[]) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
        driver.manage().window().maximize();

//        JavascriptExecutor js = (JavascriptExecutor) driver;

        //Single File Upload
        String currPath = System.getProperty("user.dir");
        String filepath= currPath + "\\Test1file.pdf";
        driver.findElement(By.xpath("//input[@id=\"filesToUpload\"]")).sendKeys(filepath);
        //Validating if file uploaded
        if(driver.findElement(By.xpath("//ul[@id=\"fileList\"]//li")).getText().equals("Test1file.pdf"))
        {
            System.out.println("File uploaded");
        }
        else
        {
            System.out.println("File upload fail");

        }


        //Multiple File Upload
        String filepath1= currPath + "\\Test1file.pdf";
        String filepath2= currPath + "\\Test2file.pdf";
        driver.findElement(By.xpath("//input[@id=\"filesToUpload\"]")).sendKeys(filepath1 + "\n" + filepath2);
        int fileSize = driver.findElements(By.xpath("//ul[@id=\"fileList\"]//li")).size();
         if(fileSize==3)
         {
             System.out.println("All files are uplaoded");
         }
         else {
             System.out.println("Failed : All files are not  uplaoded");

         }







    }
}
