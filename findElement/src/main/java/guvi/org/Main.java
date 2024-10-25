package guvi.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Main {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.wikipedia.org/");

        driver.manage().timeouts();
        driver.manage().window().maximize();

        String s = driver.getTitle();
        System.out.println("Title : " + s);
        System.out.println();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.name("search")).sendKeys("Artificial Intelligence");
        driver.findElement(By.xpath("//*[@id=\"search-form\"]/fieldset/button/i")).click();

        String a = driver.getTitle();
        System.out.println("Current Title : " + a);
        System.out.println();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//*[@id=\"toc-History\"]/a/div/span[2]")).click();

        System.out.println();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String b = driver.getCurrentUrl();
        System.out.println("Current URL : " + b);

        System.out.println();
    }
}