package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {
    public static final Target INPUT_USER_NAME =  Target.the("Where we write the user name")
            .located(By.name("username"));
    public static final Target INPUT_PASSWORD =  Target.the("Where we write the user password")
            .located(By.name("password"));
    public static final Target BUTTON_LOGIN =  Target.the("Click on the login button")
            .located(By.xpath("//button[@type='submit']"));
}
