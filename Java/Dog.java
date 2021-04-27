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
	public static void Sit() {
		println("Dog sat down...");
	}
	public static void LayDown() {
		println("Dog lays down...");
	}

	// Constructor that allows the user to create object instances
	public Dog(String breedInput, String colorInput, String heightInput, String weightInput) {
		Breed = breedInput;
		Color = colorInput;
		Height = heightInput;
		Weight = weightInput;
	}

	// Main function that creates a specific Dog instance
	public static void main(String[] args) {
		Dog dogInstance = New Dog("Hound", "Brown", "2 Feet", "60 Pounds");
	}

}
