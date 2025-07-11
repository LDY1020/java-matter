package ClassMatter;

public class PersonMain {
    public static void main(String[] args) {
        Person introduce = new Person();

        introduce.name = "도윤";
        introduce.age = 27;

        System.out.println("안녕하세요 " + "제 이름은 " + introduce.name + "이고 " + "저의 나이는 " + introduce.age + "입니다" );
    }
}
