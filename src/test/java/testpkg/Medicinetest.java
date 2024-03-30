package testpkg;

import org.testng.annotations.Test;

import pagepkg.Base;
import pagepkg.Medicinepage;

public class Medicinetest extends Base  {

 @Test(priority=2)
	public void test()throws Throwable
	{
		
		Medicinepage ob=new Medicinepage(driver);
		ob.imageclicking();
		ob.menuclick();
		ob.product();
		ob.cart();
		ob.cartview();
		ob.homeclick();
		
		
	}
}
