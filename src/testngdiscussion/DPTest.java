package testngdiscussion;

import org.testng.annotations.Test;

public class DPTest {
	
	@Test(dataProvider = "testdata", dataProviderClass = testngdiscussion.DPClass.class)
	public void testCase(String un, String pwd)
	{
		System.out.println(un+" "+pwd);
	}

}
