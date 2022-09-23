package Stringbuffering;
class demo{
	public String Even(String s,int n) {
		return s.substring(0, n);
	}
	public String Odd() {
		return null;
	}
}

public class odd_evem extends demo {

	public static void main(String[] args) {
		demo d= new demo();
		String st="Maths";
		String f="";
		int k=st.length();
		
		if(k%2==0) {
			int h=k/2;
			f=d.Even(st, h);
		}
		else {
			f=d.Odd();
		}
		System.out.println(f);
		

	}

}
