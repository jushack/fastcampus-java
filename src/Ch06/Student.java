package Ch06;

public class Student {
	
	public int studentNumber;
	public String studentName;
	public int grade;
	
	public Student(int studentNumber, String studentName, int grade) {
		
		//this.studentNumber�� public ���� �ִ°�
		//�����ʿ� �ִ� studentNumber�� �Ű������� �ִ°��� �ǹ�
		this.studentNumber = studentNumber;
		this.studentName = studentName;
		this.grade = grade;
	}
	
	public String showStudentInfo() {
		return studentName + "�л��� �й��� " + studentNumber + "�̰�, " + grade + "�г� �Դϴ�.";
		
	}
}
