package newproject;

public class StaticKey {
    int roll;
    String name;
    static String college = "Mumbai University";
    StaticKey(int r, String n)
    {
    	roll = r;
    	name = n;
    	
    }
    
     void display() {
	}
    {
    	System.out.println(roll+"" +name+"" +college);
    }
	public static void main(String[] args) {
		
		StaticKey s1=new StaticKey(1,"vishal");
		StaticKey s2=new StaticKey(2,"sagar");
		s1.display();
		s2.display();
		

	}

}
