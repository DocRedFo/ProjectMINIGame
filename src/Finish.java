public class Finish extends Number {
    private String end = "";

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }
    public Finish(){
        finish();
        System.out.println("Ваш счёт, " + Gamer.getName());
        System.out.println("Уровень прогресса: " + Gamer.getProgress());
        System.out.println("\n\n\n" + "\t\t\tThe End" + "\n\n\n");
    }
}