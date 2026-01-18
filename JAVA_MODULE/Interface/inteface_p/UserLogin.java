package inteface;

interface LoginService {
	void login();

	void logout();
}

class UserLogin implements LoginService {

	public void login() {
		System.out.println("User logged in successfully");
	}

	public void logout() {
		System.out.println("User logged out successfully");
	}

	public static void main(String[] args) {
		LoginService l = new UserLogin();
		l.login();
		l.logout();
	}
}
