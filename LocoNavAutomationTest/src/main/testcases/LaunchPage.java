package src.main.testcases;

import src.pages.TShirt;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import src.main.pages.BaseClass;
import src.testcases.MyntraHomePage;

public class LaunchPage extends BaseClass{
	
	
	@Test
	public void launchPage() throws InterruptedException {
		
		MyntraHomePage myntraHomePage = PageFactory.initElements(driver, MyntraHomePage.class);
		myntraHomePage.selectCategrory(driver,myntraHomePage.textCategoryMen);
		myntraHomePage.textTShirts.click();
		
		TShirt tshirt = PageFactory.initElements(driver, TShirt.class);
		tshirt.headerMenTShirts.isDisplayed();
		tshirt.headerBrand.isDisplayed();
		tshirt.selectBrands(driver);
//		tshirt.waitForPageToLoad();
		tshirt.selectPrice(driver);
//		tshirt.waitForPageToLoad();
		tshirt.selectColor(driver);
//		tshirt.waitForPageToLoad();
		tshirt.selectDiscount(driver);
		tshirt.selectTshirt(driver);
//		tshirt.textSizeSelected.click();
			
		
	}
}

