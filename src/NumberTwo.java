import java.util.Scanner;

public class NumberTwo extends Number {
    public NumberTwo(){
        Scanner scanner = new Scanner(System.in);
        setQuestion("Прочитайте сообщение");
        System.out.println(getQuestion());
        setOprog("mail");
        setMassage("Приветствуем Вас, " + Gamer.getName() + "\n" +
                "Мы представляем интересы общества и в том числе Ваши.\n" +
                "Мы - fsociety. Мы знаем, что Вы работаете на Evil Corp и предлагаем Вам помочь нам.");
        terminal();
        System.out.println("\nСогласится (1) или Отказаться (0)");
        String s = scanner.nextLine();
        if (s.equals("1")){
            setOprog("mir");
            setMassage("\nПрограмма запущена" +
                    "\nСканирование и Отправка данных.......");
            Gamer.setKarma(Gamer.getKarma() / 2);
            Gamer.setProgress(Gamer.getProgress() + 2);
            System.out.println("Спасибо, что согласились. Вы поможете всем людям этой страны. Теперь Вам надо запустить программу mir");
            System.out.println("\n\nAdminFriend: Кажется Ваша карма упала до " + Gamer.getKarma());
        }
        else {
            System.out.println("Вы отказались помочь неизвестной Вам группировке хакеров. Вы продолжили свою работу на компанию.");
            System.exit(0);
        }
        terminal();
    }
}
