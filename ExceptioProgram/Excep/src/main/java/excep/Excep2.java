package excep;

public class Excep2 {
	
	static void excep(String password) throws Savings {
		if(password.length() < 5) {
			System.out.println("bad pass");
			//System.out.println(password);
			throw new Savings("password length is small");
		}
		else {
			System.out.println("Password is proper");
		}
	}

}
