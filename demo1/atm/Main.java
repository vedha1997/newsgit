package com.atmecs.atm.atm;

public class Main extends savings{
	savings save;


	void menu() {
		char option;
		System.out.println("welcome  "   +  cusname);
		System.out.println("A. withdraw");
		System.out.println("B. deposit");
		System.out.println("C. check balance");
		System.out.println("D. exit");
		System.out.println("E. savings acoount");

		do {
			System.out.println("enter teh option");
			option = scan.next().charAt(0);


			switch(option) {
			case 'A' :
				System.out.println("u havve selected withdraw ");
				withdraw();
				break;

			case 'B' :
				System.out.println("you have selected deposit");
				deposit();
				break;
			case 'C' :
				System.out.println("your balance is  : "    +  bal);
				break;

			case 'D' :
				System.out.println("freawutfcwfcgh ea");
				break;

			case 'E' :
				System.out.println("the savings account is");
				createSavingsAcc();
				break;

			default :
				System.out.println("invalid selection");
				break;
			}
		}
		while(option != 'D');

		System.out.println("thanks for using serveice");


	}


	public static void main(String[] args) {
		//savings sav = new savings();
		Main main = new Main();
		//sav.setAnnualInterestRate(500);
		//Main main = new Main();
		main.menu();
		// TODO Auto-generated method stub
		//sav.checkPass(password);

	}}

