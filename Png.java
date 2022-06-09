class Png{
	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		//int a=-5;
		if (a>0) {
			System.out.println("The number is Positive");

		}
		else if(a<0){
			System.out.println("The number is Negitive");
		}
		else{
			System.out.println("The number is Zero");
		}
	}
}