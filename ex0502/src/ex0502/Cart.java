package ex0502;

import java.util.ArrayList;
import java.util.List;

public class Cart {
	
	List<Item> listItem = new ArrayList<Item>();
	
	public void printCart() 
	{
		System.out.println("==========print Cart=========");
		for(int i=0;i<listItem.size();i++)
		{
			System.out.print(i + "  ");
			listItem.get(i).printltem();
		}
		System.out.println("==========print Cart=========");
	}
	
	public void addItem(Item item)	
	{
		listItem.add(item);
	}


}
