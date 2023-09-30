


import org.testng.annotations.Test;

import com.GenericUtility.BaseClass;

public class Test1 extends BaseClass{
	@Test(groups = "smoke")
	public void sample() {
	System.out.println("Get some samples");
	}
	@Test(groups = "regression")
	public void impactArea()
	{
		System.out.println("Impact area is found");
	}

}
