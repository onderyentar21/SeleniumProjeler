package Lesson_21FileDownloadandFileUptade;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class File_Uptade {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String url = "https://the-internet.herokuapp.com/upload";
        driver.get(url);

        Thread.sleep(2000);

        WebElement uploadCl = driver.findElement(By.xpath("//input[@id='file-upload']"));
        //String dosyaYolu = System.getProperty("user.home") + "\\Downloads\\TextDoc.txt";
        String localWay = System.getProperty("user.home")+"\\Downloads\\TextDoc.txt";
        uploadCl.sendKeys(localWay);
        Thread.sleep(2000);
        WebElement submit = driver.findElement(By.id("file-submit"));
        submit.click();
        Thread.sleep(3000);

        WebElement isCoreckt = driver.findElement(By.xpath("//h3[.='File Uploaded!']"));
        String degerKontrol = isCoreckt.getText();
        if (isCoreckt.isDisplayed()){
            System.out.println("Test passed!");
        }else{
            System.out.println("Test failed.");
        }

        driver.quit();

    }
}
