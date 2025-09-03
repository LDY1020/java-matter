package CoadingMatter.ex3;

public class ExerciseMain {
    public static void main(String[] args) {
        Member[] members = new Member[3];

        members[0] = new Member("도윤", new WeightTraining());
        members[1] = new Member("철수" , new Cardio());
        members[2] = new Member("유리" , new WeightTraining());

        for (Member member : members) {
            member.workout();

        }

    }
}
