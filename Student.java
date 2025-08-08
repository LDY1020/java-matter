package staticMatter;

public class Student {
    public String name;
    public int kor;
    public int eng;
    public static int totalStudent;

    Student(String name, int kor, int eng) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        totalStudent++;
    }

    public int getTotalScore() {
        return kor + eng;
    }

}


