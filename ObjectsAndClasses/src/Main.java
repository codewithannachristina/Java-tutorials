
public class Main {

	public static void main(String[] args) {
		Student Paul;
		Student Lauren = new Student();
		System.out.println(Lauren.grade);
		Lauren.gender = 'F';
		Paul = new Student();
		Paul.gender = 'M';
		Paul.name = "Paul";
		System.out.println(Paul.name);
		System.out.println(Paul.grade);
		
		Lauren.print_grade();
		Paul.print_grade();
		
		Lauren.grade = 76;
		Paul.grade = 95;
		
		Paul.add_grade(2);
		Lauren.substract_grade(3);
		
		System.out.println(Paul.grade);
		System.out.println(Lauren.grade);
		
		Paul = Lauren;
		System.out.println(Paul.gender);
		Lauren.gender = 'M';
		System.out.println(Paul.gender);
		
		char myGender;
		myGender = Lauren.get_gender();
		System.out.println(myGender);
		
		Person Toni;
		Toni = new Person();
		System.out.println(Toni.height);
		System.out.println(Toni.st);
		//System.out.println(Toni.st.grade);
		Toni.st = new Student();
		System.out.println(Toni.st.grade);
		Toni.st.print_grade();
	}

}
