package testpkg;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import pagepkg.Base;
import pagepkg.Medicinepage;

public class Medicinetest extends Base  {

 @Test
	public void test()throws Throwable
	{
		
		Medicinepage ob=new Medicinepage(driver);
		ob.imageclicking();
		ob.menuclick();
		ob.productclick();
		ob.cart();
		ob.cartview();
	}
}
