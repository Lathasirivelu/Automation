package demo1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Loginpage {

	public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.edge.driver", "C:\\Users\\Admin\\Downloads\\msedgedriver.exe");

	        // Initialize WebDriver
	        WebDriver driver = new EdgeDriver();

	        driver.manage().window().maximize();
            driver.get("https://demo.dealsdray.com");
            driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);


            JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;

//            driver.findElement(By.xpath("//input[@name='username']")).sendKeys("prexo.mis@dealsdray.com");
//            driver.findElement(By.xpath("//input[@name='password']")).sendKeys("prexo.mis@dealsdray.com");
//            driver.findElement(By.xpath("(//*[.='Login'])[3]")).click();
//            driver.manage().timeouts().implicitlyWait(2000, null);
            WebDriverWait wait =new WebDriverWait(driver, 10);
//            WebElement offer  =   driver.findElement(By.xpath("//*[@class='sidenavHoverShow css-1s178v5']"));
////            WebElement offers=wait.until(ExpectedConditions.elementToBeClickable(offer));
//            offer.click();
            WebElement usernameField = driver.findElement(By.cssSelector("input[name='username']"));
            usernameField.sendKeys("prexo.mis@dealsdray.com");

            WebElement passwordField = driver.findElement(By.cssSelector("input[name='password']"));
            passwordField.sendKeys("prexo.mis@dealsdray.com");

            WebElement loginButton = driver.findElement(By.cssSelector("button[type='submit']")); 
            loginButton.click();

            WebElement offer = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".sidenavHoverShow.css-1s178v5")));
            offer.click();
            JavascriptExecutor js = (JavascriptExecutor) driver;

            js.executeScript("window.scrollBy(0,250)", "");


            driver.findElement(By.xpath("(//button[@name='child'])[2]")).click();
//            wait = new WebDriverWait(driver, 90);
//
//            WebElement addBulkOrdersButton = driver.findElement(By.cssSelector(".add-bulk-orders"));
//            addBulkOrdersButton.click();
            WebElement element = driver.findElement(By.xpath("//button[@type='button' and @align='right']"));
            if (element.isDisplayed() && element.isEnabled()) {
                element.click();
            } else {
                System.out.println("Element is not visible or enabled");
            }


            driver.findElement(By.xpath("//input[@id='mui-7']")).sendKeys("C:\\Users\\Admin\\Downloads");
            driver.findElement(By.xpath("//*[text()='Import']")).click();

             
	               
	            }
	        }

	





