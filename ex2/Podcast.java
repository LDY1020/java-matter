package 다형성활용.ex2;

public class Podcast implements Media{
    @Override
    public void play() {
        System.out.println("재생 : 팟캐스트 ");
    }
}
