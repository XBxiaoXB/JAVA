package ex0502;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		shop sh = new shop("ジョウ");
		
		Item[] data = {
				new Item("北洋水",1000),
				new Item("XYZ ",250),
				new Item("青汁",180),
				new Item("大王",400),
				new Item("人参",850)};
		
		sh.addItem(data[0]);
		sh.addItem(data[1]);
		sh.addItem(data[2]);
		sh.addItem(data[3]);
		sh.printShop();
		
		Customer cu = new Customer("田中");
		
		cu.buyitem(sh, 1);
		cu.buyitem(sh, 3);
		cu.buyitem(sh, 2);
		cu.buyitem(sh, 3);
		
		cu.printCustomer();
			
	}

}
