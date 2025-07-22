package 객체지향;

public class Movie {
    String name;
    String genre;
    double rating;

    void info(){
        System.out.println("제목:" + name + ", 장르:" + genre + ", 평점:" + rating);
    }
}
