package staticMatter;

public class StudentMain {
    public static void main(String[] args) {
        Student student1 = new Student("도윤", 70, 80);

        Student student2 = new Student("영진", 60, 70);

        Student student3 = new Student("철진", 50, 50);

        System.out.println("전체 학생 수 : " + Student.totalStudent);
        System.out.println("도윤의 총점 : " + student1.getTotalScore());
        System.out.println("영진의 총점 : " + student2.getTotalScore());
        System.out.println("철진의 총점 : " + student3.getTotalScore());

        Student[] students = {student1 , student2 , student3};

        double totalScore = 0;
        for (Student student : students) {
            totalScore += student.getTotalScore();
        }
        double avg = totalScore / students.length;
        System.out.println("평균 : " + avg);

    }
}
