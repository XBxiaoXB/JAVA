package ex0303;

public class SavingAccount extends Account{
	int loan;

	
	
	public SavingAccount(String name, int balance,int loan) {
		super(name, balance);
		this.loan =loan;
	}
	
	public void takeLoan(int money)
	{
		this.loan = loan + money;
		balance = balance + loan;
	}
	
	public void showAccount()
	{
		System.out.println("山田花子さんの口座");
		System.out.println("口座名義: " + this.name);
		System.out.println("残高　　:" + this.balance);
		System.out.println("借入合計:" + this.loan);
	}

}
