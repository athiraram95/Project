package testpkg;



import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepkg.Base;
import pagepkg.Medicinepage;
import pagepkg.Neogenpage;

public class Neogentest extends Base
{

@Test
public void test() throws Throwable
{
	 
	
	Neogenpage ob=new Neogenpage(driver);
	ob.imageclick();
	ob.servicesclick();
	ob.physioclick();
	ob.scroll();
	ob.setValues(null, null);
	ob.phone(null);
	ob.servicedropdown();
	ob.timedropdown();
	ob.appoinmentbutton();

	}
}






