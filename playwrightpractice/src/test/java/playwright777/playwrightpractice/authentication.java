package playwright777.playwrightpractice;

import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class authentication {
public static void main(String[] args) {
	
	Playwright play=Playwright.create();
	Browser browser=play.chromium().launch(new LaunchOptions().setHeadless(false));
			browser.newContext(new Browser.NewContextOptions().setHttpCredentials("",""));
			
	Page page=browser.newPage();
	page.navigate("https://ecommerce-playground.lambdatest.io/index.php");
	page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("")));
	Locator button = page.locator("");
	 button.first().click();
	button.nth(2).click();
	page.onceDialog(alert ->{
		String al=alert.message();
		System.out.println(al);
		alert.accept();
		alert.dismiss();
	});
	
}
}
