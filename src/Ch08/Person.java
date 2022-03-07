package Ch08;

public class Person {
	
	public String name;
	public int age;
	public int height;
	public int weight;
	public String gender;
	
	public Person() {}
	
	public void showPersonInfo() {
		System.out.println("키가 " + height + "이고, 몸무게가 " + weight + "입니다.");
		System.out.println("이름은 " + name + "이고, 나이는 " + age + "세입니다.");
	}
	
	
}
