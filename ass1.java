// First Assignment
// Date: 03/02/2025
// Basic Concept Of Java Programming
// Author: Smitraj Bankar
// Course: Java Core Programming


class ass1{
	public static void main(String[] args){
		// circle area
		float radius = 2;
		float area = Math.PI * radius *radius;
		System.out.println("Area Of Circle is: "+area);
		
		// Printing Method
		System.out.println("This is Following Items: ")	// For New Line
		System.out.print("Mango\nApple\nPineApple");	// This Also For New Line
		System.out.print("This is Single line");	// Here No New Line
		
		System.out.println(" ");
		// Variable Name Should Be "fruitList"
		// Class Name Should Be "Vehicle"
		
		// Area of Rectangle
		float length =4, breadth = 2;
		float areaRectangle = length*breadth;
		System.out.println("Area of Reactangle is: "+areaRectangle);
		
		// Area Of Square
		float side = 4;
		float areaSquare = side*side;
		System.out.println("Area Of Side: "+areaSquare);
		
		// Square Root of Number
		float number =25;
		float sqRoot;
		sqRoot = Math.sqrt(number);
		System.out.println("Square Root Of "+number+" is: "+sqRoot);
		
		// Integer Data Types	
		byte miles;
		short minutes;
		int temperatureLondon;
		long days;

		miles = 120;
		minutes = 100;
		temperatureLondon = -15;
		days = 182500;
		
		System.out.println("We have made a journey of " + miles +  " miles in only " + minutes + " minutes.");
		System.out.println("The temperature in London is " + temperatureLondon + " degrees.");
		System.out.println("There are " + days +" days in 500 years.");

		// Square Power
		float cube = Math.pow(4.0,3.0)
		System.out.println("The Cube of 4 is: "+cube);
		
	}
}
