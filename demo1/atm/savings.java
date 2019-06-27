package com.atmecs.atm.atm;

public class savings extends Atm {
	//String Name;
	static String password;
	String Address;
	Long number;
	double annualInterestRate=1000;
	double monthlyInterestRate; 
	//char pass;
	void createSavingsAcc()
	{
		System.out.println("enter the user name");
		cusname=scan.next();
		System.out.println("enter the address");
		String address = scan.next();
		System.out.println("enter the number");
		Long number = scan.nextLong();
		System.out.println("enter your pass");
		password=scan.next();
		System.out.println(valPass(password));
		System.out.println(checkPass(password));
		System.out.println("your pass is  "  +  password);
	}
	public static boolean valPass(String pass){
		if(pass.length() > 4) {
			System.out.println("the pass word is good");
			return true;
		}
		else
		{
			System.out.println("the pass small");
			return false;
		}


	}

	public static boolean checkPass(String pass){
		boolean hasNum = false;
		boolean hasCap = false;
		boolean hasLower = false;
		char c;
		for(int i=0;i < pass.length()	;i++) {
			c=password.charAt(i);
			if(Character.isDigit(c)) {
				hasNum=true;
				return hasNum;
			}
			else if(Character.isUpperCase(c)) {
				hasCap=true;
				return hasCap;

			}
			else if(Character.isLowerCase(c)) {
				hasLower=true;
				return hasLower;
			}
			if(hasNum  &&   hasCap   &&   hasLower) {
				System.out.println("the pass has passed the its criteria");
				return true;
			}
			else {
				System.out.println("not matched the criteria");
				return false;
			}

		}
		return true;


	}


}


