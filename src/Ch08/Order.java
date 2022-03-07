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
		
		System.out.println("주문 접수 번호: " + orderNumber);
		System.out.println("주문 핸드폰 번호: " + customerPhoneNumber);
		System.out.println("주문 집 주소: " + customerAddress);
		System.out.println("주문 날짜: " + orderDate);
		System.out.println("주문 시간: " + orderTime);
		System.out.println("메뉴 번호: " + menuId);
		System.out.println("주문 가격: " + price);
	}
}
