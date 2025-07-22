package 객체지향;

public class MoiveMain {
    public static void main(String[] args) {
        Movie[] m = new Movie[3];

        m[0] = new Movie();
        m[0].name = "터미네이터";
        m[0].genre = "공포";
        m[0].rating = 9.1;
        m[0].info();

        m[1] = new Movie();
        m[1].name = "컨저링";
        m[1].genre = "공포";
        m[1].rating = 7.1;
        m[1].info();

        m[2] = new Movie();
        m[2].name = "귀멸의칼날";
        m[2].genre = "애니메이션";
        m[2].rating = 9.3;
        m[2].info();


        for(int i = 0; i < m.length; i++){
            if(m[i].rating >= 8.0){
                System.out.println("평점이 높은 영화:" + m[i].name);
            }
        }

    }
}
