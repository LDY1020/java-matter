package construct;

public class Member {
    String name;
    String membership;
    int payment;

    Member(String name , String membership , int payment){
        this.name = name;
        this.membership = membership;
        this.payment = payment;
        }
        void info(){
            System.out.println("이름:" + name + " 등급:" + membership + " 결제금액:" + payment);
        }
    }

