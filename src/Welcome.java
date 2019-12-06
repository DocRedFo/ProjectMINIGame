import java.util.Scanner;

public class Welcome {
    private String Hello = "Добро пожаловать, " + Gamer.getName();
    private String Start = "Вы - самый известный интернет-детектив современности.\nВы любите только 2 вещи:\nСвою работу И Загадки" +
            "\nНедавно по городу прогремела новость о серии точечных кибератак, направленных на компании одного очень известного человека.\n"
            + "Этот человек обратился к Вам за помощью и очень надеялся, что Вы найдёте преступников.";
    private static String Login = "qwerty";
    public Welcome(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\t" + Hello + "\n\n");
        System.out.println(Start);
        System.out.println("Что ж, за работу, " + Gamer.getName());
        System.out.println("\n\t" + "Введите пароль:" + "\n(Подсказка: Вы не очень долго думали над паролем)");
        boolean f = false;
        int g = 0;
        while (!f) {
            String login = scanner.nextLine();
            if (login.equals(Welcome.Login)) {
                System.out.println("Вход прошел успешно!\nLogin successful!");
                for (int i = 0; i < 5; i++) {
                    if (i % 2 == 0) {
                        System.out.println("Login");
                        System.out.println("--------");
                    }
                    System.out.println("Booting");
                }
            f = true;
            }
            else {
                System.out.println("Введён неправильныйм пароль. Попробуйте ещё");
                g++;
                if (g >= 5) System.out.println("Password is qwerty");
            }
        }
    }
}
