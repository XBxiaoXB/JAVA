package ex0501;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		shop sh = new shop("shop");
		
		Item item =new Item("AAA",100);
		sh.addItem(item);
		
		Item item1 =new Item("BBB",200);
		sh.addItem(item1);
		
		Item item2 =new Item("CCC",300);
		sh.addItem(item2);
		
		sh.addItem("AAA" ,100);
		
		sh.printShop();
		
	}

}
