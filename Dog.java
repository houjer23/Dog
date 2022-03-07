/**
* This class provides general properties of Dog
*
* @author Jerry Hou
* @since 1.0
*/

public class Dog {
	
	private String name;
	private int birth;
	
	// constructor
	public Dog(String name, int birth) {
		this.name = name;
		this.birth = birth;
	}
	
	// eat method
	public void eat() {
		System.out.println(name + " is eating");
	}
	
	// sleep method
	public void sleep() {
		System.out.println(name + " is sleeping");
	}
	
	// bark method
	public void bark() {
		System.out.println("woof");
	}
	
	// get name method -- used for getting variables
	public String getName() {
		return name;
	}
	
	// toString metod -- used for printing
	public String toString() {
		return "Name: " + name + ",     " + "Birth: " + birth;
	}
} // end of the Dog class
