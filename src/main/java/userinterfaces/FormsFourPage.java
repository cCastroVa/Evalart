package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormsFourPage extends PageObject {
    public static final Target INPUT_C = Target.the("Where we write the C letter 363 times")
            .located(By.xpath("//textarea[@name='text']"));
    public static final Target OPERATION_SELECT = Target.the("Selection the operation result")
            .located(By.xpath("//select[@name='select']"));
    public static final Target OPERATION_RESULT = Target.the("Click on the checkbox with operation result")
            .located(By.xpath("//input[@value='204306210']"));
    public static final Target CHECKBOX1 = Target.the("Click on the checkbox multiple of 9")
            .located(By.xpath("//input[@value='153']"));
    public static final Target CHECKBOX2 = Target.the("Click on the checkbox multiple of 9")
            .located(By.xpath("//input[@value='108']"));
    public static final Target CHECKBOX3 = Target.the("Click on the checkbox multiple of 9")
            .located(By.xpath("//input[@value='144']"));
    public static final Target CHECKBOX4 = Target.the("Click on the checkbox multiple of 9")
            .located(By.xpath("//input[@value='36']"));
    public static final Target CHECKBOX5 = Target.the("Click on the checkbox multiple of 9")
            .located(By.xpath("//input[@value='126']"));
    public static final Target BUTTON_OK =  Target.the("Click on the submit button")
            .located(By.xpath("//button[@type='submit']"));
}
