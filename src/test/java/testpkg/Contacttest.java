package testpkg;

import org.testng.annotations.Test;

import pagepkg.Base;
import pagepkg.Contactpage;

public class Contacttest extends Base
{
@Test(priority=3)

	public void test()throws Throwable
{

	Contactpage ob=new Contactpage(driver);
	ob.imageclk();
	ob.menuclicks();
	ob.setvalues(null, null, null, null, null);
	ob.submitclick();
	ob.scrollpage();
	
}
}
