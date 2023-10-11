package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.AutomationPracticeService;
import org.openqa.selenium.JavascriptExecutor;

import java.util.Scanner;


public class AutomationPracticeStep extends PageSteps {

    @Given("el usuario se dirige a la pagina automationTesting")
    public void elUsuarioSeDirigeALaPaginaAutomationTesting() {
        AutomationPracticeService.navegarWeb();
    }

    @Then("se verifica que la home page tenga tres {string}")
    public void seVerificaQueLaHomePageTengaTres(String btn) {
            if (btn.equals("Sliders")) {
                AutomationPracticeService.clickSliders();
            }
    }


    @When("haga clic en el menú {string}")
    public void hagaClicEnElMenu(String btn) {

        AutomationPracticeService.clickMyAccount();
    }

    @And("ingresa el nombre de usuario {string} y contraseña {string}")
    public void ingresaElNombreDeUsuarioYContrasena(String user, String password) {
        AutomationPracticeService.rellenarCampo();
    }

    @When("hace clic en el menu {string}")
    public void haceClicEnElMenu(String btn) {
        switch (btn){
            case "Tienda":
                AutomationPracticeService.clickStore();
                break;
            case "Filtro":
                AutomationPracticeService.clickFilter();
                break;


        }
    }

    @And("hace clic en {string}")
    public void haceClicEn(String btn) {
        if (btn.equals("Inicio")) {
            AutomationPracticeService.clickHome();
        }
    }

    @And("haga clic en el botón {string}")
    public void hagaClicEnElBoton(String btn) {
        if (btn.equals("Login")) {
            AutomationPracticeService.login();
        }
    }

}
