package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SystemUser {
    WebDriver driver;
    By Add= By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input");


    public SystemUser(WebDriver driver)
    {
        this.driver=driver;
    }
    public void Click()
    {
        driver.findElement(By.className("oxd-input oxd-input--active")).click();

    }
}
