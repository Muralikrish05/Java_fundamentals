package Classes_and_objects;
import java.util.Scanner;

class Author{
	String name;
	String email;
	char gender;
	Author(String name,String email,char gender){
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
	void AutrDetails() {
		System.out.println("Author details are:- ");
		System.out.print("Name: "+name+"\n");
		System.out.print("Email: "+email+"\n");
		System.out.print("Gender: "+gender);
	}
}

public class Book {
	static String B_name;
	static double price;
	static int qtyinstock;
	
	
	

	public static void main(String[] args) {
		System.out.println("List of the Books\n----------------");
		System.out.println("Comics\nHorror\nBiography\n\n\n");
		System.out.println("Enter the book which you want\n\n\n");
		Scanner sc=new Scanner(System.in);
		String B_name=sc.next();
		if(B_name.equalsIgnoreCase("Comics")) {
			System.out.println("price =2500.5");
			System.out.println("qtyinstock=3");
			Author a= new Author("Murali","abc@gmail.com",'m');
			a.AutrDetails();
		}
		else if(B_name.equalsIgnoreCase("Horror")) {
			System.out.println("price =3500.55");
			System.out.println("qtyinstock=5");
			Author a= new Author("Krishna","xyz@gmail.com",'m');
			a.AutrDetails();
		}
		else if(B_name.equalsIgnoreCase("Biography")) {
			System.out.println("price =2800.75");
			System.out.println("qtyinstock=8");
			Author a= new Author("Vaishnavi","mno@gmail.com",'f');
			a.AutrDetails();
		}
		else {
			System.out.println("No such books are currently available");
		}
		
		
		
		
	}

}
