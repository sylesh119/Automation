package Main_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_Main {
	public static WebDriver driver = new ChromeDriver();

	public static void Open(String s) {
		try {
			driver.get(s);
			driver.manage().window().maximize();
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void click(String s) throws InterruptedException {
		driver.findElement(By.xpath(s)).click();
		Thread.sleep(2000);
	}

	public static void close() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
	}

}
