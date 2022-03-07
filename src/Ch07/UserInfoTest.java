package Ch07;

public class UserInfoTest {

	public static void main(String[] args) {
		
		UserInfo userLee = new UserInfo();
		userLee.userId = "a12345";
		userLee.userPassword = "zxcvasdfqwer";
		userLee.userName = "Lee";
		userLee.phoneNumber = "01012345678";
		userLee.userAddress = "seoul";
		
		System.out.println(userLee.showUserInfo());
		
		UserInfo userKim = new UserInfo("b1234", "zxcvasdqwe", "Kim");
		System.out.println(userKim.showUserInfo());
	}

}
