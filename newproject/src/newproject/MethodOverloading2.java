package newproject;

public class MethodOverloading2 {
	public void m()
	{
		System.out.println("No Parameters");
	}
	public void m(int i)
	{
		System.out.println("I am Integer Method");
	}
	public void m(double d)
	{
		System.out.println("I am Double Method");
	}
	public static void main(String[] args) {
		MethodOverloading2 obj =new MethodOverloading2();
		obj.m();
		obj.m(7);
		obj.m(8.7);
		
	}

}
