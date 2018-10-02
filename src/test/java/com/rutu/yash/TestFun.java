package com.rutu.yash;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestFun {
	Data data;
	PageFun pageFun;
	
	@BeforeTest
	public void beforeTest() throws IOException {
		data = new Data();
		data.openPropertiesFile();
		pageFun = new PageFun();
	}
	
	@BeforeMethod
	public void beforemethod(){
		pageFun.getEnvironmentReady();
	}
	
	@Test
	public void ActionTest() {
		pageFun.openPage(data.webPage);
		Assert.assertEquals(pageFun.testAction(), data.wallArtTitle);
	}
	
	@Test
	public void alertTest() {
		pageFun.openPage(data.alertWebPage);
		Assert.assertEquals(pageFun.alertTest(), data.alertText);
	}
	
	@Test
	public void attributeTest(){
		pageFun.openPage(data.attributelink);
		Assert.assertEquals(pageFun.attributeTest(), data.attributeText);
	}
	
	@Test
	public void backForwardTest() {
		pageFun.openPage(data.backforLink);
		Assert.assertEquals(pageFun.backForTest(), data.backForText);
	}
	
	
	@AfterMethod
	public void afterMethod() {
		pageFun.closePage();
	}
	
	@AfterTest
	public void afterTest() {
		
	}
}
