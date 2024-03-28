package testpkg;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pagepkg.Base;
import pagepkg.Contactpage;

public class Contacttest extends Base
{
@Test

	public void test()throws Throwable
{

	Contactpage ob=new Contactpage(driver);
	ob.imageclk();
	ob.menuclicks();
	ob.scrollpage();
	ob.setvalues(null, null, null, null, null);
	ob.submitclick();
}
}
