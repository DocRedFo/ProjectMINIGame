import java.util.Scanner;

public class NumberOne extends Number {
    public NumberOne(){
        setSh("Введите " + Gamer.getName());
        setAnswer(Gamer.getName());
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        setQuestion("Прочитайте сообщение. Воспользуйтесь командой help");
        System.out.println(getQuestion());
        setOprog("mail");
        setMassage("Здравствуйте." + "\nНам нужно, чтобы Вы сообщили своё имя, как сотрудник E Corp.");
        terminal();
        setCheckm("Спасибо за информацию, " + Gamer.getName());
        check();
        System.out.println("Вам кажется довольно странным, что Ваш работодатель не знает вашего имени...");
    }
}
