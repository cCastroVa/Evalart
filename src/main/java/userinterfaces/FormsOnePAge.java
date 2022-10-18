package userinterfaces;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FormsOnePAge extends PageObject {
    public static final Target INPUT_T_REX = Target.the("Where we write the t-rex number")
            .located(By.name("number"));
    public static final Target CHECKBOX1 = Target.the("Click on the checkbox multiple of 4")
            .located(By.xpath("//input[@value='80']"));
    public static final Target CHECKBOX2 = Target.the("Click on the checkbox multiple of 4")
            .located(By.xpath("//input[@value='176']"));
    public static final Target CHECKBOX3 = Target.the("Click on the checkbox multiple of 4")
            .located(By.xpath("//input[@value='152']"));
    public static final Target CHECKBOX4 = Target.the("Click on the checkbox multiple of 4")
            .located(By.xpath("//input[@value='68']"));
    public static final Target CHECKBOX5 = Target.the("Click on the checkbox multiple of 4")
            .located(By.xpath("//input[@value='128']"));
    public static final Target CHECKBOX6 = Target.the("Click on the checkbox multiple of 4")
            .located(By.xpath("//input[@value='112']"));
    public static final Target INPUT_DATE = Target.the("Where we write the corresponding date within 113 days")
            .located(By.name("date"));
    public static final Target OPERATION = Target.the("Click on the operation result")
            .located(By.xpath("//input[@value='60942']"));
    public static final Target BUTTON_OK =  Target.the("Click on the submit button")
            .located(By.xpath("//button[@type='submit']"));
}
