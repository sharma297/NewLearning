import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BrowserLaunch {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Driver/chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\sharma.hemant\\eclipse-workspace\\NewLearning\\Driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get("https://www.marketo.com/demo/focus/");

		List<WebElement> list = driver.findElements(By.cssSelector("#Country>option"));
		int size = list.size();
		System.out.println(size);
		
		for(int i =1 ;i<=list.size();i++) {
			if(list.get(i).getText().contains("Albania")) {
				list.get(i).click();
				break;
			}
		}

		
	}

}
