public class NewFoundLand extends Dog {
	public NewFoundLand(String name, int birth) {
		super(name, birth);
	}
	
	public void swim() {
		System.out.println(super.getName() + " is swimming");
	}
	
	public String toString() {
		return super.toString();
	}
	
	public void bark(String sound) {
		System.out.println(sound);
	}
}
