package src.main.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

	public class TShirt {
		
		@FindBy(xpath="//h1[contains(text(),'Men Tshirts')]") 
		public
		WebElement headerMenTShirts;
		
		@FindBy(xpath="//span[contains(text(),'FILTERS')]") 
		public
		WebElement headerFilters;
		
		@FindBy(xpath="//span[contains(text(),'Brand')]") 
		public
		WebElement headerBrand;
		
		@FindBy(xpath="//span[contains(text(),'Price')]") 
		public
		WebElement headerPrice;
		
		@FindBy(xpath="//span[contains(text(),'Color')]") 
		public
		WebElement headerColor;
		
		@FindBy(xpath="//span[contains(text(),'Discount')]") 
		public
		WebElement headerDiscountRange;
		
		@FindBy(xpath="//button[(text()='L')]") 
		public
		WebElement textSizeSelected;
		
		@FindBy(xpath="//span[contains(text(),'Add to bag')]") 
		public
		WebElement buttonAddToBag;
		
		@FindBy(xpath="//span[contains(text(),'Bag')]") 
		public
		WebElement buttonBag;
		
		
		public void selectBrands(WebDriver driver){
			List<WebElement> list = driver.findElements(By.xpath("//label[contains(text(),'United')]/parent::li/parent::ul/li"));
	        	list.get(2).click();
	        	list.get(3).click();
		}
		
        public void selectPrice(WebDriver driver){
        	List<WebElement> list = driver.findElements(By.xpath("//label[contains(text(),'Rs.')]/parent::li/parent::ul/li"));
        	list.get(1).click();
        	list.get(2).click();
        	
		}
        
        public void selectColor(WebDriver driver){
        	List<WebElement> list = driver.findElements(By.xpath("//label[contains(text(),'Blue')]/parent::li/parent::ul/li"));
        	list.get(2).click();
        	list.get(3).click();
		}
        
        public void selectDiscount(WebDriver driver){
        	List<WebElement> list = driver.findElements(By.xpath("//label[contains(text(),' and above')]/parent::li/parent::ul/li"));
        	list.get(1).click();
			
		}
        
        public void selectTshirt(WebDriver driver){
        	List<WebElement> list = driver.findElements(By.xpath("//picture[@class='img-responsive']/ancestor::ul/li"));
//        	list.get(2).click();
        	int i;
        	for(i=0;i<list.size();i++)
        	{
        	if(i==2)
        	{
        		Actions action = new Actions(driver);
    			action.moveToElement(list.get(2)).build().perform();
        	}
        	}
			
		}
        
        public void selectNewBrand(WebDriver driver){
			List<WebElement> list = driver.findElements(By.xpath("//label[contains(text(),'United')]/parent::li/parent::ul/li"));
	        	list.get(4).click();
		}
        
        public void waitForPageToLoad()
        {
        	TShirt tshirt1 = new TShirt();
        	tshirt1.headerMenTShirts.isDisplayed();
        }
	}

	

