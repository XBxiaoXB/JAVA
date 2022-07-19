package ex0304;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] hour = {8,10,9,8,11};

		Employee emp = new Employee();

		emp.work();
		emp.work(8);
		emp.work("一生懸命");
		int result = emp.work(hour);

		System.out.println("今週" + result + "時間働きました。");


	}

}
