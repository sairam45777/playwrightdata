package playwright777.playwrightpractice;

import static org.testng.Assert.assertEquals;

import java.nio.file.Paths;

import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.LoadState;

public class Test7 {
	
@Test
public void verify() {
	Playwright playwright=Playwright.create();
	Browser browser=playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(30));
Page page=browser.newPage();
page.navigate("http://playwright.dev");
System.out.println("done");
page.waitForLoadState(LoadState.NETWORKIDLE);
//assertEquals("Fast and reliable end-to-end testing for modern web apps |playwright",page.title());

page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("Dashboard.png")));
}
}
