import java.util.Scanner;

public class Welcome extends Number {
    private String about;
    private String StartGame;

    public String getAbout() {
        return about;
    }

    public String getStartGame() {
        return StartGame;
    }

    public void setStartGame(String startGame) {
        StartGame = startGame;
    }

    public void setAbout(String about) {
        this.about = about;
    }
    public Welcome(){
        Scanner scanner = new Scanner(System.in);
        setAbout("\tДобро пожаловать!" +
                "\nЭто игра — текстовый квест, в котором Вас приняли на работу, на неизвестную должность, в неизвестную компанию" +
                "\nЕдинственное, что Вы знаете, так это то, что Вам надо выполнять появляющиеся на Вашем компьютере задачи" + "\n");
        setStartGame("Что ж, давайте начинать" +
                "\nДля начала введите своё имя: ");
        System.out.println(getAbout());
        String enter;
        System.out.print(getStartGame());
        boolean f = false;
        while (!f){
            enter = scanner.nextLine();
            if (enter.equals("") || enter.equals(" ") || enter.equals("   ") || enter.equals("  ")){
                System.out.println();
                System.out.println("Неверное имя, попробуйте снова");
                System.out.print("Введите имя: ");
            }
            else {
                Gamer.setName(enter);
                System.out.println();
                System.out.println("Добро пожаловать, " + Gamer.getName());
                f = true;
            }
        }
        begin();
        System.out.println("Если Вы хотите быть хорошим работником, то лучше начать сейчас.\n" +
                "Смените свой логин и пароль.");
        System.out.println("Хотите сменить логин и пароль?\n" +
                "Да (1) или Нет (0)");
        while (f) {
            enter = scanner.nextLine();
            if (enter.equals("1")) {
                PasswordsAndLogin();
                Gamer.setProgress(Gamer.getProgress() + 1);
                f = false;
            } else if (enter.equals("0")) {
                System.out.println("Ok");
                f = false;
            } else {
                System.out.println("Неизвестная команда, попробуйте снова");
            }
        }
    }
}
