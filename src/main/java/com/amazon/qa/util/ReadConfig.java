package com.amazon.qa.util;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig
{
	Properties pro;
	
	public ReadConfig()
	{
		File src = new File("./configuration/config.properties");
		
		try
		{
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		}
		catch (Exception e )
		{
			System.out.println("Exception is  "+ e.getMessage());
		}
	}
}
