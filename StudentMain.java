package ClassMatter;

public class StudentMain {
    public static void main(String[] args) {
        Student[] students = new Student[3];

        Student s1 = new Student();

        s1.name = "도윤";
        s1.kor = 90;
        s1.eng = 85;
        s1.math = 95;
        students[0] = s1;

        Student s2 = new Student();

        s2.name = "철수";
        s2.kor = 80;
        s2.eng = 70;
        s2.math = 75;
        students[1] = s2;

        Student s3 = new Student();

        s3.name = "영희";
        s3.kor = 100;
        s3.eng = 100;
        s3.math = 100;
        students[2] = s3;


       for(Student student : students){
           double avg = (student.kor + student.eng + student.math) / 3.0;
           System.out.println("이름:" + student.name + " 평균:" + avg);

       }



    }
}
