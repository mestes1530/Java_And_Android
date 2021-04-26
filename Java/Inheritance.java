// Parent superclass for Shape object
class Shape {
	// Defines parent properties
	public String Color;
	// Defines parent methods 
	public void getArea() {
		print("The area is...");
	}
}

// Child subclass for Rectangle object
class Rectangle extends Shape {
	// Defines child specific properties
	int Height;
	int Width;
	// Inherits Color property and getArea function
}

// Child subclass for Triangle object
class Triangle extends Shape {
	// Defines child specific properties
	int Base;
	int Height;
	// Inherits Color property and getArea function
}

// Child subclass for Circle object
class Circle extends Shape {
	// Defines child specific properties
	int Radius;
	// Inherits Color property and getArea function
}