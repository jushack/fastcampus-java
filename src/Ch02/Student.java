package Ch02;

public class Student {

	public int studentID;
	public String studentName;
	public String address;
	
	public void showStudentInfo() {
		System.out.println(studentID + "�й� �л��� �̸��� " + studentName + "�̰�, �ּҴ� " + address + " �Դϴ�.");
	}
	
	//�̸��� �����ϰų� ��ȯ���ִ� �޼��� ����
	public String getStudentName() {
		return studentName;
	}
	
	//�̸��� �ٲٰڴٸ� ��ȯ���� �������� �̸��� �����Ѵ��ؼ� set�� ���
	public void setStudentName(String name) {	//� �̸����� �ٲܰ����� �Ű������� �Է�
		studentName = name;
	}

}
