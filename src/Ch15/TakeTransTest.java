package Ch15;

public class TakeTransTest {

	public static void main(String[] args) {
		
		Student studentE = new Student("Edward", 20000);
		Taxi wellTaxi = new Taxi("�� ���� ���");
		studentE.takeTaxi(wellTaxi);
		
		studentE.showInfo();
		wellTaxi.showTaxiInfo();
		
	}

}
