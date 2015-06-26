package spider;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class spider1
{
   public static void main(String[] args)
   {
      WebDriver driver = new FirefoxDriver();
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      driver.navigate().to("http://www.shophive.com/apple/mac?p=");
      driver.manage().window().maximize();
      java.util.List<WebElement>
      priceList = driver.findElements(By.className("price-box")); 
      java.util.List<WebElement>
      productNameList = driver.findElements(By.className("product-name"));
      try{
      for(int n=0;n<=priceList.size();n++)
      {
      System.out.println("Product Number: "+n+1+ "\n Product name = " + productNameList.get(n).getText() + "\nPrice = "+priceList.get(n).getText() ); 
      }

      }catch(IndexOutOfBoundsException e)
      {
      System.out.println("The End");
      }
      
      WebElement R = driver.findElement(By.xpath("//div[1]/ol/li/a"));
      
      System.out.println(" The Result is " + R);

      driver.close();
   }
}