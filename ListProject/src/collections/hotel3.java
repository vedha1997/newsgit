package collections;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

import collections.Hotel2.Item;

public class hotel3 {
	Scanner scan = new Scanner(System.in);
	LinkedList<String> cook = new LinkedList<>();


	int o;
	public Map<Item, Integer> getItemPrices() {
	
	Map<Item, Integer> itemPrices = new HashMap<Item, Integer>();
	itemPrices.put(Item.Biryani, 100);
	itemPrices.put(Item.FriedRice, 80);
	itemPrices.put(Item.Noodles, 60);
	itemPrices.put(Item.ChiBri, 150);
	itemPrices.put(Item.MutBri, 180);

	return itemPrices;}}
			/*
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
	}}*/