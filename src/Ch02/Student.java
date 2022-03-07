package Ch02;

public class Student {

	public int studentID;
	public String studentName;
	public String address;
	
	public void showStudentInfo() {
		System.out.println(studentID + "학번 학생의 이름은 " + studentName + "이고, 주소는 " + address + " 입니다.");
	}
	
	//이름을 지정하거나 반환해주는 메서드 생성
	public String getStudentName() {
		return studentName;
	}
	
	//이름을 바꾸겠다면 반환값은 없겠지만 이름을 세팅한다해서 set을 사용
	public void setStudentName(String name) {	//어떤 이름으로 바꿀것인지 매개변수에 입력
		studentName = name;
	}

}
