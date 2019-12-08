import java.util.Scanner;
/*
Полностью переписанная игра Version 0.9
 */
public class Main {
    public static void main(String[] args) {
        //Для остановки повествования
        Scanner scanner = new Scanner(System.in);
        String enter;
        //Начало игры
        Number welcome = new Welcome();
        enter = scanner.nextLine();
        //Задания
        Number numberOne = new NumberOne();
        enter = scanner.nextLine();
        Number numberTwo = new NumberTwo();
        enter = scanner.nextLine();
        Number numberThree = new NumberThree();
        enter = scanner.nextLine();
        //Конец
        Number finish = new Finish();
        enter = scanner.nextLine();
    }
}
