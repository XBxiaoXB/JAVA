package ex0303;

public class SavingAccount extends Account{
	int loan;
	int a;
	public SavingAccount(String name, int balance,int loan) {
		super(name, balance);
		this.name = name;
		this.balance = balance;
		this.loan =loan;
	}
	
	public  void SavaingsAccount(String name,int balance,int loan)
	{
		this.name = name;
		this.balance = balance;
		this.loan =loan;
		
	}
	
	public int takeLoan(int money)
	{
		int b = a -money -loan; 
		this.loan = loan + money;
		return b;
	}
	
	public void showAccount()
	{
		System.out.println("山田花子さんの口座");
		System.out.println("口座名義: " + this.name);
		System.out.println("残高　　:" + this.balance);
		System.out.println("借入合計:" + this.loan);
	}

}
