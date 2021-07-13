package com.businessLib;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.genericLib.Driver;
import com.genericLib.GenericMethods;
import com.genericLib.PropertiesLib;
import com.genericLib.WebDriverCommonLib;
import com.objectRepository.HomePage;

public class ProjectYouTubeLib extends WebDriverCommonLib{
	
	HomePage homePage = null;
	PropertiesLib propLib = new PropertiesLib();
	GenericMethods gLib = new GenericMethods();
	
	public void launchYouTube() throws Exception{
		
		String chromeDriverPath = propLib.getPropertiesData("chromeDriverPath");
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		String searchedText = propLib.getPropertiesData("url");
		Driver.driver.get(searchedText);
		Driver.driver.manage().window().fullscreen();
	}
	
	public void searchTextInYouTube(String searchedText) throws Exception{
		
		homePage = PageFactory.initElements(Driver.driver, HomePage.class);
		homePage.setSearchBox().sendKeys(searchedText);	
		gLib.PressingEnter();
		Thread.sleep(5000);
		gLib.ReleasingEnter();
	}
	
	public void getSearchedVideoTitlesInYouTube() throws Exception{

		int numberOfVideos = Driver.driver.findElements(By.id("video-title")).size();
		System.out.println("The number of videos selected with searched text is : " + numberOfVideos);
		Assert.assertTrue(numberOfVideos > 0, "The number of videos selected with searched text is : " + numberOfVideos);
	}
}
