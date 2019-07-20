	package src.pages;

	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

	public class TShirt {
		WebDriver driver;
		@FindBy(xpath="//h1[contains(text(),'Men Tshirts')]") 
		public
		WebElement headerMenTShirts;
		
		@FindBy(xpath="//span[contains(text(),'FILTERS')]") 
		public
		WebElement headerFilters;
		
		@FindBy(xpath="//span[contains(text(),'Brand')]") 
		public
		WebElement headerBrand;
		
		@FindBy(xpath="//label[contains(text(),'United')]") 
		public
		WebElement textBrandUnitedColorsOfBenetton;
		
		@FindBy(xpath="//label[contains(text(),'Tommy')]") 
		public
		WebElement textTommyHilfiger;
		
		@FindBy(xpath="//span[contains(text(),'Price')]") 
		public
		WebElement headerPrice;
		
		@FindBy(xpath="//label[contains(text(),'Rs. 359 to Rs. 1074')]") 
		public
		WebElement textPriceRangeOne;
		
		@FindBy(xpath="//label[contains(text(),'Rs. 1074 to Rs. 1789')]") 
		public
		WebElement textPriceRangeTwo;
		
		@FindBy(xpath="//span[contains(text(),'Color')]") 
		public
		WebElement headerColor;
		
		@FindBy(xpath="//label[contains(text(),'White')]") 
		public
		WebElement textColorWhite;
		
		@FindBy(xpath="//label[contains(text(),'Blue')]") 
		public
		WebElement textColorBlue;
		
		@FindBy(xpath="//span[contains(text(),'Discount')]") 
		public
		WebElement headerDiscountRange;
		
		@FindBy(xpath="//label[contains(text(),'30% and above')]")
		public
		WebElement textDiscount;
		
		@FindBy(xpath="//h4/a[contains(text(),'Solid Round Neck T-shirt')]") 
		public
		WebElement textSelectedTshirt;
		
		@FindBy(xpath="//p[(text()='L')]/parent::button") 
		public
		WebElement textSizeSelected;
		
		@FindBy(xpath="//div[contains(text(),'ADD TO BAG')]") 
		public
		WebElement buttonAddToBag;
		
		
	}

	

