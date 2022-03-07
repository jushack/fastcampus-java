package Ch06;

public class Student {
	
	public int studentNumber;
	public String studentName;
	public int grade;
	
	public Student(int studentNumber, String studentName, int grade) {
		
		//this.studentNumber는 public 옆에 있는것
		//오른쪽에 있는 studentNumber는 매개변수에 있는것을 의미
		this.studentNumber = studentNumber;
		this.studentName = studentName;
		this.grade = grade;
	}
	
	public String showStudentInfo() {
		return studentName + "학생의 학번은 " + studentNumber + "이고, " + grade + "학년 입니다.";
		
	}
}
