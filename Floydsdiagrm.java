
public class Floydsdiagrm {

	public static void main(String[] args) {	
		
		int k=args.length;
		if(k>0) {
			int a=Integer.parseInt(args[0]);
			
			for(int j=0;j<a;j++) {
				
				for(int i=0;i<=j;i++) {
					System.out.print("*\t");		
					
				}
				System.out.println("\n");				
			}
		}
		else {
			System.out.println("Please enter an integer number");
		}

	}

}
