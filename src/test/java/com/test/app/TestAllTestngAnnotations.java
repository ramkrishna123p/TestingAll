package com.test.app;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestAllTestngAnnotations {

	@BeforeTest
	public void ptest(){
		System.out.println("This is for testng p test");
	}
	
	@Test(priority=8,groups={"smokes"})
	public void rtest(){
		System.out.println("This is for testng r test");
	}
	
	@Test(priority=1)
	public void itest(){
		System.out.println("This is for testng i test");
	}
	@Test(priority=0,invocationCount=4)
	public void atest(){
		System.out.println("This is for testng a test");
	}
	
	@Test(priority=1)
	public void ktest(){
		System.out.println("This is for testng k test");
	}
	@Test
	public void btest(){
		System.out.println("This is for testng b test");
	}

	@Test
	public void ftest(){
		System.out.println("This is for testng f test");
	}
	
	@AfterTest
	public void stest(){
		System.out.println("This is for testng s test");
	}
	
	
}
