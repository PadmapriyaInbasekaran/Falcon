package com.falcon.training.test.testscript;
import org.testng.annotations.Parameters; 
import org.testng.annotations.Test;
import com.atmecs.falcon.automation.ui.selenium.Click;
import com.atmecs.falcon.automation.ui.seleniuminterfaces.WindowHandler.FrameHandler;
import com.atmecs.falcon.automation.util.enums.LocatorType;
import com.atmecs.falcon.automation.util.reporter.ReportLogService;
import com.atmecs.falcon.automation.util.reporter.ReportLogServiceImpl;
import com.falcon.training.test.testsuite.SampleTestSuiteBase;
public class ChatBox extends SampleTestSuiteBase{
	private ReportLogService report = new ReportLogServiceImpl(ChatBox.class);
	@SuppressWarnings("deprecation")
	@Test
	@Parameters({"os", "osVersion", "browser", "browserVersion"})
	public void sampleTest(String os, String osVersion, String br, String browserVersion) throws InterruptedException {
		report.info("Opening browser: "+ br);
		browser.openURL("https://www.phptravels.net/home", os, osVersion, br, browserVersion);
		report.info("Maximizing browser window");
		browser.maximizeWindow();
	    FrameHandler frame = 	browser.getWindowHandler().handleFrame();
	    frame.switchToFrame("chat-widget");
	    browser.getWait().HardPause(10000);
	    Click click = browser.getClick();
	    click.performClick(LocatorType.ID, "chat-widget");
	    report.info("entering Name.. ");
		browser.getTextField().enterTextField(LocatorType.ID, "name", "Padmapriya");
		report.info("entering Whatsapp Number.. ");
		browser.getTextField().enterTextField(LocatorType.ID, "5o4lkcpwqnp_157907312787606648", "1234567890");
		report.info("entering Email.. ");
		browser.getTextField().enterTextField(LocatorType.ID, "email", "padmapriya.inbasekaran@atmecs.com");
		report.info("Starting chat..");
		click.clickButtonByName(LocatorType.CLASSNAME, "lc-1xslh7x esv0owm0");
	}
}
