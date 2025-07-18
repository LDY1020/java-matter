package 참조형;

public class MemberMain {
    public static void main(String[] args) {
        Member[] member = new Member[3];

        member[0] = createMember("도윤" , 27 , "남자");
        member[1] = createMember("철수" , 20 , "남자");
        member[2] = createMember("유리" , 23 , "여자");

        printMembers(member);
        System.out.println("총 회원수 :" + getMemberCount(member));
    }

    static Member createMember(String name , int age , String gender){
        Member m = new Member();
        m.name = name;
        m.age = age;
        m.gender = gender;
        return m;
    }
    static void printMembers(Member[] members){
        for (Member member : members) {
            System.out.println("이름:" + member.name + " 나이:" + member.age + " 성별:" + member.gender);
        }
    }
    static int getMemberCount(Member[] members){
        return members.length;
    }
}
