package 생성자;

public class BookMain {
    public static void main(String[] args) {
        Book book1 = new Book("자바의 정석" , "남궁석" , 35000);
        book1.info();

        Book book2 = new Book("수학의 정석" , "kim" , 31000);
        book2.info();

        Book book3 = new Book("국어의 정석" , "jim" , 29000);
        book3.info();


        Book[] books = {book1 , book2 , book3};

        System.out.println("-----------------------");


        if(book1.price > 30000){
            System.out.println(book1.title);
        }
        if(book2.price > 30000){
            System.out.println(book2.title);
        }
        if(book3.price > 30000){
            System.out.println(book3.title);
        }


        }
    }

