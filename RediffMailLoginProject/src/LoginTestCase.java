import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestCase {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "//Users//mahabaleshwar//Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://rediffmail.com");
		driver.findElement(By.xpath("//*[@id=\'signin_info\']/a[1]")).click();

	}

}
