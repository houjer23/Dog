/**
* This class is a sub class of Dog
*
* @author Jerry Hou
* @since 1.0
*/

public class ShihTzu extends Dog {
	
	// constructor
	public ShihTzu(String name, int birth) {
		super(name, birth);
	}
	
	// method of get rats specific to ShihTzu
	public void fetchRats() {
		System.out.println(super.getName() + " catched a rat");
	}
	
	// print ShihTzu
	public String toString() {
		return super.toString();
	}
	
	// bark replaces the method in the Dog class
	public void bark(String sound) {
		System.out.println(sound);
	}
} // end of ShihTzu class
