package com.atmecs.atm.atm;
import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class Atm
{
	double bal=10000;
	// previousTransaction;
	String cusname;
	Scanner scan = new Scanner(System.in);
	void withdraw() {
		int amt = scan.nextInt();
		try {

			if(amt<bal) {
				System.out.println("enter the amount to withdraw");
				amt = scan.nextInt();
				bal=bal-amt;
				System.out.println("balance is :  "  +  bal);
				System.out.println(amt  +  "  has been withdrawn");
			}
			else {
				System.out.println("not enough bal");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		} }
		void deposit()  { 
			System.out.println("enter amt to deposit");
			Scanner scan = new Scanner(System.in);
			int amt=scan.nextInt();
			try {
				if(amt <100) {
					bal=amt+bal;
					System.out.println("balalce is    "  +  bal);
					System.out.println("amt deposited is    "  +   amt);
					throw new MyException("cdwtudc");
				}
				else {
					System.out.println("the minimum deposit amount is 100");
				}
			}
			catch(MyException e) {
				System.out.println("wdguua");
				e.printStackTrace();	
			}
		}
	}