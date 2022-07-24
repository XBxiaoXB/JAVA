package ex0502;

public class Item {

	public String name;
	public int price;
	
	public Item(String name,int price) 
	{
		this.name = name;
		this.price =price;
	}
	
	public void printltem() {
		System.out.println(name + " : "+ price +"円");
	}
}
