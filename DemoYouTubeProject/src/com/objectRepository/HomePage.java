package com.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

	@FindBy(id="search")
	private WebElement searchBoxEntry;
	
	@FindBy(id="video-title")
	private WebElement videoTitles;

	public WebElement setSearchBox() {
		return searchBoxEntry;
	}
	
	public WebElement getVideoTitles(){
		return videoTitles;
	}
}
