package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormsThreePage extends PageObject {
    public static final Target SELECT_OPERATION = Target.the("Selection the operation result")
            .located(By.xpath("//select[@name='select']"));
    public static final Target INPUT_DATE = Target.the("Where we write the corresponding date within 118 days")
            .located(By.name("date"));
    public static final Target CHECKBOX1 = Target.the("Click on the checkbox multiple of 5")
            .located(By.xpath("//input[@value='115']"));
    public static final Target CHECKBOX2 = Target.the("Click on the checkbox multiple of 5")
            .located(By.xpath("//input[@value='60']"));
    public static final Target CHECKBOX3 = Target.the("Click on the checkbox multiple of 5")
            .located(By.xpath("//input[@value='25']"));
    public static final Target CHECKBOX4 = Target.the("Click on the checkbox multiple of 5")
            .located(By.xpath("//input[@value='120']"));
    public static final Target CHECKBOX5 = Target.the("Click on the checkbox multiple of 5")
            .located(By.xpath("//input[@value='10']"));
    public static final Target OPERATION_RESULT = Target.the("Click on the operation result")
            .located(By.xpath("//input[@value='-17633']"));
    public static final Target BUTTON_OK =  Target.the("Click on the submit button")
            .located(By.xpath("//button[@type='submit']"));
}
