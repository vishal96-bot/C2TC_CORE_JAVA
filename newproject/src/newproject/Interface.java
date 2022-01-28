package newproject;

interface A {
	  public void animalsound(); 
	  public void sleep(); 
	}

	
	class Cat implements A{
	  public void animalsound() {
	    System.out.println("Mmmmm....");
	  }
	  public void sleep() {
	    System.out.println("Zzzzz....");
	  }
	}
public class Interface {

	public static void main(String[] args) {
		  Cat myCat = new Cat();  
		    myCat.animalsound();
		    myCat.sleep();
	}

}
