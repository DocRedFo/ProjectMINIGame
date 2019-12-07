import java.util.Scanner;

public class NumberOne extends Number {
    @Override
    public void check(){
        Scanner scanner = new Scanner(System.in);
            String AnsweR = scanner.nextLine();
            System.out.println("\nВыполнено");
            System.out.println("Спасибо за информацию, " + AnsweR + "\n\n");
            Gamer.n = AnsweR;
            Gamer.setProgress(Gamer.getProgress()+1);
    }
    public NumberOne(){
        setAnswer(Gamer.getName());
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        setQuestion("Прочитайте сообщение. Воспользуйтесь командой help");
        System.out.println(getQuestion());
        setOprog("mail");
        setMassage("Здравствуйте." + "\nНам нужно, чтобы Вы сообщили своё имя, как сотрудник E Corp.");
        terminal();
        check();
        System.out.println("Вам кажется довольно странным, что Ваш работодатель не знает вашего имени...");
    }
}
