package Classes_and_objects;





class animal{
	public static void eat() {
		
	}
	public static void sleep() {
		
	}
}
class Bird extends animal{
	public static void eat() {
		
	}
	public static void sleep() {
		
	}
	public static void fly() {
		
	}
}

public class fourth {

	public static void main(String[] args) {
		animal a=new animal();
		Bird b = new Bird();
		a.eat();
		a.sleep();
		b.eat();
		b.sleep();
		b.fly();

	}

}
