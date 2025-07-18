package 참조형;

import java.io.OptionalDataException;

public class BookMain {
    public static void main(String[] args) {
        Book[] b = new Book[3];

        b[0] = new Book();
        b[0].title = "자바의 정석";
        b[0].price = 20000;

        b[1] = new Book();
        b[1].title = "수학의 정석";
        b[1].price = 15000;

        b[2] = new Book();
        b[2].title = "이것이자바다";
        b[2].price = 30000;


        BookPrint(b);
    }

    static void BookPrint(Book[] books) {
        for (Book book : books) {
            System.out.println("제목:" + book.title + " 가격:" + book.price);
        }
    }
}
