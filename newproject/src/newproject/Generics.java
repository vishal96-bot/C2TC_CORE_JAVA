package newproject;
import java.util.*;
public class Generics {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();  
		list.add("Vishal");  
		list.add("Sagar");  
		//list.add(32);//if u comment out this compile time error  occured
		  
		String s=list.get(0); 
		System.out.println("element is: "+s);   

	}

}
