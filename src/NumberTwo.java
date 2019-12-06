import java.util.Scanner;

public class NumberTwo extends Number {
    public NumberTwo(){
        Scanner scanner = new Scanner(System.in);
        setQuestion("\n\n\n"+
                "Прошло уже несколько дней, а от Jim нет ни слова..." +
                "\nМожет быть Вы ошиблись, " + Gamer.getName() + "\n" +
                "Хотя подождите..." +
                "\n\t\"Ещё одно не прочитанное сообщение\"" +
                "\nЗадание: Откройте новое сообщение");
        System.out.println(getQuestion());
        setOprog("mail.txt");
        setMassage("Я не советовал бы Вам пытаться нас поймать, мистер " + Gamer.getName() + ", так как это невозможно.\n" +
                "Мы не злодеи. Тот, на кого Вы работаете - ужасный человек. К сожалению вменяемых доказательств у нас нет,\n" +
                "НО Вы можете нам помочь получить их и распространить в СМИ.\n" +
                "Что скажите?");
        terminal();
        System.out.println("\n" + "Согласится (1) или Отказаться (0)");
        String s = scanner.nextLine();
        if (s.equals("1")){
            Gamer.setKarma(Gamer.getKarma() / 2);
            System.out.println("Вы согласились.\nВаша карма упала в два раза: " + Gamer.getKarma());
            System.out.println("По указаниям Jim Вы должны открыть файл mir на своём пк");
            setOprog("mir");
            setMassage("Большое спасибо за помощь. Надеюсь, что у нас поучится.\n" +
                    "Jim");
        }
        else {
            System.out.println("Вы не согласились.\nКак и сказал Jim, Вы не смогли его найти.\nСпустя год Вы забросили это дело.");
            System.exit(1);
        }
        terminal();
    }
}
