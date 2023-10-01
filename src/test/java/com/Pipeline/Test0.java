package com.Pipeline;



import org.testng.annotations.Test;

import com.GenericUtility.BaseClass;

public class Test0 extends BaseClass{
	
	@Test(groups = "regression")
	public void demo() {
	System.out.println("hello selenium");
	}
	@Test(groups ="smoke")
	public void regional()
	{
		System.out.println("Regional regression test executed");
		System.out.println("Completed");
	}

}
