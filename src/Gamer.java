public class Gamer {
    private static String name;
    private static int progress;
    private static int karma;

    public static void setKarma(int karma) {
        Gamer.karma = karma;
    }

    public static int getKarma() {
        return karma;
    }

    public static void setName(String name) {
        Gamer.name = name;
    }



    public static void setProgress(int progress) {
        Gamer.progress = progress;
    }

    public static int getProgress() {
        return progress;
    }

    public static String getName() {
        return name;
    }



    public Gamer(String name){
        setName(name);
        setProgress(0);
        setKarma(100);
    }

}
