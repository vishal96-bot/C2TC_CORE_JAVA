package newproject;

class Grandfather{
	void bike() {
	System.out.println("Honda");
}
}

class Father extends Grandfather{
	void car() {
		System.out.println("BMW");
	}
}
	

 class Son extends Father{
	 void cycle() {
		 System.out.println("Hero");
	 }
	 
 }
 public class Multiinheritance{
	 public static void main(String args[]) {
		 Son s = new Son();
		 s.bike();
		 s.car();
		 s.cycle();
	 }
	
 }
