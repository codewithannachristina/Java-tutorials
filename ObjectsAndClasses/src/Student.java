
public class Student {
	char gender;
	String name;
	int grade;
	void print_grade() {
		System.out.println("Grade: " + this.grade);
	}
	void add_grade(int points) {
		this.grade = this.grade + points;
	}
	void substract_grade(int points) {
		this.grade = this.grade - points;
	}
	char get_gender(){
		return this.gender;
	}

}
