package ClassMatter;

public class BookMain {
    public static void main(String[] args) {
        Book[] books = new Book[2];

        Book a = new Book();

        a.title = "자바의 정석";
        a.author = "남궁석";
        a.price = 30000;
        books[0] = a;


        Book b = new Book();

        b.title = "DoYoon의 코딩일기";
        b.author = "도윤";
        b.price = 18000;
        books[1] = b;

        for(Book book : books){
            System.out.println("제목:" + book.title + " 작가:" + book.author + " 가격:" + book.price);
        }


    }

}
