package Ch08;

public class Order {
	
	public String orderNumber;
	public String customerPhoneNumber;
	public String customerAddress;
	public String orderDate;
	public String orderTime;
	public String menuId;
	public int price;
	
	public void showOrderDetail() {
		
		System.out.println("�ֹ� ���� ��ȣ: " + orderNumber);
		System.out.println("�ֹ� �ڵ��� ��ȣ: " + customerPhoneNumber);
		System.out.println("�ֹ� �� �ּ�: " + customerAddress);
		System.out.println("�ֹ� ��¥: " + orderDate);
		System.out.println("�ֹ� �ð�: " + orderTime);
		System.out.println("�޴� ��ȣ: " + menuId);
		System.out.println("�ֹ� ����: " + price);
	}
}
