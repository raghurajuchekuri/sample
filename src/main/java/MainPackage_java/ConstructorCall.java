package MainPackage_java;

import SubPackage.Constructos;

public class ConstructorCall {

	public static void main(String[] args) {


		Constructos c = new Constructos();
		
		// Values Assigned from constructor
		System.out.println(c.x); //10
		System.out.println(c.y); //12.5		
		System.out.println(c.s); //raghu
		
		
		Constructos c2 = new Constructos((float) 59.8,"raj");
		
		System.out.println(c2.y); //59.8		
		System.out.println(c2.s); //raj

	}

}
