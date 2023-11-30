package com.nttdata.screens;


import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
public class SearchDetailsScreen extends PageObject {


    @AndroidFindBy(id = "com.airbnb.android:id/input_bar_input")
    private WebElement barradeBusqueda;
    @AndroidFindBy(xpath = "(//android.widget.FrameLayout[@resource-id=\"com.airbnb.android:id/content_container\"])[2]/android.view.ViewGroup")
    private WebElement firstOption;

    @AndroidFindBy(id = "com.airbnb.android:id/n2_simple_search_footer_link")
    private WebElement nextButton;

    @AndroidFindBy(id = "com.airbnb.android:id/n2_dls_action_footer_gradient_button")
    private WebElement searchButton;

    public void enterSearchInput(String place){
        try {
            Thread.sleep(2000);
        } catch (Exception e) {

        }
        try{
            barradeBusqueda.click(); // Hacer clic en el campo de búsqueda

            barradeBusqueda.sendKeys(place); // Ingresar el texto de búsqueda
        }catch (Exception e){

        }

        String cmd = "adb shell input keyevent 66";
        try {
            Runtime.getRuntime().exec(cmd);
        }catch(Exception e) {

        }
    }
    public void clickSkip(){
        try {
            Thread.sleep(2000);
        } catch (Exception e) {

        }
        try{
            nextButton.click();
        }catch (Exception e){

        }

    }

    public void clickSearch(){
        try {
            Thread.sleep(2000);
        } catch (Exception e) {

        }
        try{
            searchButton.click();
        }catch (Exception e){

        }

    }
}
