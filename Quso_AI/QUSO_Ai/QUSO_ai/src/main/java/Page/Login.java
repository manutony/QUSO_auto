package Page;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;


public class Login
{
    WebDriver driver ;
    By Username=  By.xpath("/html/body/div[1]/div/div[1]/section/div/div[4]/div[2]/form/div[1]/div[1]/div[2]/input");
    By ContinueWithGmail = By.xpath("/html/body/div[1]/div/div[1]/section/div/div[4]/div[2]/div/div/button");
    By Password= By.xpath("/html/body/div[1]/div/div[1]/section/div/div[4]/div[2]/form/div[1]/div[2]/div[2]/input");
    By LoginBTN= By.xpath("/html/body/div[1]/div/div[1]/section/div/div[4]/div[2]/form/button");
    public Login(WebDriver driver)
{
    this.driver= driver;
}
    public void Login_username()
    {
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));

       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.findElement(ContinueWithGmail).click();
        driver.findElement(Username).click();
        driver.findElement(Username).sendKeys("vikram0812+assignment@proton.me");
        driver.findElement(Password).click();
        driver.findElement(Password).sendKeys("Assignment@2024");
        driver.findElement(LoginBTN).click();
        System.out.println("Successfully Logged-In");



    }



  }
