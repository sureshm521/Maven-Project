package MavenSelenium.MavenSelenium;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.google.inject.internal.BytecodeGen.Visibility;
public class Sample
{
	public void main(String[] args) throws IOException
	{
		System.setProperty("Webdriver.chrome.driver", "c:\\fgfg\\dd.exe");
		FirefoxDriver driver=new FirefoxDriver();
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File(""));
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		List<WebElement> links=driver.findElements(By.tagName("a"));
		Actions a=new Actions(driver);
		a.build().perform();
		List<WebElement> frames=driver.findElements(By.tagName("iframes"));
		Set<String> windowids=driver.getWindowHandles();
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(" ")));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("")));
		FluentWait<WebDriver> wait1=new FluentWait<WebDriver>(driver).withTimeout(30, TimeUnit.SECONDS).pollingEvery(2,TimeUnit.SECONDS);
		FluentWait<WebDriver> wait2=new FluentWait<WebDriver>(driver).withTimeout(20,TimeUnit.SECONDS).pollingEvery(2, TimeUnit.SECONDS);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
	}
}