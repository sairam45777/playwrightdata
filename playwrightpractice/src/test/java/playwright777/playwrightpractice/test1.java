package playwright777.playwrightpractice;

import org.testng.asserts.SoftAssert;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class test1 {
public static void main(String[] args) {
	Playwright play=Playwright.create();
	Browser browser=play.chromium().launch(new LaunchOptions().setHeadless(false));
	Page page=browser.newPage();
	page.navigate("https://ecommerce-playground.lambdatest.io/index.php");
	Locator accountpage=page.locator("//a[contains(.,'My account')][@role='button']");
	accountpage.hover();//hover meqanse move to element
	page.locator("//a[contains(.,'Login')]").click();
	SoftAssert as=new SoftAssert();
	//as.assertTrue(page).hasTitle("Account Login");
	page.getByPlaceholder("E-Mail Address").type("Koushik350@gmail.com");//type=sendkeys
	page.getByPlaceholder("Password").type("Pass123$");
	page.locator("//input[@value='Login']").click();
	page.close();
	browser.close();
	play.close();//all are  closed
	
}
}
