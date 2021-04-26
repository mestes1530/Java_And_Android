// Defines the Dog class
public class Dog {
	// Defines State/Structure variables
	String Breed;
	String Color;
	String Height;
	String Weight;

	// Defines Behavior methods
	public static void Shake() {
		println("Dog shakes paw...");
	}
	static void Sit() {
		println("Dog sat down...");
	}
	static void LayDown() {
		println("Dog lays down...");
	}
}

// Makes an Instance of the Dog Object
Dog dogInstance = New("Hound", "Brown", "2 Feet", "60 Pounds") 