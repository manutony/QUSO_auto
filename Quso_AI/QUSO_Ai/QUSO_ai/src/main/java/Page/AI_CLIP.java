package Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class AI_CLIP
{
    WebDriver driver;
   By Ai_Clip= By.xpath("/html/body/div[1]/div/div[1]/main/div[2]/div[2]/div/div[3]/div/div[2]/div[1]/div[1]/div");
   By Upload_Video= By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div[2]/div/div/div[1]/div[3]/div[2]/div/div/div[2]/div/div[2]/div[2]/div/button/div[1]");

    public AI_CLIP(WebDriver driver)
    {
        this.driver= driver;
    }
    public void Edit_Vid()
    {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(Ai_Clip).click();
        System.out.println("Navigate to AI Clip");
        driver.findElement(Upload_Video).click();
        System.out.println("Clicked on Upload a Video");


        Robot robot = new Robot();
        String filePath = "C:\\Users\\mariy\\Downloads\\videoplayback.mp4";
        StringSelection selection = new StringSelection(filePath);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        System.out.println("Uploaded");

    }


}
