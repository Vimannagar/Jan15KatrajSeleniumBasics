package testngdiscussion;

public class TestTest {
	
	public static void m1(String s)
	{
		System.out.println("String arg");
	}
	
	
	public static void m1(StringBuffer s)
	{
		System.out.println("String Buffer arg");
	}
	
	public static void main(String[] args) {
		m1("abc");
	}
	

}
