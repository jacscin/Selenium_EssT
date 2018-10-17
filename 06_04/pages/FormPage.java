import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class FormPage {

	public static void submitForm(WebDriver driver) {
		driver.findElement(By.id("first-name")).sendKeys("Jo�o");

		driver.findElement(By.id("last-name")).sendKeys("Ant�nio");

		driver.findElement(By.id("job-title")).sendKeys("Estagi�rio em Teste de Software");

		driver.findElement(By.id("radio-button-2")).click();

		driver.findElement(By.id("checkbox-1")).click();

		driver.findElement(By.cssSelector("option[value='1']")).click();

		driver.findElement(By.id("datepicker")).sendKeys("17/10/2018");
		driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);

		driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();
	}
}