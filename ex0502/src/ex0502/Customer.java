package ex0502;

public class Customer {
	
	String name;
	int myCart; 
	
	Cart cart = new Cart();
	
	public Customer (String name)
	{
		this.name = name;
		
	}
	
	public void buyitem(shop shop,int itemNo)  //xuanze
	{
		Item a =shop.listItem.get(itemNo);
		cart.addItem(a);
		System.out.println("商品番号  (qで終了)" + itemNo );
	}
	
	public void printCustomer()
	{
		System.out.println("******************");
		System.out.println("私は名前は" + name + "です。");
		System.out.println("カートに入っている商品は、");
		cart.printCart();
		//System.out.println("******************");
	}

}
