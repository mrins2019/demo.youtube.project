package com.projectYoutube;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.businessLib.ProjectYouTubeLib;
import com.genericLib.Driver;
import com.genericLib.PropertiesLib;
import com.genericLib.WebDriverCommonLib;

public class ProjectYoutubeTest {
	
	PropertiesLib propLib;
	WebDriverCommonLib wLib;
	ProjectYouTubeLib bLib;
	
	@BeforeClass
	public void configBeforeClass(){
		
		propLib = new PropertiesLib();
		wLib = new WebDriverCommonLib();
		bLib = new ProjectYouTubeLib();
	}
	
	@Test
	public void searchTextInYouTube() throws Exception{
		
		bLib.launchYouTube();
		String searchedText = propLib.getPropertiesData("song");
		bLib.searchTextInYouTube(searchedText);
		bLib.getSearchedVideoTitlesInYouTube();
	}
	
	@AfterClass
	public void exitDriver() throws Exception{
		
		Thread.sleep(10000);
		Driver.driver.quit();
	}
}

