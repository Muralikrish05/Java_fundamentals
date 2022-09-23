package Stringbuffering;

public class longshort {

	public static void main(String[] args) {
		String st1="Hello";
		String st2="Hi";
		while(st1.length()!=st2.length()) {
			if(st1.length()<st2.length()) {
				System.out.println(st1.concat(st2).concat(st1));
			}
			else {
				System.out.println(st2.concat(st1).concat(st2));
			}
			break;
		}

	}

}
