package access.access3;

public class BankAccount {

    public String owner;
    public int balance = 0;

    BankAccount(String owner , int balance){
        this.owner = owner;
        this.balance = balance;
    }


    public int deposit(int amount){
        balance += amount;
        return balance;
    }

    public int withdraw(int amount){
        if(balance < amount){
            System.out.println("잔액이 부족합니다");
        }
       else if(balance >= amount){
            balance -= amount;
            System.out.println("현재 잔액 : " + balance);
        }
       return balance;
    }

    public int printInfo(){
        System.out.println("예금주 : " + owner + ", 잔액 :" + balance);
        return balance;
    }
}
