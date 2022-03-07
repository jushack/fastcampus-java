package Ch02;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student(); //Student 하나를 생성해라는 의미
		
		studentLee.studentID = 12345;
		studentLee.setStudentName("Lee");
		studentLee.address = "강남구";
		
		studentLee.showStudentInfo();
		
		Student studentKim = new Student();
		
		studentKim.studentID = 54321;
		studentKim.setStudentName("Kim");
		studentKim.address = "성남시";
		
		studentKim.showStudentInfo();
	}

}
