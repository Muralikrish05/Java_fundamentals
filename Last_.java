package Override_POLIMORPISM;

class shape{
	void draw() {
		System.out.println("Drawing shape");
	}
	void erase() {
		System.out.println("Erasing shape");
	}
}
class circle extends shape{
	void draw() {
		System.out.println("Drawing circle");
	}
	void erase() {
		System.out.println("Erasing cirlcle");
	}
}
class triangle extends shape{
	void draw() {
		System.out.println("Drawing triangle");
	}
	void erase() {
		System.out.println("Erasing triangle");
	}
}
class square extends shape{
	void draw() {
		System.out.println("Drawing square");
	}
	void erase() {
		System.out.println("Erasing square");
	}
}

public class Last_ {

	public static void main(String[] args) {
		shape c= new circle();
		shape t= new triangle();
		shape s= new square();
		c.draw();
		c.erase();
		t.draw();
		t.erase();
		s.draw();
		s.erase();

	}

}
