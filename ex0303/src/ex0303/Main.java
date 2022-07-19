package ex0303;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Account ne = new Account("田中一郎", 50000);
		SavingAccount pkg = new SavingAccount("山田花子", 30000,10000);
		
		ne.showAccount();
		pkg.showAccount();
		
		pkg.takeLoan(20000);
		pkg.withdraw(30000);
		
		ne.deposite(50000); 
		System.out.println("*************************");
		ne.showAccount();
		pkg.showAccount();

	}

}
