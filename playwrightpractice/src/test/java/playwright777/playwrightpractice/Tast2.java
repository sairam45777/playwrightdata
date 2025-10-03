package playwright777.playwrightpractice;

import static org.testng.Assert.assertEquals;

import java.nio.file.Paths;

import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.LoadState;

public class Tast2 {

	@Test
	public void verifylpogin() {
		Playwright playwright=Playwright.create();
		Browser browser=playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(100));
	Page page=browser.newPage();
	page.navigate("https://app.vwo.com/#/login");
	page.locator("#login-username").fill("93npu2yy0@esiix.com");
	page.locator("#login-password").fill("Wingify@123");
	page.click("#js-login-btn");
	page.waitForLoadState(LoadState.NETWORKIDLE);
	assertEquals("Dashboard",page.title());
	page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("Dashboard.png")));
	page.close();
	
	
	
	
	
	}
}
