package userinterfaces;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FormsTenPage extends PageObject {
    public static final Target INPUT_ANIMAL = Target.the("Where we write the animal number")
            .located(By.name("number"));
    public static final Target CHECKBOX = Target.the("Click on the checkbox multiple of 6")
            .located(By.xpath("//input[@value='84']"));
    public static final Target OPERATION_RESULT = Target.the("Click on the checkbox with operation result")
            .located(By.xpath("//input[@value='-16335']"));
    public static final Target INPUT_H = Target.the("Where we write the H letter 145 times")
            .located(By.xpath("//textarea[@name='text']"));
    public static final Target BUTTON_OK =  Target.the("Click on the submit button")
            .located(By.xpath("//button[@type='submit']"));
    public static final Target MESSAGE =  Target.the("Where we obtain the message with the response")
            .located(By.xpath("//h1[contains(text(),'Felicidades')]"));
}
