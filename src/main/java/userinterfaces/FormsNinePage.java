package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormsNinePage extends PageObject {
    public static final Target OPERATION_RESULT = Target.the("Click on the checkbox with operation result")
            .located(By.xpath("//input[@value='-9027']"));
    public static final Target INPUT_DATE = Target.the("Where we write the corresponding date of 29 days ago")
            .located(By.name("date"));
    public static final Target INPUT_ANIMAL = Target.the("Where we write the animal number")
            .located(By.name("number"));
    public static final Target OPERATION_SELECT = Target.the("Selection the operation result")
            .located(By.xpath("//select[@name='select']"));
    public static final Target BUTTON_OK =  Target.the("Click on the submit button")
            .located(By.xpath("//button[@type='submit']"));
}
