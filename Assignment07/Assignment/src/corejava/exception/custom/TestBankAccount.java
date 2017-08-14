package corejava.exception.custom;

class BankAccount{
	private int accId;
	private double accBalance;
	
	public BankAccount(int accId, int accBalance){
		this.accId=accId;
		this.accBalance=accBalance;
	}
	
	public double getBalance(){
		return this.accBalance;
	}
	
	public void withDraw(double amount) throws InsufficientBalanceException{
		if(this.accBalance>=amount)
			this.accBalance-=amount;
		else
			throw new InsufficientBalanceException(""+this.accBalance);
	}
}

class SavingAccount extends BankAccount{
	private double fixedDeposit;
	
	public SavingAccount(int accId, int accBalance, int fixedDeposit){
		super(accId, accBalance);
		this.fixedDeposit=fixedDeposit;
	}
	
	public double getBalance(){
		return this.fixedDeposit+super.getBalance();
	}
	
}

class CurrentAccount extends BankAccount{
	private double cashCredit;
	
	public CurrentAccount(int accId, int accBalance, int cashCredit){
		super(accId, accBalance);
		this.cashCredit=cashCredit;
	}
	
	public double getBalance(){
		return this.cashCredit+super.getBalance();
	}	
}

public class TestBankAccount{
	
	public static double getTotalCashInBank(BankAccount[] bankAccArray){
		double totalCashInBank=0;
		for(int iter=0;iter<bankAccArray.length;iter++)
		{
			totalCashInBank+=bankAccArray[iter].getBalance();
		}
		return totalCashInBank;
	}
	
	public static void main(String args[]){
	
		BankAccount[] bankAccArray=new BankAccount[3];
		bankAccArray[0]=new SavingAccount(111, 1000, 100);
		bankAccArray[1]=new SavingAccount( 112, 2000, 100);
		bankAccArray[2]=new CurrentAccount( 113, 3000, 200);
		
		try{
			bankAccArray[0].withDraw(10000);
		}
		catch(InsufficientBalanceException e){
			System.out.println(e);
		}
		
		//System.out.println("Total Cash in Bank: "+getTotalCashInBank(bankAccArray));
	}
}