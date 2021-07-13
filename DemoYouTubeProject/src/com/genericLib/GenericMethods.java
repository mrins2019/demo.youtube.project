package com.genericLib;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class GenericMethods {

	public void PressingEnter() throws AWTException{

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
	}

	public void ReleasingEnter() throws AWTException{

		Robot robot = new Robot();
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
}
