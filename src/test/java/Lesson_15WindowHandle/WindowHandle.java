package Lesson_15WindowHandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandle {
   static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        //System.setProperty("webdriver.chrome.driver","C:\\project\\chromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        //   https://the-internet.herokuapp.com/windows URL gidin
        String url = "https://the-internet.herokuapp.com/windows";
        driver.get(url);

        Thread.sleep(2000);

        String windowHandle1 = driver.getWindowHandle();

        WebElement clickFirst = driver.findElement(By.xpath("//*[@id=\"content\"]/div/a"));
        clickFirst.click();
        Thread.sleep(2000);

        Set<String > allWindowHandle = driver.getWindowHandles();
        System.out.println("allWindowHandle = " + allWindowHandle);


        Thread.sleep(1000);
        String windowHandle2 = "";
      for(String w : allWindowHandle){
          if (!w.equals(windowHandle1)){
             windowHandle2=w;
          }
         // driver.switchTo().window(windowHandle2);
      }
        driver.switchTo().window(windowHandle2);
      Thread.sleep(2000);
      WebElement dogrulama = driver.findElement(By.xpath("//h3[.='New Window']"));

        System.out.println("Doğrulama : "+dogrulama.getText());
        Thread.sleep(2000);
        driver.switchTo().window(windowHandle1);
        System.out.println("Geri donus kanit: "+driver.getTitle());
        Thread.sleep(2000);

        WebElement secondClick = driver.findElement(By.xpath("//a[.='Elemental Selenium']"));
        secondClick.click();
        String windowHandle3 = "";
        Set<String> allWindows2 = driver.getWindowHandles();
        for(String allPage: allWindows2){
            if (!(allPage.equals(windowHandle1)&&allPage.equals(windowHandle2))){
               windowHandle3=allPage;

            }
        }
        driver.switchTo().window(windowHandle3);




        System.out.println("3. sayfanın window handle degeri: "+windowHandle3);
        System.out.println("Tüm sayfanın windows degeri : "+ allWindows2);
        System.out.println("3.sayfayı dogrulama : "+ driver.getTitle());
        Thread.sleep(2000);
        driver.close();
        //or
        driver.switchTo().window(windowHandle1);
        Thread.sleep(2000);
        System.out.println("Son dogrulma : "+driver.getTitle());


        Thread.sleep(2000);
        driver.quit();





    }
    public  static void ilkDeneme() throws InterruptedException {
        String windowHandle1 = driver.getWindowHandle();

        WebElement clickHereButton = driver.findElement(By.xpath("//a[.='Click Here']"));
        clickHereButton.click();


        //sonda bütün windows degerleri aynı set içinde alıyoruz.
        Set<String> handleDegerleriSet = driver.getWindowHandles();

        //degisken isminin yanin handledegerlerSet.soutv

        System.out.println("handleDegerleriSet = " + handleDegerleriSet);
        String windowHandle2 = "";


        for(String each: handleDegerleriSet){
            if (!each.equals(windowHandle1)){
                windowHandle2=each;
            }
            driver.switchTo().window(windowHandle2);

            WebElement sondeger = driver.findElement(By.xpath("//div[@class=\"example\"]"));
            System.out.println("Son acıklama: "+ sondeger.getText());

        }
        Thread.sleep(2000);

        driver.close();
        Thread.sleep(1000);

        driver.quit();
    }
}
