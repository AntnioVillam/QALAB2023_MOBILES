package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class SearchScreen extends PageObject {

    @AndroidFindBy(id = "com.airbnb.android:id/start_button")
    private WebElement forSearch;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Search destinations\"]")
    private WebElement searchInput;
    @AndroidFindBy(xpath = "//android.widget.ScrollView/android.view.View[3]/android.widget.Button")
    private WebElement closeBtn;
    @AndroidFindBy(id = "com.airbnb.android:id/map_pill")
    private WebElement mapadeBusqueda;
    @AndroidFindBy(id = "com.airbnb.android:id/n2_bottom_sheet_title_title")
    private WebElement resultText;

    public void clickSearchInput(){
        try{
            Thread.sleep(5000);
        }catch (Exception e){

        }
        try{
            System.out.println("Se cerrara una ventana...");
            closeBtn.click();

        }catch (Exception e){
            System.out.println("Error:"+e.getMessage());
        }
        forSearch.click();
            System.out.println("Se hara clic en el campo de busqueda");

        WebDriverWait wait = new WebDriverWait(getDriver(), 20);
        wait.until(ExpectedConditions.elementToBeClickable(searchInput));
        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        searchInput.click();

    }
    public String getResultText(){

        try{
            Thread.sleep(2000);
        }catch (Exception e){

        }
        try{
            mapadeBusqueda.click();
        }catch (Exception e){
            System.out.println("Error:"+e.getMessage());
        }

        return resultText.getText();
    }
}
