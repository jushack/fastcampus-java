package Ch01;

public class ch21_breakTest {

	public static void main(String[] args) {
		
		int sum = 0;
		int n;
		
		for(n = 1; ; n++) {
			sum += n;
			if(sum >= 100) break;
		}
		System.out.println(sum);
		System.out.println(n);
	}

}
