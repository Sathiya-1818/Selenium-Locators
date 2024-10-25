package guvi.org;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Main {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.demoblaze.com");

        driver.manage().timeouts();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        String s = driver.getTitle();
        System.out.println("Title : " + s);

        if(s.equals("STORE")){
            System.out.println("Page landed on Correct Website");
        } else {
            System.out.println("Page is not landed on Correct Website");
        }

        driver.close();
    }
}