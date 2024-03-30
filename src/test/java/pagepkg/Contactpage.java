package pagepkg;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Contactpage extends Neogenpage {

	public Contactpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


		public WebDriver driver;

@FindBy(xpath="//*[@id=\"elementor-popup-modal-8247\"]/div/div[2]/div/section[2]/div/div/div/section/div/div/div/div/div/a/img")
WebElement image;


@FindBy(xpath="//*[@id=\"menu-item-283\"]/a")
WebElement contact;

@FindBy(xpath="//*[@id=\"form-field-firstname\"]")
WebElement name;

@FindBy(xpath="//*[@id=\"form-field-lastname\"]")
WebElement lname;

@FindBy(xpath="//*[@id=\"form-field-cemail\"]")
WebElement email;

@FindBy(xpath="//*[@id=\"form-field-cphone\"]")
WebElement phnumber;

@FindBy(xpath="//*[@id=\"form-field-message\"]")
WebElement message;

@FindBy(xpath="//*[@id=\"post-44\"]/div/div/section[3]/div/div[1]/div/div[3]/div/form/div/div[6]/button/span/span[2]")
WebElement submit;

public void Contactpage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public void imageclk()
{
	image.click();
	
}
public void menuclicks()
{
contact.click();	
}
public void setvalues(String Fame,String Lname,String mail,String phone,String msg)
{
	name.sendKeys("Athira");
	lname.sendKeys("R");
	email.sendKeys("asdf@gmail.com");
	phnumber.sendKeys("8525639635");
    message.sendKeys("Thankyou");
    
}
public void submitclick()
{
submit.click();	
}
public void scrollpage()
{
	name.click();
	lname.click();
	email.click();
	phnumber.click();
	message.click();
JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("window.scrollBy(0,10000)");
		}




}
