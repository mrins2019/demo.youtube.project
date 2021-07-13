package com.genericLib;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;

public class WebDriverCommonLib {
	
	public void waitForPageToLoad(){
		
		Driver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public boolean getAndVerfyTestPresnt(String wbXpath , String expectedText){
		boolean flag = false;
		String actText = Driver.driver.findElement(By.xpath(wbXpath)).getText();
		
		if(expectedText.equals(actText)){
			System.out.println(expectedText + "is present");
			flag = true;
		}else{
			System.out.println(expectedText + "is not present");
		}
		return flag;
	}
}
