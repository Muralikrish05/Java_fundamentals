package Stringbuffering;

public class removestar {

	public static void main(String[] args) {
		String str="ab*cd";
		int i =str.indexOf("*");
		System.out.println(str.substring(0, i-1).concat(str.substring(i+2, str.length())));
		

	}

}
