import java.util.Scanner;
public class ChkPrimeNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int flag=0;
		int x=sc.nextInt();
		for(int i=1;i<=x;i++) {
			if(x%i==0) {
				//System.out.println(i);
				flag+=1;
			}
		}
		//System.out.println(flag);
		if (flag>2) {
			System.out.println("The number is Not Prime Number");
		}
		else {
			System.out.println("The number is Prime Number");
		}
	}

}
