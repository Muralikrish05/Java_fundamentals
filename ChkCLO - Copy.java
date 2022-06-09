class ChkCLO{
	public static void main(String[] args) {
		int a= args.length;
		if (a>0){
			for(int i=0;i<a;i++){
				System.out.print(args[i]);
				if(i==a-1){
					break;	
				}
				System.out.print(" , ");
			}
		}
		else{
			System.out.println("No values");
		}
	}
}