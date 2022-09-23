package Stringbuffering;

public class palindrome {

	public static void main(String[] args) {
		StringBuffer sb= new StringBuffer();
		sb.append("MadaM");
		String str1=new String(sb);
		String str2=new String(sb.reverse());
		if(str2.equals(str1)) {
			System.out.println("Its palindrome");
			
		}
		else {
			System.out.println("Its not palindrome");
		}
		
		

	}

}
