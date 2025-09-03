package CoadingMatter.ex3;

public class Member {

   private String name;
   private Exercise exercise;

    Member(String name , Exercise exercise){
        this.name = name;
        this.exercise = exercise;
    }

    public void workout(){
        System.out.println(name + " 님이 운동을 시작했습니다");
        exercise.start(); // 다형성 호출

        if(exercise instanceof WeightTraining){
            System.out.println("보조자 필요 여부 확인");
        }
    }
}
