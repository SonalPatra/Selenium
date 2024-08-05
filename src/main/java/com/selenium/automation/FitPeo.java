package com.selenium.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.Objects;

public class FitPeo {
    public static void main(String[] args) {
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.fitpeo.com/");
        driver.navigate().to("https://fitpeo.com/revenue-calculator");
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,250)");
        WebElement slider = driver.findElement(By.xpath("//span[@class='MuiSlider-thumb MuiSlider-thumbSizeMedium MuiSlider-thumbColorPrimary MuiSlider-thumb MuiSlider-thumbSizeMedium MuiSlider-thumbColorPrimary css-sy3s50']"));
        Actions move = new Actions(driver);
        Action action = (Action) move.dragAndDropBy(slider,94, 0).build();
        action.perform();
        driver.findElement(By.xpath("//input[@id=':R57alklff9da:']")).clear();
        driver.findElement(By.xpath("//input[@id=':R57alklff9da:']")).sendKeys("560");
        jse.executeScript("window.scrollBy(0,500)");
        driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/label[1]/span[1]/input[1]")).click();
        driver.findElement(By.xpath("//div[@class='MuiBox-root css-1p19z09']//div[2]//label[1]//span[1]//input[1]")).click();
        driver.findElement(By.xpath("//div[3]//label[1]//span[1]//input[1]")).click();
        driver.findElement(By.xpath("//div[8]//label[1]//span[1]//input[1]")).click();
        String result = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/header[1]/div[1]/p[4]/p[1]")).getText();
        if(Objects.equals(result, "$110700")){
            System.out.println("The test is verified");
        }else{
            System.out.println("The test is invalid");
        }
    }
}
