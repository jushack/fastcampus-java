package Ch07;

public class UserInfo {
	
	public String userId;
	public String userPassword;
	public String userName;
	public String userAddress;
	public String phoneNumber;	// 0���� �����ؼ� string���� ����.
	
	public UserInfo() {}		
	// UserInfoTest ���� UserInfo userLee = new UserInfo(); �� ����Ϸ��� ������� ��
	
	public UserInfo(String userId, String userPassword, String userName) {
		this.userId = userId;
		this.userPassword = userPassword;
		this.userName = userName;
	}
	
	public String showUserInfo() {
		return "������ ���̵�� " + userId + "�̰�, �н������ " + userPassword + "�̸�, ��ϵ� �̸��� " + userName + "�Դϴ�."; 
	}
}
