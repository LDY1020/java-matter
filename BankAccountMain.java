package access.access3;

public class BankAccountMain {

    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount("이도윤" , 30000);
        BankAccount bankAccount2 = new BankAccount("김철수" , 20000);


        bankAccount1.deposit(3000);
        bankAccount1.withdraw(5000);
        bankAccount1.printInfo();

        bankAccount2.deposit(5000);
        bankAccount2.withdraw(7000);
        bankAccount2.printInfo();

       int totalbalance = 0;
       totalbalance += bankAccount1.printInfo() + bankAccount2.printInfo();

        System.out.println("총 잔액 : " + totalbalance);
    }
}
