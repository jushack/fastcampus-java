package Ch07;

public class UserInfo {
	
	public String userId;
	public String userPassword;
	public String userName;
	public String userAddress;
	public String phoneNumber;	// 0으로 시작해서 string으로 줬음.
	
	public UserInfo() {}		
	// UserInfoTest 에서 UserInfo userLee = new UserInfo(); 을 사용하려면 적어줘야 함
	
	public UserInfo(String userId, String userPassword, String userName) {
		this.userId = userId;
		this.userPassword = userPassword;
		this.userName = userName;
	}
	
	public String showUserInfo() {
		return "고객님의 아이디는 " + userId + "이고, 패스워드는 " + userPassword + "이며, 등록된 이름은 " + userName + "입니다."; 
	}
}
