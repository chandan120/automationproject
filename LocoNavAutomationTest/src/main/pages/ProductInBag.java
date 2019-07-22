package src.main.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

	public class ProductInBag {
		
		@FindBy(xpath="//div[contains(text(),'My Shopping ')]") 
		public
		WebElement headerMyShoppingBag;
		
		@FindBy(xpath="//div[contains(text(),'My Shopping ')]/following::div[4]/div/div[2]/div[1]/div[3]/div[2]") 
		public
		WebElement textQuantity;
		
		@FindBy(xpath="//div[contains(text(),'CHANGE QUANTITY')]/parent::div") 
		public
		WebElement popUpSelectQuantity;
		
		@FindBy(xpath="//div[contains(text(),'CHANGE QUANTITY')]/parent::div/div/div[@id=3]") 
		public
		WebElement textSelectQuantity;
		
		@FindBy(xpath="//div[contains(text(),'Place Order')]") 
		public
		WebElement buttonPlacedOrder;
	}

	

