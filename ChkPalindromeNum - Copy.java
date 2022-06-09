
public class ChkPalindromeNum {

	public static void main(String[] args) {
		
		int x=10101;
		String s=Integer.toString(x);
		String s1="";
		int a=s.length();
		while(a>0) {
			int l=x%10;
			//System.out.print(l);
			//String s1="";
			s1=s1+l;
			x=Math.floorDiv(x, 10);
			a--;
		}
		
		//System.out.println(s);
		//System.out.println(s1);
		if(s1.equals(s)) {
			System.out.println("The number is Palindrome");
		}
		else {
			System.out.println("The number is not Palindrome");
		}
		
	}

}
