package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.GoogleConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class AutomationPracticeService extends ActionManager {

    public static void navegarWeb(){

        navigateTo("https://practice.automationtesting.in/");

    }
    public static void clickStore() {
        click("xpath://*[@id=\"menu-item-40\"]/a");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
    public static void clickFilter() {
        click("xpath://*[@id=\"woocommerce_price_filter-2\"]/form/div/div[2]/button");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
    public static void clickHome() {
        click("xpath://*[@id=\"content\"]/nav/a");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
    public static void clickSliders() {
        int i;
        for (i=0; i < 2; i++){
            click("xpath://*[@id=\"n2-ss-6-arrow-next\"]/img");
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
    public static void clickArrivals() {
        click("xpath://*[@id=\"themify_builder_content-222\"]/div[2]/div");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
    public static void clickMyAccount() {
        click("xpath://*[@id=\"menu-item-50\"]/a");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }


    public static void rellenarCampo() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://practice.automationtesting.in/my-account/");

        // Localizar el campo de entrada por su expresión XPath
        WebElement campoUser = driver.findElement(By.xpath("//*[@id=\"username\"]"));

        // Utilizar el método .sendKeys() para ingresar texto en el campo de entrada
        campoUser.sendKeys("brianazcona25");
        // Localizar el campo de entrada por su expresión XPath
        WebElement campoPassword = driver.findElement(By.xpath("//*[@id=\"password\"]"));

        // Utilizar el método .sendKeys() para ingresar texto en el campo de entrada
        campoPassword.sendKeys("Corrientes1025");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
    public static void login() {
        click("xpath://*[@id=\"customer_login\"]/div[1]/form/p[3]/input[3]");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
