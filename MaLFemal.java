class MalFemal{
	public static void main(String[] args) {
		String s=args[0];
		int age=Integer.parseInt(args[1]);
		if(s.equalsIgnoreCase("Female")){
			if(age>0&&age<59){
				System.out.println("The percentange of interest is 8.2%");
			}
			else if(age>58&&age<101){
				System.out.println("The percentange of interest is 9.2%");
			}
			else{
				System.out.println("Congractulations Ma'am ...!!\n You made a century in your age");
			}
		}
		else if(s.equalsIgnoreCase("Male")){
			if(age>0&&age<59){
				System.out.println("The percentange of interest is 8.4%");
			}
			else if(age>58&&age<101){
				System.out.println("The percentange of interest is 10.5%");
			}
			else{
				System.out.println("Congractulations Sir ...!!\n You made a century in your age");
			}
		}
		else {
			System.out.println("Please Enter correct Gender");
		}
	}
}