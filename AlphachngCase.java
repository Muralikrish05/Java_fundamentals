class AlphachngCase{
	public static void main(String[] args) {
		char a='e';
		if(Character.isLowerCase(a)) {
			char m=Character.toUpperCase(a);
			System.out.println(m);
		}else {
			char m=Character.toLowerCase(a);
			System.out.println(m);
		}
	}
}