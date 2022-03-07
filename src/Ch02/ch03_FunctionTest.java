package Ch02;

public class ch03_FunctionTest {

	public static int addNum(int num1, int num2) {
		int result;
		result = num1 + num2;
		return result;
	}
	
	// 반환값이 없을 때는 void를 사용한다.
	public static void sayHello(String greeting) {
		System.out.println(greeting);
	}
	
	// 매개변수가 없는 함수
	public static int calcSum() {
		
		int sum = 0;
		
		for(int i = 0; i <= 100; i++) {
			sum += i;
		}
		
		return sum;
			
	}
	
	public static void main(String[] args) {

		int n1 = 10;
		int n2 = 20;
		
		int total = addNum(n1, n2);
				
		int num = calcSum();
		
		System.out.println(total);
		sayHello("안녕하세요");
		System.out.println(num);
		
	}

}
