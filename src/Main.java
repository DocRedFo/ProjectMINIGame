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
        Gamer gamer = new Gamer(scanner.nextLine());
        System.out.println("Ваш начальный уровень равен: " + gamer.getProgress() + "\n"
        + "Для повышения Вашего уровня, " + gamer.getName() + ", Вы должны пройти 3 задания." + "\n" +
        "Для победы в игре Вы должны пройти все задания и набрать максимальное количество баллов." + "\n" +
        "\tУдачи, " + gamer.getName());
        System.out.println("Нажмите ENTER для продолжения.");
        label: while (!gamer.isPlay()){
            if (scanner.nextLine().equals("")){
                System.out.println("Добро пожаловать, " + gamer.getName());
                System.out.println("\n\n\n\n\n\n\n\n");
                NumberOne numberOne = new NumberOne();
            }
            else {
                break label;
            }
        }
    }
}
