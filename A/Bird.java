package com.A;

import java.util.Scanner;

public class Bird {

	String name;
	String color;
	int age;
	String lifeSpane;

	// assigning value to a variable is through
	// 1: directly
	// 2: with constructor
	// 3: with method

	public Bird(String birdname, String color, int age, String lifeSpane) {
		 name = birdname;
		this.color = color;
		this.age = age;
		this.lifeSpane = lifeSpane;
	}

	public Bird(String name, int age) {

	}

	public String flyHigh() {

		return "Eagle flies 10000 feet high";
	}

	public String hunt() {
		return "hunt small animals";
	}

	public static void main(String[] args) {
		// object of the our class
		// Name class + a name for your oject + = + new + constractor() + semicolumn

		Bird myBird = new Bird("Eagle", "Gray", 15, "40 years");

		System.out.println(myBird.name);
		System.out.println(myBird.color);
		System.out.println(myBird.age);
		System.out.println(myBird.lifeSpane);
		System.out.println(myBird.flyHigh());
		System.out.println(myBird.hunt());

		System.out.println("======================\n");
		Bird mySecondBird = new Bird("Parrot", "green", 5, "10 years");

		System.out.println(mySecondBird.name);
		System.out.println(mySecondBird.color);
		System.out.println(mySecondBird.age);
		System.out.println(mySecondBird.lifeSpane);
		// System.out.println(mySecondBird.flyHigh());
		// System.out.println(mySecondBird.hunt());
		
		
		
		Scanner myscan = new Scanner(System.in);
		
		myscan.nextInt();
		

	}

}
