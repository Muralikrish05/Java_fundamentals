package Stringbuffering;

public class xterm {

	public static void main(String[] args) {
		String st="xtermx";
		if(st.charAt(0)=='x'&st.charAt(st.length()-1)=='x') {
			System.out.println(st.substring(1,st.length()-1));
		}
		else {
			System.out.println(st);
		}

	}

}
