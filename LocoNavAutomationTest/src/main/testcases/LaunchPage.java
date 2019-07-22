package src.main.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import src.main.pages.BaseClass;
import src.main.pages.ProductInBag;
import src.main.pages.TShirt;
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
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		tshirt.selectPrice(driver);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		tshirt.selectColor(driver);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		tshirt.selectDiscount(driver);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		tshirt.selectTshirt(driver);
		tshirt.buttonAddToBag.click();
		tshirt.textSizeSelected.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		tshirt.selectNewBrand(driver);
		tshirt.selectTshirt(driver);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		tshirt.buttonBag.click();

		ProductInBag productInBag = PageFactory.initElements(driver, ProductInBag.class);
		productInBag.headerMyShoppingBag.isDisplayed();
		productInBag.textQuantity.click();
		productInBag.popUpSelectQuantity.click();
		productInBag.textSelectQuantity.click();
		productInBag.buttonPlacedOrder.click();
		
	}
}

