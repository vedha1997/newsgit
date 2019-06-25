package collections;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Hotel {
	int o,quantity;
	int price =0;
	//String pref = " ";

	Scanner scan = new Scanner(System.in);
	LinkedList<String> cook = new LinkedList<>();
	ArrayList<String> pref = new ArrayList<String>();
	String food() {
		cook.add(0,"briyani");
		cook.add(1,"noodles");
		cook.add(2,"fried rice");
		cook.add(3,"chi bri");
		cook.add(4,"mut bri");
		System.out.println(cook);
		System.out.println("enter your choices");
		//System.out.println(pref);
		System.out.println("how many dishes you want to have");
		o = scan.nextInt();
		int i;
		for(i=1;i<=o;i++) {
			System.out.println("enter wat you want");
			System.out.println("1.briyani 2.noodels 3.froedrice 4.chibri 5.mutbri");
			int t =scan.nextInt();
			while(t<=5) {
				
				if(t == 1) {
					pref.add(0,cook.get(0));
					System.out.println(" your choices is " + pref);	
					price = price +100;
					quantity();

					break;
				}
				else if(t == 2) {
					pref.add(0,cook.get(1));
					System.out.println(" your choices  " + pref);
					price = price +50;
					quantity();
					break;
				}
				else if(t ==3) {
					pref.add(0,cook.get(2));
					System.out.println(" your choices   "  + pref);
					price = price +70;
					quantity();
					break;
				}
				else if(t == 5) {
					pref.add(0,cook.get(3));
					System.out.println(" your choices  "  + pref);
					price = price +120;
					quantity();
					break;
				}
				else if(t == 4) {
					System.out.println("fbv");
					pref.add(0,cook.get(4));
					System.out.println(" your choices "  +  pref);
					System.out.println("fbv");
					price = price +130;
					quantity();
					break;
				}
			}

		}
		return null;

	}
	void bill() {
		
	Iterator<String>itr=pref.iterator();
	while(itr.hasNext()) {
		//System.out.println("de");
		System.out.println(itr.next());
		
	}
	}



	void quantity(){


		System.out.println("enter the quanity");
		Scanner scan = new Scanner(System.in);
		quantity = scan.nextInt();
		System.out.println("your quanitity" +  quantity);
		price();
	}


	int price() {
		price = quantity * price;
		System.out.println("the price is  " + price);
		return price;
	}


	public static void main(String[] args) {
		Hotel hot = new Hotel();
		hot.food();
		hot.bill();
		try {
			hot.print();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
void print() throws IOException {
	
FileWriter fw=new FileWriter("C:\\Users\\Vedha.Venkataraman\\Desktop\\file.txt");

	for(String str : pref) {
		fw.write(str);
		fw.write(price);
	}
	fw.close();
}
}
