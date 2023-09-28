package Lesson_05WindowManage;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManageWindows2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com");
        System.out.println("Saydanın konumu: "+driver.manage().window().getPosition());
        System.out.println("Sayfanın boyutu max :"+driver.manage().window().getSize());
        // 3. sayfanın konumunu ve boyutune istediğiniz şekilde ayarlayın
        // sayfanın konumu.
        driver.manage().window().setPosition(new Point(0,0));
        //sayfanın boyutu
        driver.manage().window().setSize(new Dimension(520,720));

        int xkoor = driver.manage().window().getPosition().getX();
        int ykoor = driver.manage().window().getPosition().getY();
        int width = driver.manage().window().getSize().getWidth();
        int height = driver.manage().window().getSize().getHeight();
        System.out.println("sayfanın yeni boyutları:");
        System.out.println("xkoor:"+xkoor+" ykoor: "+ykoor+" wigth: "+width+" height: "+height);




        if (xkoor== 0 && ykoor == 0 && width == 520 && height== 720){
            System.out.println("Test passed");

        }else{
            System.out.println("Test failed!");
        }


        Thread.sleep(2000);
        driver.quit();

    }
}
