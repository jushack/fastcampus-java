package Ch06;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student(12345, "Lee", 3);
		Student studentKim = new Student(54321, "Kim", 5);
		
		String data1 = studentLee.showStudentInfo();
		String data2 = studentKim.showStudentInfo();

		System.out.println(data1);
		System.out.println(data2);

	}

}
