package home;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class TestAmazonSearch extends CommonAPI{

    @Test
    public static void testHome(){
        System.out.println(driver.getTitle());
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Java Books", Keys.ENTER);
        System.out.println(driver.getCurrentUrl());
    }
}
