package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigDataProvider {
	
	Properties pro;
	public ConfigDataProvider() throws IOException
	{
		File src = new File("./Config/Config.properties");
		FileInputStream fis = new FileInputStream(src);
		pro = new Properties();
		pro.load(fis);
		
	
	}

	public String getbrowser()
	{
		return pro.getProperty("browser");
	}
	public String geturl()
	{
		return pro.getProperty("url");
	}

}
