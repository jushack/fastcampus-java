package Ch02;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student(); //Student �ϳ��� �����ض�� �ǹ�
		
		studentLee.studentID = 12345;
		studentLee.setStudentName("Lee");
		studentLee.address = "������";
		
		studentLee.showStudentInfo();
		
		Student studentKim = new Student();
		
		studentKim.studentID = 54321;
		studentKim.setStudentName("Kim");
		studentKim.address = "������";
		
		studentKim.showStudentInfo();
	}

}
