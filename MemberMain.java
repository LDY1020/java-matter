package 객체지향;

public class MemberMain{
    public static void main(String[] args) {
        Member[] m = new Member[3];

        m[0] = new Member();
        m[0].name = "이도윤";
        m[0].age = 27;
        m[0].registration = 3;
        m[0].info();

        m[1] = new Member();
        m[1].name = "홍길동";
        m[1].age = 24;
        m[1].registration = 2;
        m[1].info();

        m[2] = new Member();
        m[2].name = "이순신";
        m[2].age = 23;
        m[2].registration = 1;
        m[2].info();

        for(int i = 0 ; i < 3; i++){
            if(m[i].registration >= 3){
                System.out.println("등록된 사람:" + m[i].name);
            }
        }

    }
}
