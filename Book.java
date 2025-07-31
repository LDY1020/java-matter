package 생성자;

public class Book {
    String title;
    String author;
    int price;

    Book(String title , String author , int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void info(){
        System.out.println("제목:" + title + " 저자:" + author + " 가격:" + price);
    }
}
