package ex0502;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		shop sh = new shop("ジョウ");
		shop sh1 = new shop("bookoff");
		
		Item[] data = {
				new Item("北洋水",1000),
				new Item("XYZ ",250),
				new Item("青汁",180),
				new Item("大王",400),
				new Item("人参",850),
				new Item("BOOK1",666),
				new Item("BOOK2",777),
				new Item("BOOK3",999)};
		
		
		sh.addItem(data[0]);
		sh.addItem(data[1]);
		sh.addItem(data[2]);
		sh.addItem(data[3]);
		sh.addItem(data[4]);
	
		sh1.addItem(data[5]);
		sh1.addItem(data[6]);
		sh1.addItem(data[7]);
		
		sh.printShop();
		sh1.printShop();
		
		Customer cu = new Customer("田中");
		
		cu.buyitem(sh, 1);
		cu.buyitem(sh, 3);
		cu.buyitem(sh, 2);
		cu.buyitem(sh, 3);
			
		cu.buyitem(sh1, 0);
		cu.buyitem(sh1, 2);
		
		cu.printCustomer();
			
	}

}
