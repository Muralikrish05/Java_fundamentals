package Classes_and_objects;




class Calculator{
	public static double PowerInt(int a,int b) {
		
		double res=Math.pow(a,b);
		return res;
	}
	public static double PowerDouble(double a,int b) {
		double res=Math.pow(a, b);
		return res;
	}
}

public class Second {

	public static void main(String[] args) {
		Calculator c=new Calculator();
		double first=c.PowerInt(5, 2);
		double second=c.PowerDouble(5.5, 2);
		System.out.println(first+"\n"+second);
		

	}

}
