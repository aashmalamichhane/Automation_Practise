package start1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 Test case
 1. Launch browser
 2. Open URL https://www.demoblaze.com/
 3. Validate title should be "STORE"
 4. Close browser
 */

public class FirstTestCase {
	public static void main(String[] args) {
		// 1. Launch browser (chrome)
		//ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		
		//2. Open URL https://www.demoblaze.com/
		driver.get("https://www.demoblaze.com/");

		// 3. Validate title should b "OrangeHRM"
		String act_title = driver.getTitle();
		if(act_title.equals("STORE"))
		{
			System.out.println("Test Passed Title Match");
		}
		else {
			System.out.println("Test Failed Title Not Match");
		}
		
		// 4. Close browser
		driver.close();

		
	}

}
