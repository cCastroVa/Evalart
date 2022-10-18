package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormsSixPage extends PageObject {
    public static final Target OPERATION_SELECT = Target.the("Selection the operation result")
            .located(By.xpath("//select[@name='select']"));
    public static final Target INPUT_DATE = Target.the("Where we write the corresponding date within 34 days")
            .located(By.name("date"));
    public static final Target INPUT_T_REX = Target.the("Where we write the t-rex number")
            .located(By.name("number"));
    public static final Target CHECKBOX1 = Target.the("Click on the checkbox multiple of 5")
            .located(By.xpath("//input[@value='95']"));
    public static final Target CHECKBOX2 = Target.the("Click on the checkbox multiple of 5")
            .located(By.xpath("//input[@value='80']"));
    public static final Target BUTTON_OK =  Target.the("Click on the submit button")
            .located(By.xpath("//button[@type='submit']"));
}
