package com.nttdata.stepsdefinitions;

import com.nttdata.steps.AirbnbSearchSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

import java.io.File;

public class AirbnbSearchStepsDefs {

    @Steps
    AirbnbSearchSteps airbnbSearchSteps;

    @Given("que me enuentro en el login de Airbnb")
    public void que_me_enuentro_en_el_login_de_airbnb() {
        airbnbSearchSteps.clickClose();
    }
    @And("cierro cualquier ventana emergente")
    public void cierroCualquierVentanaEmergente() {
    }
    @When("busco {string} en el campo de Where To?")
    public void buscoEnElCampoDeWhereTo(String place) {
        airbnbSearchSteps.searchByText(place);
    }
    @And("selecciono Skip en el formulario de When's your trip?")
    public void seleccionoSkipEnElFormularioDeWhenSYourTrip() {
        airbnbSearchSteps.clickSkip();
    }
    @And("hago clic en el botón de Search")
    public void hagoClicEnElBotónDeSearch() {
        airbnbSearchSteps.clickSearch();
    }
    @Then("valido que hay más de {int} resultado")
    public void validoQueHayMásDeResultado(int arg0) {
    }
    @Then("muestra el texto {string}")
    public void muestra_el_texto(String text) {

        Assert.assertEquals(airbnbSearchSteps.getResultText(), text);
    }

}
