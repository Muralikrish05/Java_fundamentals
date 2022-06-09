
public class ReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=100235;
		String s=Integer.toString(x);
		int a=s.length();
		while(a>0) {
			int l=x%10;
			System.out.print(l);
			x=Math.floorDiv(x, 10);
			a--;
		}
	}

}
