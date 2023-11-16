package com.A;

public class Employee {
	//public, private, protected, default
	 
	
   
   // String = anything inside duable quotitoin is called String data
   // intigral any number is called integral
   // true or false is called booleans data
    // char = anything in side single is called char data
   // object data is complex mixed of all datas
	
	protected  int age = 20 ;

	protected boolean isPresent = true;
	protected char myBirthSymbole = 'Q';
	//127 - 128
	protected byte codeNumber =  20;
	//short: = 32767 and -32768 
	protected short number =  32767;
	//int:  = 2147483647 and -2147483648
	protected int num = 2147483647;
	//long: -9223372036854775807 and - -9223372036854775808 
	protected long papulation = -9223372036854775807L;
	//double
	protected double salary = -10.00;
	protected float tikect =  0.562f;
	
	protected String  name = "22";
	
	
	
	
	
	
	
 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		
		Employee obj = new Employee();
		
		System.out.println("inside the class " + obj.salary);
	}

}
