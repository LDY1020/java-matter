package static1;

public class AccountMain {

	public static void main(String[] args) {
		BankAccount bank1 = new BankAccount("도윤" , 30000);
		
		BankAccount bank2 = new BankAccount("철수" , 20000);
		
		
		System.out.println("입금 후 금액 : " + bank1.deposit(3000));
		bank1.withdraw(3000);
		System.out.println("출금 후  금액 : " + bank1.getbalance());
		
		
		
		System.out.println("입금 후 금액 : " + bank2.deposit(5000));
		bank2.withdraw(4000);
		System.out.println("출금 후 금액 : " + bank2.getbalance());
	
		
		
		BankAccount.printTotalAccounts();

	}

}
