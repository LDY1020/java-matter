package static1;

public class BankAccount {
	String owner; //주인
	int balance; //잔액
	static int totalAccounts; //전체 계좌수

	

	
	BankAccount(String owner , int balance){
		this.owner = owner;
		this.balance = balance;
		totalAccounts++;
	}
	
	public int deposit(int amount) {
		balance += amount;
		return balance;
	}
	
	public void withdraw(int amount) {
		if(amount > balance) {
			System.out.println("잔액 부족");
		}else {
			balance -= amount;
			System.out.println(amount + "원 출금 완료");
		}
		
	}
	
	public int getbalance() {
		return balance;
	}
	
	public static void printTotalAccounts() {
		System.out.println("전체 계좌 수 : " + totalAccounts);
	}


}
