import java.util.Scanner;

public class Welcome {
    private static String Login = "qwerty";
    public Welcome(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\t" + "Добро пожаловать, " + Gamer.getName() + "\n\n");
        System.out.println("AdminFriend: Кратко введу Вас в курс дела, " + Gamer.getName() + ".\n" +
                "Мы наняли Вас на должность системного администратора в Evil Corporation. Надеемся, что Вы справитесь со своими задачами.");
        System.out.println("\nВойдите в свою учётную запись");
        System.out.println("\n" + "Введите пароль:" + "\n(Подсказка: Вы не очень долго думали над паролем)");
        boolean f = false;
        int g = 0;
        while (!f) {
            String login = scanner.nextLine();
            if (login.equals(Welcome.Login)) {
                if (g < 5) Gamer.setProgress(Gamer.getProgress() + 1);
                System.out.println("\nВход прошел успешно!");
                f = true;
            }
            else {
                System.out.println("Введён неправильныйм пароль. Попробуйте ещё");
                g++;
                if (g >= 5) System.out.println("Пароль: qwerty");
            }
        }
    }
}
