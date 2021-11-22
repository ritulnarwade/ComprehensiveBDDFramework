package Utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Takess {
	
	public static String ss(WebDriver driver) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy-hh-mm-ss");
		Date d = new Date();
		String date = sdf.format(d);
		String ss = System.getProperty("user.dir")+"/Screenshots/"+"err"+date+"err.png";
		File destFile = new File(ss);
		FileUtils.copyFile(src, destFile);
		return ss;
		
	}

}
