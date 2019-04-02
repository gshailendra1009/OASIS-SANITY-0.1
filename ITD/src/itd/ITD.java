package itd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
//import com.opera.core.systems.scope.services.Exec;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.By;

public class ITD {
	ExtentReports extent;
	@Test
 
     public void OASIS_APPLICATIONS_URL_HEALTH_CHECK() throws IOException, InterruptedException{
		int a=1;
        while(a<=1)
        {
		// Create object of extent report and specify the Class name in get method
         extent = ExtentReports.get(ITD.class);
         // Call init method and specify the location where you want to save this report
         // second parameter is set to true it means it will overwrite report with new one
         extent.init("C:\\log\\OASIS-URL-HealthCheck-Report.html", true);
    	  try
    	  {
           // Start Test
           extent.startTest("URL Health Check for OASIS Apps");
           // Start browser
           WebDriver driver=new FirefoxDriver();
           driver.manage().window().maximize();
           extent.log(LogStatus.INFO, "Browser Opened Successfully.");
           Runtime.getRuntime().exec("C:\\Shailendra_124692\\D drive\\URL_SANITY\\Files_ExE\\a.exe");
           driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
           // get title
           //String title=driver.getTitle();
            //extent.log(LogStatus.INFO, "Get the current title");
			driver.get("https://itd.click.int.bell.ca:9090/ITDWeb/index.jsp");
			Thread.sleep(3000);
			// Verify title
            //Assert.assertTrue(title.contains("ITD"));
            //extent.log(LogStatus.PASS, "Title verified");
            extent.log(LogStatus.INFO, "ITD LB URL Opened Successfully");
            driver.findElement(By.xpath(".//*[@id='telNum']")).sendKeys("9056598592");
			Thread.sleep(3000);
		    driver.findElement(By.xpath(".//*[@id='testButton']")).click();
		    Thread.sleep(7000);
		     File screenshotFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			 FileUtils.copyFile(screenshotFile1, new File("C:\\Shailendra_124692\\D drive\\URL_SANITY\\ScreenShot\\ITD-LB.png"));
		    extent.attachScreenshot("C:\\Shailendra_124692\\D drive\\URL_SANITY\\ScreenShot\\ITD-LB.png");
		    driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
		    driver.get("https://dc4c5n.qc.bell.ca:9090/ITDWeb/index.jsp");
			Thread.sleep(3000);
			extent.log(LogStatus.INFO, "ITD PROD-1 URL Opened Successfully");
			System.out.println("Launch ITD PROD1 Successfully");
			//logger.info("ITD URL OPENED SUCCESSFULLY");
			driver.findElement(By.xpath(".//*[@id='telNum']")).sendKeys("9056598592");
			Thread.sleep(3000);
		    driver.findElement(By.xpath(".//*[@id='testButton']")).click();
		    Thread.sleep(7000);
		    File screenshotFile2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			 FileUtils.copyFile(screenshotFile2, new File("C:\\Shailendra_124692\\D drive\\URL_SANITY\\ScreenShot\\ITD-PROD-1.png"));
		    extent.attachScreenshot("C:\\Shailendra_124692\\D drive\\URL_SANITY\\ScreenShot\\ITD-PROD-1.png");
		    driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"\t");
			//driver.switchTo().window(tabs2.get(1));
			driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
			driver.get("https://dc5cin.qc.bell.ca:9090/ITDWeb/index.jsp");
			Thread.sleep(3000);
			extent.log(LogStatus.INFO, "ITD PROD-2 URL Opened Successfully");
			System.out.println("Launch ITD PROD2 Successfully");
			//logger.info("ITD URL OPENED SUCCESSFULLY");
			driver.findElement(By.xpath(".//*[@id='telNum']")).sendKeys("9056598592");
			Thread.sleep(3000);
		    driver.findElement(By.xpath(".//*[@id='testButton']")).click();
		    Thread.sleep(7000);
		    File screenshotFile3 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			 FileUtils.copyFile(screenshotFile3, new File("C:\\Shailendra_124692\\D drive\\URL_SANITY\\ScreenShot\\ITD-PROD-2.png"));
		    extent.attachScreenshot("C:\\Shailendra_124692\\D drive\\URL_SANITY\\ScreenShot\\ITD-PROD-2.png");
		    driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"\t");
			//driver.switchTo().window(tabs2.get(2));
			driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
			//driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
			driver.get("https://dm5cvd.on.bell.ca:9090/ITDWeb/index.jsp");
			Thread.sleep(3000);
			extent.log(LogStatus.INFO, "ITD PROD-4 URL Opened Successfully");
			System.out.println("Launch ITD PROD4 Successfully");
			//logger.info("ITD URL OPENED SUCCESSFULLY");
			driver.findElement(By.xpath(".//*[@id='telNum']")).sendKeys("9056598592");
			Thread.sleep(3000);
		    driver.findElement(By.xpath(".//*[@id='testButton']")).click();
		    Thread.sleep(7000);
		    File screenshotFile4 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			 FileUtils.copyFile(screenshotFile4, new File("C:\\Shailendra_124692\\D drive\\URL_SANITY\\ScreenShot\\ITD-PROD-4.png"));
		    extent.attachScreenshot("C:\\Shailendra_124692\\D drive\\URL_SANITY\\ScreenShot\\ITD-PROD-4.png");
			extent.log(LogStatus.INFO, "ITD Application Sanity is Green Including Job Query");
			//SANITY FOR JSV APPLICATION
			
            // Close application
            driver.quit();
            extent.log(LogStatus.INFO, "Browser closed");
            // close report
            extent.endTest();
    	  }
    	  
    	  catch(TimeoutException e)
	       {
    		// Create object of extent report and specify the Class name in get method
              //ExtentReports extent = ExtentReports.get(ITD.class);
              // Call init method and specify the location where you want to save this report
              // second parameter is set to true it means it will overwrite report with new one
              //extent.init("C:\\log\\OASIS-URL-HealthCheck-Report.html", true);
              //extent1.log(LogStatus.FAIL,e);
              //  Thread.currentThread().getStackTrace()
              extent.log(LogStatus.FAIL, "URL CHECK FAILED.Please Check..." +e);
              continue;
           
              //extent.endTest();
              
	       }
    	
        }
 
 
     }
 
 
 
}
