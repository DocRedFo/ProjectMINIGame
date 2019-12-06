import java.util.Scanner;

public class NumberThree extends Number {
    public NumberThree() {
        Scanner scanner = new Scanner(System.in);
        setSh("Вам нужно самим решить, как ответить");
        setMassage("Благодарим за помощь. Но нужно сделать последний скачок для победы.\n" +
                "Запустите программу revolution\n" +
                "Ждём Ваших действий");
        setQuestion("Прочитайте и ответьте на сообщение");
        setOprog("mail");
        System.out.println(getQuestion());
        terminal();
        System.out.println("Ответьте Согласием (1) на продолжение или Отказом (0)");
        String s = scanner.nextLine();
        if (s.equals("1")){
            setOprog("revolution");
            setAnswer("");
            setMassage("\nВыполнение программы.......");
            Gamer.setProgress(Gamer.getProgress() + 1);
            Gamer.setKarma(Gamer.getKarma() + 12);
            System.out.println("\nAdminFriend: Кажется Ваши показатели изменились, " + Gamer.getName() +
                    "\nПрогресс: " + Gamer.getProgress() +
                    "\nКарма: " + Gamer.getKarma() + "\n\n");
        }
        else {
            System.out.println("\nВы отказались помочь в продолжении планов fsociety. Позже Вы предстали пред судом за шпионаж...");
            System.exit(0);
        }
        check();
    }
}
