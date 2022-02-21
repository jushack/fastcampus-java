package Ch01;

public class ch10_typeConversion {

	public static void main(String[] args) {
		
		double dNum = 1.2;
		float fNum = 0.9f;
		
		int num1 = (int)dNum + (int)fNum;
		int num2 = (int)(dNum + fNum);
		
		System.out.println(num1);
		System.out.println(num2);
	}

}
