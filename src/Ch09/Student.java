package Ch09;

public class Student {

	int studentId;			// �л� ���̵�
	String studentName;		// �л� �̸�
	
	Subject korea;
	Subject math;
	
	public Student(int studentId, String studentName) {
		
		this.studentId = studentId;
		this.studentName = studentName;
		
		korea = new Subject();
		math = new Subject();
	}
	
	public void setKoreaSubject(String name, int score) {
		korea.subjectName = name;
		korea.score = score;
	}
	
	public void setMathSubject(String name, int score) {
		math.subjectName = name;
		math.score = score;
	}
	
	public void showStudentScore() {
		int total = korea.score + math.score;
		System.out.println(studentName + "�л��� ������ " + total + "���Դϴ�.");
	}
	
	
	
}
