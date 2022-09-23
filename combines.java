package Stringbuffering;

public class combines {
	public static void main(String[] args) {
		String st1="Hello";
		String st2="Hiiiii";
		
		for(int i=0;i<st1.length()&i<st2.length();i++) {
			System.out.print(st1.charAt(i));
			System.out.print(st2.charAt(i));
		}
		if(st1.length()<st2.length()) {
			System.out.println(st2.subSequence(st1.length(), st2.length()));
		}
		else {
			System.out.println(st1.subSequence(st2.length(), st1.length()));
		}
	}

}
