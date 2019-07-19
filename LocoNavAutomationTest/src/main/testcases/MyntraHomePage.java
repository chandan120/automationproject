package src.testcases;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyntraHomePage {
			
		public MyntraHomePage() {}
		
		@FindBy(xpath="//a[contains(text(),'Men')]") 
		WebElement textCategoryMen;
		
		@FindBy(xpath="//a[contains(text(),'Topwear')]/parent::li/following-sibling::li/a[contains(text(),'T-Shirts')]") 
		WebElement textTShirts;
		
		public void selectProduct() {
			
			textTShirts.click();
		}

	}


}
