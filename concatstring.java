package Stringbuffering;

public class concatstring {

	public static void main(String[] args) {
		String st1="Muralik";
		String st11=st1.toLowerCase();
		String st2="Krishna";
		String st22=st2.toLowerCase();
		String str=st11.concat(st22);
		StringBuffer st=new StringBuffer(str);
		if(st11.charAt(st1.length()-1)==st22.charAt(0)) {
			st.deleteCharAt(st1.length()-1);
		}
		String tr=new String(st);
		System.out.println(tr);

	}

}
