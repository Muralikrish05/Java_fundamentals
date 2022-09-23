package Stringbuffering;

public class nprob {

	public static void main(String[] args) {
		String st="Hellowww";
		int n=3;
		int p=st.length()-1-n;
		int y=p;
		while(y<st.length()-1) {
			System.out.println(st.substring(st.length()-p+1,st.length()));
			y=y+1;
			
		}

	}

}
