package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action1 {

	public static void main(String[] args) throws InterruptedException 
	{
      WebDriver driver=new ChromeDriver();
      driver.get("https://www.flipkart.com/");
      driver.manage().window().maximize();
  WebElement   move= driver.findElement(By.xpath("//span[text()='Fashion']"));
      Thread.sleep(2000);
      //Move to the element we need to create actions class
      Actions action=new Actions(driver);
      action.moveToElement(move).build().perform();
      //move to the women ethinic wear
  WebElement   women= driver.findElement(By.xpath("//a[text()='Women Ethnic']"));
  Actions action1=new Actions(driver);
  action1.moveToElement(women).build().perform();
  Thread.sleep(5000);
  driver.findElement(By.xpath("//a[text()='Women Kurtas & Kurtis']")).click();
  //get text of rating
   WebElement text=driver.findElement(By.xpath("//div[text()='4★ & above']"));
   System.out.println(text.getText());
	}

}
