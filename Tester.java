/**
* This class creates different types of doges and arrage it in the list, arrange it in the ArrayList, and print the ArrayList
*
* @author Jerry Hou
* @since 1.0
*/

import java.util.ArrayList;
public class Tester {
	// where is code runs
	public static void main(String args[]) {
		// constructing different types of dogs
		Dog d1 = new Dog("Bella", 10);
		Dog d2 = new Dog ("Luna", 4);
		ShihTzu s1 = new ShihTzu("Charlie", 5);
		ShihTzu s2 = new ShihTzu("Lucy", 8);
		NewFoundLand n1 = new NewFoundLand("Cooper", 1);
		NewFoundLand n2 = new NewFoundLand("Max", 3);
		// trying out different methods of ArrayList
		ArrayList<Dog> dogs = new ArrayList<>();
		dogs.add(d1);
		dogs.add(d2);
		dogs.add(s1);
		dogs.add(s2);
		dogs.add(n1);
		dogs.add(n2);
		printDogs(dogs);
		dogs.add(0, new NewFoundLand("Bailey", 4));
		dogs.remove(n1);
		dogs.set(3, new Dog("Daisy", 5));
		printDogs(dogs);
	} // end of public static void main
	// this is the method that print the ArrayList nicely
	public static void printDogs(ArrayList<Dog> dogs) {
		System.out.println();
		for (int i = 0; i < dogs.size(); i ++) {
			System.out.println(dogs.get(i));
		}
		System.out.println();
	} // end of print dogs method
} // end of the Tester class
