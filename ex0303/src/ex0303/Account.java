package ex0303;

public class Account {
	String name;
	int balance;
	
	public Account(String name,int balance)
	{
		this.name =name;
		this.balance =balance;
	}
	
	public int withdraw(int money)
	{
		int a =balance - money;
		balance =a;
		return balance;
	}
	
	public int deposite(int money)
	{
		int b =balance + money;
		balance =b;
		return balance;
	}
	
	public void showAccount()
	{
		System.out.println("田中一郎さんの口座");
		System.out.println("口座名義: " + name);
		System.out.println("残高　　:" +balance);
	}

}
