package Stringbuffering;

public class ncopies {

	public static void main(String[] args) {
		String st= "Wipro";
		int a= st.length();
		String s= st.substring(0, 2);
		int b=0;
		while(b<a) {
			System.out.print(s);
			b=b+1;
		}
		
		

	}

}
