package pagepkg;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testpkg.Neogentest;

public class Medicinepage extends Neogenpage {

	public Medicinepage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	WebDriver driver;

	@FindBy(xpath="//*[@id=\"elementor-popup-modal-8247\"]/div/div[2]/div/section[2]/div/div/div/section/div/div/div/div/div/a/img")
	WebElement image;
	
	@FindBy(xpath="//*[@id=\"menu-item-179\"]/a")
	WebElement medicines;
	
	@FindBy(xpath="//*[@id=\"post-759\"]/div/div/section[2]/div/div/div/div/div/div/ul/li[1]/a[1]/img")
	WebElement product;
	
	@FindBy(xpath="//*[@id=\"content\"]/div[3]/section[1]/div/div/div/section/div/div[2]/div/div[6]/div/div/a")
	WebElement addtocart;
	
	@FindBy(xpath="//*[@id=\"masthead\"]/div[1]/div/div[2]/div/div/div/div/div[2]/div[1]/div/a/span/span[1]/i")
	WebElement cartview;
	
	@FindBy(xpath="//*[@id=\"post-8686\"]/div/div/div[1]/div/div/a")
	WebElement home;
	
	public void Medicinepage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	public void imageclicking()
	{
	image.click();
	}
	public void menuclick()
	{
	medicines.click();
	}
	public void product()
	{
		product.click();
	}
	public void cart()
	{
	addtocart.click();
	}
	public void cartview()
	{
	cartview.click();
	}
	public void homeclick()
	{
		home.click();
	}
	
	
}
