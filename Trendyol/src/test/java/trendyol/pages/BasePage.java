package trendyol.pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import trendyol.utilities.MyDriver;

public abstract class BasePage {

    public BasePage(){

        PageFactory.initElements(MyDriver.getdriver(),this);
    }

}
