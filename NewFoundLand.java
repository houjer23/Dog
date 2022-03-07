/**
* This class is a sub class of Dog
*
* @author Jerry Hou
* @since 1.0
*/

public class NewFoundLand extends Dog {
	
	// constructor
	public NewFoundLand(String name, int birth) {
		super(name, birth);
	}
	
	// swim method specific to New Found Land
	public void swim() {
		System.out.println(super.getName() + " is swimming");
	}
	
	// toString method used for printing
	public String toString() {
		return super.toString();
	}
	
	// bark method replace the method in the super class
	public void bark(String sound) {
		System.out.println(sound);
	}
} // end of the Dog class
