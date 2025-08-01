package construct;

public class MemberMain {
    public static void main(String[] args) {
        Member member1 = new Member("도윤", "VIP", 30000);
        member1.info();

        Member member2 = new Member("철수", "VIP", 40000);
        member2.info();

        Member member3 = new Member("유리", "일반", 30000);
        member3.info();

        Member member4 = new Member("훈이", "VIP", 30000);
        member4.info();

        Member[] members = {member1, member2, member3, member4};


        System.out.println("-----------------------------");

        int total = 0;
        total += member1.payment + member2.payment + member3.payment + member4.payment;
        System.out.println("총 결제 금액:" + total);

        System.out.println("-----------------------------");


        for (Member member : members) {
            if (member.membership == "VIP")//if (member.membership.equals("VIP")) {
                System.out.println("VIP 회원 목록:" + member.name);
            }

        }
    }
}

