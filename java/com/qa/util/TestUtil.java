package com.qa.util;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.google.common.io.Files;
import com.qa.base.TestBase;

public class TestUtil extends TestBase{


public static long PAGE_LOAD_TIMEOUT=20;
public static long IMPLICIT_WAIT_TIMEOUT=30;
public static void takeScreenshotAtEndOfTest() throws IOException {
	File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	String currentDir = System.getProperty("user.dir");
	
	Files.copy(scrFile, new File(currentDir + "\\screenshots\\" + System.currentTimeMillis() + ".png"));
	
	}



}



