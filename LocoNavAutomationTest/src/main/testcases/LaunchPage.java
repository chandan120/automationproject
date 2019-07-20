package src.main.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import src.main.pages.BaseClass;
import src.pages.TShirt;
import src.testcases.MyntraHomePage;

public class LaunchPage extends BaseClass{
	
	
	@Test
	public void launchPage() {
		
		MyntraHomePage myntraHomePage = PageFactory.initElements(driver, MyntraHomePage.class);
		myntraHomePage.selectCategrory(driver,myntraHomePage.textCategoryMen);
		myntraHomePage.textTShirts.click();
		
		TShirt tshirt = PageFactory.initElements(driver, TShirt.class);
		tshirt.headerMenTShirts.isDisplayed();
		tshirt.headerBrand.isDisplayed();
		tshirt.textColorBlue.click();
			
		
	}
}

