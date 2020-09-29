import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginTestCase {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "//Users//mahabaleshwar//Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://rediffmail.com");
		driver.findElement(By.xpath("//*[@id=\'signin_info\']/a[1]")).click();
		driver.findElement(By.xpath("//*[@id=\'login1\']")).sendKeys("abc@rediffmail.com");
		driver.findElement(By.xpath("//*[@id=\'password\']")).sendKeys("abc@123");
		driver.findElement(By.xpath("//*[@id=\'remember\']")).click();
		driver.findElement(By.xpath("//input[@name='proceed']")).click();
        driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/div[2]/form/div[2]/div/a/u")).click();
        driver.findElement(By.xpath("//*[@id=\'tblcrtac\']/tbody/tr[3]/td[3]/input")).sendKeys("pavitra H");
        driver.findElement(By.xpath("//*[@id=\'tblcrtac\']/tbody/tr[7]/td[3]/input[1]")).sendKeys("test");
        driver.findElement(By.xpath("//*[@id=\'tblcrtac\']/tbody/tr[7]/td[3]/input[2]")).click();
        driver.findElement(By.xpath("//*[@id=\'tblcrtac\']/tbody/tr[24]/td[3]/input[2]")).click();
        driver.findElement(By.xpath("//*[@id=\'tblcrtac\']/tbody/tr[9]/td[3]/input")).sendKeys("123");
        driver.findElement(By.xpath("//*[@id=\'tblcrtac\']/tbody/tr[11]/td[3]/input")).sendKeys("123");
        driver.findElement(By.xpath("//*[@id=\'mobno\']")).sendKeys("12345678");
      

	}

}
