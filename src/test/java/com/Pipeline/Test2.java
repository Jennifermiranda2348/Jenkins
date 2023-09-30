package com.Pipeline;




import org.testng.annotations.Test;

import com.GenericUtility.BaseClass;

public class Test2 extends BaseClass{
	@Test(groups = {"smoke","regression"})
	public void trial() {
	System.out.println("Get trail free");
	}
	
	public void pollSCM()
	{
		System.out.println("poll scm execution is successful");
		System.out.println("New build");
	}

}
