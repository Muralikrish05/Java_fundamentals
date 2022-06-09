
import java.util.Scanner;
class ColrCods{
	public static void main(String[] args) {
		System.out.println("Enter R for Red \nEnter B for Blue\nEnter G for Green\nEnter O for Orange\nEnter Y for Yellow\nEnter W for White");
		Scanner sc = new Scanner(System.in);
		//int input=sc.nextInt();
		char input=sc.next().charAt(0);
		switch(input){
			case 82:
				System.out.println("You have Choosen for Red");
				break;
			case 66:
				System.out.println("You have Choosen for Blue");
				break;
			case 71:
				System.out.println("You have Choosen for Green");
				break;
			case 79:
				System.out.println("You have Choosen for Orange");
				break;
			case 89:
				System.out.println("You have Choosen for Yellow");
				break;
			case 87:
				System.out.println("You have Choosen for White");
				break;
			default:
				System.out.println("Invalid Code");
				
		}
	}
}