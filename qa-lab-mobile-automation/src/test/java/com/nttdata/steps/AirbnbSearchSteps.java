package com.nttdata.steps;

import com.nttdata.screens.LoginScreen;
import com.nttdata.screens.SearchDetailsScreen;
import com.nttdata.screens.SearchScreen;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AirbnbSearchSteps {

    LoginScreen loginScreen;
    SearchScreen searchScreen;
    SearchDetailsScreen searchDetailsScreen;


    @Step("Click en cerrar")
    public void clickClose(){
        loginScreen.clickClose();
    }
    @Step("Click en skip")
    public void clickSkip(){
        searchDetailsScreen.clickSkip();
    }
    @Step("Click en skip")
    public void clickSearch(){
        searchDetailsScreen.clickSearch();
    }

    @Step("Búsqueda por texto {0}")
    public void searchByText(String place){
        System.out.println("Se hara clic en el campo de busqueda...");
        searchScreen.clickSearchInput();
        System.out.println("Se ingresara la busqueda...");
        searchDetailsScreen.enterSearchInput(place);
        searchDetailsScreen.clickSkip();
        searchDetailsScreen.clickSearch();

    }

    @Step("Obtiene el texto del resultado")
    public String getResultText(){
        return searchScreen.getResultText();
    }
}
