package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormsFivePage extends PageObject {
    public static final Target OPERATION_RESULT = Target.the("Click on the operation result")
            .located(By.xpath("//input[@value='16973118']"));
    public static final Target INPUT_B = Target.the("Where we write the B letter 414 times")
            .located(By.xpath("//textarea[@name='text']"));
    public static final Target INPUT_DATE = Target.the("Where we write the corresponding date of 111 days ago")
            .located(By.name("date"));
    public static final Target OPERATION_SELECT = Target.the("Selection the operation result")
            .located(By.xpath("//select[@name='select']"));
    public static final Target BUTTON_OK =  Target.the("Click on the submit button")
            .located(By.xpath("//button[@type='submit']"));
}
