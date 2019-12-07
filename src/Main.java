import java.util.Scanner;

/*
Сюжет основан на сериале Mr Robot, от лица обычного системного администратора.
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите своё имя: ");
        String name = scanner.nextLine();
        boolean f = false;
        while (!f){
            if (name.equals("") || name.equals(" ")){
                f = false;
                System.out.print("\nОшибка!\nВведите имя: ");
                name = scanner.nextLine();
            }
            else {
                f = true;
            }
        }
        Gamer gamer = new Gamer(name);
        System.out.println("\nВаш уровень прогресса: " + Gamer.getProgress() + "\n" + "Ваш уровень кармы: " + Gamer.getKarma() +"\n" +
        "Расходуйте её разумно.\n" + "Для повышения Вашего уровня, " + Gamer.getName() + ", проходите задания." + "\n" + "\nУдачи, " + Gamer.getName());
            System.out.print("\nНажмите ENTER для продолжения");
                String enter = scanner.nextLine();
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                Welcome welcome = new Welcome();
                enter = scanner.nextLine();
                Number numberOne = new NumberOne();
                enter = scanner.nextLine();
                Number numberTwo = new NumberTwo();
                enter = scanner.nextLine();
                Number numberThree = new NumberThree();
                enter = scanner.nextLine();
                Finish finish = new Finish(Gamer.getProgress(), Gamer.getKarma());
                enter = scanner.nextLine();
                System.out.println("\n\n\n" + "\t\t\tThe End\n\t\t\tOR\n\t\t\tTo be continued" + "\n\n\n");
    }
}
