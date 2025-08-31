package 다형성활용.ex2;

public class Song implements Media{
    @Override
    public void play() {
        System.out.println("재생 : 노래 "  );
    }
}
