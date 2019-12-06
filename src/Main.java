import java.util.Scanner;

/*
Игра в виде текстового квеста.
По сюжету игры Вы являетесь самым известным интернет-детективом современности.
Вам предстоит решить несколько головоломок для того, чтобы распутать это сложное дело.
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите своё имя:");
        String name = scanner.nextLine();
        boolean f = false;
        while (!f){
            if (name.equals("") || name.equals(" ")){
                f = false;
                System.out.println("Ошибка!\nВведите имя:");
                name = scanner.nextLine();
            }
            else {
                f = true;
            }
        }
        Gamer gamer = new Gamer(name);
        System.out.println("Ваш начальный уровень равен: " + Gamer.getProgress() + "\n" + "Ваш уровень кармы: " + Gamer.getKarma() +"\n" +
        "Расходуйте её разумно.\n" + "Для повышения Вашего уровня, " + Gamer.getName() + ", Вы должны пройти 3 задания." + "\n" +
        "Для победы в игре Вы должны пройти все задания и набрать максимальное количество баллов." + "\n" +
        "\tУдачи, " + Gamer.getName());
        boolean flag = false;
        while (!flag){
            System.out.println("Нажмите ENTER для продолжения.");
            if (scanner.nextLine().equals("")){
                flag = true;
                System.out.println(
"\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
                );
                Welcome welcome = new Welcome();
                String enter = scanner.nextLine();
                Number numberOne = new NumberOne();
                enter = scanner.nextLine();
                Number numberTwo = new NumberTwo();
                enter = scanner.nextLine();
                Number numberThree = new NumberThree();

            }
            else {
                flag = false;
            }
        }
    }
}
