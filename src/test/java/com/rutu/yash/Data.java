package com.rutu.yash;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Data {
	FileInputStream file;
	Properties prop;
	String webPage;
	String wallArtTitle;
	String alertWebPage;
	String alertText;
	String attributelink;
	String attributeText;
	String backforLink;
	String backForText;
<<<<<<< HEAD
	String cssSelectorLink;
=======
	String dragnDroplink;
	String dragndropText;
>>>>>>> DragAndDrop
	
	public void openPropertiesFile() throws IOException {
		file = new FileInputStream("Data/prop.properties");
		prop = new Properties();
		prop.load(file);
		webPage = prop.getProperty("webPage");
		wallArtTitle = prop.getProperty("wallArtTitle");
		alertWebPage = prop.getProperty("alertWebPage");
		alertText = prop.getProperty("alertText");
		attributelink = prop.getProperty("attributelink");
		attributeText = prop.getProperty("attributeText");
		backforLink = prop.getProperty("backforLink");
		backForText = prop.getProperty("backForText");
<<<<<<< HEAD
		cssSelectorLink = prop.getProperty("cssSelectorLink");
=======
		dragnDroplink = prop.getProperty("dragnDroplink");
		dragndropText = prop.getProperty("dragndropText");
		
		
>>>>>>> DragAndDrop
	}

}
