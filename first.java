package Classes_and_objects;

class Box{
	int w;
	int h;
	int d;
	Box(int width,int height,int depth){
		this.w=width;
		this.h=height;
		this.d=depth;
		
	}
	int Cal_Vol() {
		int volume=w*h*d;
		return volume;
	}
}

public class first {

	public static void main(String[] args) {
		Box b=new Box(2,5,3);
		int vol=b.Cal_Vol();
		System.out.println("The Volume of Box is "+vol);
		Box b1=new Box(12,25,15);
		System.out.println("The Volume of Box is "+b1.Cal_Vol());
		
		
		

	}

}
