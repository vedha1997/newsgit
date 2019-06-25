package excep;

import java.util.Scanner;
/**
 * Date:20/06/2019
 * Exception class 
 * if the user password is less than 5 characters then it will throw an exception
 * @author Vedha.Venkataraman
 *Version : 1.02
 */

public class Excep 
{
	/**
	 * passing a string through constructor
	 * @param s
	 */
	public Excep(String s)
	{
		super();
	}

	Scanner scan = new Scanner(System.in);
	static String password ="ved";
	public void Pass() throws Savings{
		try {


			if(password.length() < 5) {

				System.out.println("bad pass");
				System.out.println(password);
				throw new Savings("error");
			}}
		catch(Exception e) {
			e.printStackTrace();

		}

		finally {
			System.out.println("The finally statement is executed");
		}

	}
	/**
	 * the exception is given in try block which got handled in the catch block
	 * @param args
	 */
	public static void main(String[] args) 
	{ 
		Excep sav = new Excep("vfwdgu");
		try {
			Excep2.excep("ved");
		} catch (Exception e) {
			System.out.println("excption printed");
		}
		


	}}
