package com.lbrce.devops;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UserValidationTest {
	UserValidation uv=new UserValidation();
	@Test
	public void Test1() {
		Assert.assertEquals(false,uv.check("", ""));
	}
	@Test
	public void Test2() {
		Assert.assertEquals(false,uv.check("GNS", "123"));
	}
	@Test
	public void Test3() {
		Assert.assertEquals(false,uv.check("gn", "gns@1"));
	}
	@Test
	public void Test4() {
		Assert.assertEquals(false,uv.check("gns@1", "GNS"));
	}
	@Test
	public void Test5() {
		Assert.assertEquals(true,uv.check("GNS", "gns@123"));
	}
}
