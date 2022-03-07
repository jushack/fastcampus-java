package Ch09;

public class Student {

	int studentId;			// 학생 아이디
	String studentName;		// 학생 이름
	
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
		System.out.println(studentName + "학생의 총점은 " + total + "점입니다.");
	}
	
	
	
}
