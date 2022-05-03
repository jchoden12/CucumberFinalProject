package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BackgroundPage {
	WebDriver driver;

	public BackgroundPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.CSS, using = "button[onclick='myFunctionSky()']")
	WebElement skyblueBackground;
	@FindBy(how = How.CSS, using = "body")
	WebElement BackgroundColor;
	@FindBy(how = How.CSS, using = "button[onclick='myFunctionWhite()']")
	WebElement whiteBackground;

	// methods

	public void verifySetSkyblueBackgroundButton() {

		Assert.assertEquals("element not found", "Set SkyBlue Background", skyblueBackground.getText());

	}

	public void clickOnSetSkyblueBackgroundButton() {

		skyblueBackground.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void verifyBackgroundColor() {
		
		  String s = BackgroundColor.getCssValue("color");
		   // convert rgba to hex
		 String c = Color.fromString(s).asHex();
		 System.out.println(s);
		 System.out.println("Hex code for color:" + c);

//		String backgroundColor = BackgroundColor.getAttribute("style");
//		System.out.println(backgroundColor);
//		Assert.assertEquals("element not found", "background-color: skyblue;", backgroundColor);

	}

	public void verifySetWhiteBackgroundButton() {

		Assert.assertEquals("element not found", "Set White Background", whiteBackground.getText());

	}

	public void clickOnSetWhiteBackgroundButton() {
		whiteBackground.click();

	}

	public void verifyWhiteBackgroundColor() {
		String backgroundColor = BackgroundColor.getAttribute("style");
		System.out.println(backgroundColor);
		Assert.assertEquals("element not found", "background-color: white;", backgroundColor);
	}

}
