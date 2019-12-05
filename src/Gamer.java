public class Gamer {
    private String name;
    private int progress;
    private boolean play;

    public void setName(String name) {
        this.name = name;
    }

    public void setPlay(boolean play) {
        this.play = play;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }

    public int getProgress() {
        return progress;
    }

    public String getName() {
        return name;
    }

    public boolean isPlay() {
        return play;
    }

    public Gamer(String name){
        this.setName(name);
        this.setProgress(0);
        this.setPlay(false);
    }

}
