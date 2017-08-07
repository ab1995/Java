class Account{
	private int accNumber;
	private double accBalance;
	
	public Account(int accNumber, double accBalance){
		this.accNumber=accNumber;
		this.accBalance=accBalance;
	}
	
	public void depositMoney(double amtToDeposit){
		accBalance+=amtToDeposit;
	}
	
	public void withdrawMoney(double amtToWithdraw){
		if(this.accBalance>=amtToWithdraw)
			accBalance-=amtToWithdraw;
		else
			System.out.println("Transaction Failed. Amount to Withdraw exceeds Account Balance");
	}
	
	public String toString(){
		return ("Account No.: "+this.accNumber+" Account Balance: "+this.accBalance);
	}
}

public class TestAccount{
	public static void main(String args[]){
		
		Account acc1 = new Account(111,1000);
		System.out.println(acc1);
		acc1.depositMoney(100);
		System.out.println(acc1);
		acc1.withdrawMoney(100);
		System.out.println(acc1);
	}	

	
}