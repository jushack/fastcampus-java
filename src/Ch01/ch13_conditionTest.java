package Ch01;

import java.util.Scanner;

public class ch13_conditionTest {

	public static void main(String[] args) {
		
		int max;
		System.out.println("입력받은 두 수 중에서 큰 수를 출력하세요\n");
	
		Scanner sc = new Scanner(System.in);
		System.out.print("입력1: ");
		int x = sc.nextInt();
		System.out.print("입력2: ");
		int y = sc.nextInt();
		
		max = (x > y) ? x : y;
		System.out.println(max);
	}
}
