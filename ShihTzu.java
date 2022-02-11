public class ShihTzu extends Dog {
	public ShihTzu(String name, int birth) {
		super(name, birth);
	}
	public void fetchRats() {
		System.out.println(super.getName() + " catched a rat");
	}
	public String toString() {
		return super.toString();
	}
	public void bark(String sound) {
		System.out.println(sound);
	}
}
