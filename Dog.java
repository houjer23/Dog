public class Dog {
	
	private String name;
	private int birth;
	
	public Dog(String name, int birth) {
		this.name = name;
		this.birth = birth;
	}
	
	public void eat() {
		System.out.println(name + " is eating");
	}
	
	public void sleep() {
		System.out.println(name + " is sleeping");
	}
	
	public void bark() {
		System.out.println("woof");
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() {
		return "Name: " + name + ",     " + "Birth: " + birth;
	}
}
