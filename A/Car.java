package com.A;

class Car {

	public int year = 2023;
	public String name = "BMW";
	public double price = 234.34;
	private String color = "Black";

	private String gassUsage() {

		return "15 galone per 200 miles ";
	}

	private String speed( ) {

		return  carSpeed();
	}

	
	public String carSpeed() {
		
		return "500 speed";
	}
	public static void main(String[] args) {
		// create the oject of Bmw class
		// Name class + a name for your oject + = + new + constractor() + semicolumn
		// Bmw myNewCar = new Bmw() ;
		// this is object
		
		Car oldCar = new Car();

		System.out.println(oldCar.year );
		System.out.println(oldCar.name);
		System.out.println(oldCar.price);
		System.out.println(oldCar.color);
		System.out.println(oldCar.gassUsage());
		System.out.println(oldCar.speed());
		

	}

}
