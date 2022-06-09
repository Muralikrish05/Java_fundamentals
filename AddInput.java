public class AddInput {

	public static void main(String[] args) {
		int x=12345;
		int sum=0;
		String s=Integer.toString(x);
		int c=s.length();
		for(int i=0;i<c;i++) {
			int r=x%10;
			sum=sum+r;
			x=Math.floorDiv(x, 10);
			
		}
		System.out.println(sum);
	}

}
