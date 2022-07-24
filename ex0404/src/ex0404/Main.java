package ex0404;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		HighEmployee hig = new HighEmployee("田中", 50000);
		LowEmployee low = new LowEmployee("佐藤",150000);

		hig.getSalary();
		hig.getBonus();
		hig.introduce();
		
		//LowEmployee low = new LowEmployee("佐藤",150000);
		
		int b =low.getSalary();
		int b1 = low.getBonus();
		low.introduce();

	}

}
