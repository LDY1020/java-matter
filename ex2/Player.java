package 다형성활용.ex2;

public class Player {

    private Media media;

    public void setMedia(Media media){
        this.media = media;
        System.out.println("노래 시작 : " + media);
    }

    public void playOne(){
        media.play();
    }

    public void playTwice(){
        media.play();
        media.play();
    }
}
