package Ch09;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student(100, "Lee");
		studentLee.setKoreaSubject("����", 100);
		studentLee.setMathSubject("����", 95);
		
		Student studentKim = new Student(108, "Kim");
		studentKim.setKoreaSubject("����", 88);
		studentKim.setMathSubject("����", 90);
		
		studentLee.showStudentScore();
		studentKim.showStudentScore();

		
		
		
	}

}