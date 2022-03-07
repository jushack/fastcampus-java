package Ch08;

public class OrderTest {

	public static void main(String[] args) {
		
		Order myOrder = new Order();
		myOrder.orderNumber = "20203402";
		myOrder.customerPhoneNumber = "0102397423";
		myOrder.customerAddress = "seoul";
		myOrder.orderDate = "20220202";
		myOrder.orderTime = "213124";
		myOrder.price = 35000;
		myOrder.menuId = "3333";
		
		myOrder.showOrderDetail();
	}

}
