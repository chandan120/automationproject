package src.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import src.pages.TShirt;

public class MyntraHomePage extends TShirt{
		
	
		@FindBy(xpath="//a[contains(text(),'Men')]")
		public 
		WebElement textCategoryMen;
		
		@FindBy(xpath="//a[contains(text(),'Topwear')]/parent::li/following-sibling::li/a[contains(text(),'T-Shirts')]")
		public
		WebElement textTShirts;
	
		public void selectCategrory(WebDriver driver, WebElement textElement){
			Actions action = new Actions(driver);
			action.moveToElement(textElement).build().perform();
		}
}
