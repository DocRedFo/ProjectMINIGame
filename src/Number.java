import java.util.Scanner;

public abstract class Number {
    private String question;
    private String answer;
    private String help = "help";
    private String ls = "ls";
    private String open = "open";
    private String massage = "";
    private String sh = "";
    private String checkm = "";
    private String oprog = "";

    public String getOprog() {
        return oprog;
    }

    public void setOprog(String oprog) {
        this.oprog = oprog;
    }

    public String getCheckm() {
        return checkm;
    }

    public void setCheckm(String checkm) {
        this.checkm = checkm;
    }

    public void check(){
        Scanner scanner = new Scanner(System.in);
        boolean f = true;
        while (f) {
            String AnsweR = scanner.nextLine();
            if (AnsweR.equals(getAnswer())) {
                System.out.println("\nВыполнено");
                System.out.println(getCheckm());
                Gamer.setProgress(Gamer.getProgress()+1);
                f = false;
            }
            else if (AnsweR.equals("sh")){
                sh();
            }
            else {
                System.out.println("\nОшибка. Вы можете воспользоваться подсказкой через команду sh");
                f = true;
            }
        }
    }

    public String getSh() {
        return sh;
    }

    public void setSh(String sh) {
        this.sh = sh;
    }

    public void sh(){
        System.out.println(getSh());
        Gamer.setProgress(Gamer.getProgress() - 1);
    }

    public String getMassage() {
        return massage;
    }

    public void setMassage(String massage) {
        this.massage = massage;
    }

    public String getHelp() {
        return help;
    }

    public void terminal() {
        Scanner scanner = new Scanner(System.in);
        boolean f = false;
        while (!f) {
            String console = scanner.nextLine();
            if (console.equals(getHelp())) {
                showHelp();
                f = false;
            } else if (console.equals(getLs())) {
                System.out.println("\n" + getOprog());
                System.out.println("");
                f = false;
            } else if (console.equals(getOpen())) {
                System.out.println("\nОшибка!\nВведите аргумент\n");
                f = false;
            } else if (console.equals(getOpen() + " " + getOprog())) {
                System.out.println("\n\n\n");
                System.out.println(getMassage());
                System.out.println("");
                f = true;
            } else {
                System.out.println("\nНеизвестная команда\nВоспользуйтесь help для помощи");
                f = false;
            }
        }
    }

    public String getLs() {
        return ls;
    }

    public String getOpen() {
        return open;
    }

    public void showHelp(){
        System.out.println("\nСписок доступных команд:");
        System.out.println("help - Вызов помощи");
        System.out.println("ls - обзор каталога");
        System.out.println("open - открыть файл\n");
    }

    public String getAnswer() {
        return answer;
    }

    public String getQuestion() {
        return question;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public void setQuestion(String question) {
        this.question = question;
    }
}
