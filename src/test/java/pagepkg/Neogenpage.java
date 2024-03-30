package pagepkg;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class Neogenpage {
WebDriver driver;


@FindBy(xpath="//*[@id=\"elementor-popup-modal-8247\"]/div/div[2]/div/section[2]/div/div/div/section/div/div/div/div/div/a/img")
WebElement image;

@FindBy(xpath="//*[@id=\"menu-item-244\"]/a")
WebElement services;

@FindBy(xpath="//*[@id=\"post-39\"]/div/div/div/div/div/div/div/div/div/div/div[2]/div/article[3]/div/div[2]/div/h3/a")
WebElement physiotherapy;

@FindBy(xpath="//*[@id=\"form-field-name\"]")
WebElement name;

@FindBy(xpath="//*[@id=\"form-field-email\"]")
WebElement email;

@FindBy(xpath="//*[@id=\"form-field-phone\"]")
WebElement phonenumber;

@FindBy(xpath="//*[@id=\"post-72\"]/div/div[2]/div/section[2]/div/div/div/div[2]/div/div[2]/div/div[2]/div/form/div/div[8]/button/span/span[2]")
WebElement appointmentbutton;

@FindBy(xpath="//*[@id=\"form-field-services\"]")
WebElement Service;

@FindBy(xpath="//*[@id=\"form-field-time\"]")
WebElement Time;

@FindBy(xpath="//*[@id=\"form-field-date\"]")
WebElement date;

@FindBy(xpath="/html/body/div[4]/div[1]/div/span")
WebElement month;

@FindBy(xpath="/html/body/div[4]/div[1]/span[2]/svg")
WebElement arrow;

public Neogenpage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver,this);
	
}
public void imageclick()
{
image.click();	
}
public void servicesclick()
{
services.click();
}
public void physioclick()
{
physiotherapy.click();	
}

public void scroll()
{
JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("window.scrollBy(0,3300)");
		
}
	  

public void setValues(String uname,String mail)
{
	   name.sendKeys("Athira");
	   
	   email.sendKeys("asdf@gmail.com");
	   
}
public void phone(String phone)
{
	phonenumber.sendKeys("7852365478");
}
public void servicedropdown()
{
	Select servicedetails = new Select(Service);
	servicedetails.selectByIndex(3);
	
}
public void timedropdown()
{
	Select timedetails = new Select(Time);
	timedetails.selectByIndex(1);
}

public void appoinmentbutton()
{
	appointmentbutton.click();

while (true)
{
String monthtext=month.getText()	;
System.out.println(monthtext);
if(monthtext.equals("March 2024"))
{
	
break;
}
else {
	
	arrow.click();
	
}
date.click();
}
}

}









