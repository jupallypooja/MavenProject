package mpack;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDemo {
	
	@BeforeMethod
	public void openApplication(){
		
		System.out.println("openApplication");
	}
	@Test(priority=2)
	public void testLogin(){
		System.out.println("Testing Login functionaltiy");
		
	}	
	@Test(priority=3)
	public void testHomePage(){
		System.out.println("Testing Home Page functionality");
		}
	@Test(priority=1)
	public void testRegistration(){
		
		System.out.println("Testing Registration functionality");

}
}