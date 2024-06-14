package edu.atria.b94java.firstpackage;

public class ExecutorOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base bOne= new Base();
		
		//private members are not visible outside the class
		//System.out.println(bOne.varPrivate);
		
		System.out.println(bOne.variableDefault);
		System.out.println(bOne.variableProtected);
		System.out.println(bOne.variablePublic);
		

	}

}
