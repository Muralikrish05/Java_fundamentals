class PrimeNum {

	public static void main(String[] args) {
		//int flag=0;
		for(int i=10;i<=99;i++) {
		    int flag=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					flag+=1;
					
				}
				
			}
			if(flag==2) {
	    	    System.out.println(i);
	    	   
			}
			
		}

	}

}
