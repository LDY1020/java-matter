package access;

public class Hero {
    public String name;
    public String job;
    private int level;
    private int power;


    Hero(String name, String job, int level, int power) {
        this.name = name;
        this.job = job;
        this.level = level;
        this.power = power;
    }
    void info() {
        System.out.println("이름:" + name + " 직업:" + job + " 레벨:" + level + " 전투력:" + power);
    }
    public void isStrong() {
        if(level >= 50 && power >= 100){
            System.out.println("강한 영웅");
        }
        else{
            System.out.println("약한 영웅");
        }
    }
}
