package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormsEightPage extends PageObject {
    public static final Target INPUT_DATE = Target.the("Where we write the corresponding date within 58 days")
            .located(By.name("date"));
    public static final Target CHECKBOX1 = Target.the("Click on the checkbox multiple of 4")
            .located(By.xpath("//input[@value='24']"));
    public static final Target CHECKBOX2 = Target.the("Click on the checkbox multiple of 4")
            .located(By.xpath("//input[@value='20']"));
    public static final Target CHECKBOX3 = Target.the("Click on the checkbox multiple of 4")
            .located(By.xpath("//input[@value='180']"));
    public static final Target OPERATION_RESULT = Target.the("Click on the operation result")
            .located(By.xpath("//input[@value='789444336']"));
    public static final Target INPUT_ANIMAL = Target.the("Where we write the animal number")
            .located(By.name("number"));
    public static final Target BUTTON_OK =  Target.the("Click on the submit button")
            .located(By.xpath("//button[@type='submit']"));
}
