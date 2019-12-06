public class NumberThree extends Number {
    public NumberThree() {
        setSh("");
        setMassage("Большое спасибо за сотрудничество.\n" +
                "Jim");
        setQuestion("Кажется Вас надули.");
        setAnswer("");
        setOprog("mail.txt");
        setCheckm("");
        System.out.println("Прочтите новое сообщение");
        terminal();
        System.out.println(getQuestion());
        check();
    }
}
