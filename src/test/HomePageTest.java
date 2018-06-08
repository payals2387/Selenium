package test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import common.BaseClass;
import page.GoogleHomePage;

public class HomePageTest extends BaseClass{

	
	GoogleHomePage homePage;
	public HomePageTest(){
		super();
	}
	
	
	@Test
	public void verifyPageTitle(){
		openBrowser();
		 homePage = new GoogleHomePage();
		assertEquals("Google", homePage.getTitle());
	}
	
}
