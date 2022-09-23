package Classes_and_objects;

public class TestEmployee {

	public static void main(String[] args) {
		employee em = new employee();
		em.setName("Murali");
		em.setYear(2022);
		em.setLPA(5.5);
		em.setInsurance("LIC");
		System.out.println("Employee Name :- "+em.getName());
		System.out.println("Joining date :- "+em.getYear());
		System.out.println("Salary :- "+em.getLPA());
		System.out.println("Inurance policy:- "+em.getInsurance());
		

	}

}
