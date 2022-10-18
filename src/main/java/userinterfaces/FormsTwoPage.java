package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormsTwoPage extends PageObject {
    public static final Target INPUT_SHARK = Target.the("Where we write the shark number")
            .located(By.name("number"));
    public static final Target CHECKBOX_OPERATION = Target.the("Click on the checkbox with operation result")
            .located(By.xpath("//input[@value='-126766227']"));
    public static final Target OPERATION_SELECT = Target.the("Selection the operation result")
            .located(By.xpath("//select[@name='select']"));
    public static final Target INPUT_S = Target.the("Where we write the s letter 393 times")
            .located(By.xpath("//textarea[@name='text']"));
    public static final Target BUTTON_OK =  Target.the("Click on the submit button")
            .located(By.xpath("//button[@type='submit']"));
}