package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormsSevenPage extends PageObject {
    public static final Target OPERATION_SELECT = Target.the("Selection the operation result")
            .located(By.xpath("//select[@name='select']"));
    public static final Target INPUT_DATE = Target.the("Where we write the corresponding date of 30 days ago")
            .located(By.name("date"));
    public static final Target INPUT_y = Target.the("Where we write the y letter 91 times")
            .located(By.xpath("//textarea[@name='text']"));
    public static final Target BUTTON_OK =  Target.the("Click on the submit button")
            .located(By.xpath("//button[@type='submit']"));
}
