package ex0501;

import java.util.ArrayList;
import java.util.List;

public class shop {

	String name;
	List<Item> listItem = new ArrayList<Item>();

	public shop(String name) {
		this.name =name;
		System.out.println(name + "登録");

	}

	//List<String> listItem = new ArrayList<String>();

	
	public void addItem(Item item)	
	{
		listItem.add(item);
	}
	
	public void printShop()
	{
		System.out.println("=======================");
		for(int i=0;i<listItem.size();i++)
		{
			System.out.print(i + "  ");
			listItem.get(i).printltem();
		}
		System.out.println("=======================");

	}

	public void addItem(String string, int i) {
		Item item =new Item(string , i);
		listItem.add(item);
		
	}
}
