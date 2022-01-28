package newproject;

class Parent{
	void car() {
		System.out.println("MARUTI");
	}
	
}
class C1 extends Parent{
	void bike() {
		System.out.println("KTM");
	}
	
}
class C2 extends Parent{
	void cycle() {
		System.out.println("HERO");
	}
	
}
class C3 extends Parent{
	void house() {
		System.out.println("HOUSE NO:456");
	}
	
}

public class Hierarchicalinheritance {
	public static void main(String args[]) {
		C1 c = new C1();
		c.car();
		c.bike();
		C2 obj = new C2();
		obj.car();
		obj.cycle();
		C3 cl = new C3();
		cl.car();
		cl.house();
		
		
	}

}
