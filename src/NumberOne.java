public class NumberOne extends Number {
    public NumberOne(){
        System.out.println("\t12.12.12" +
                "\nПрошло уже две недели Вашей \"работы\", но Вы еще не поучили ни одного зада...");
        System.out.println("\n*У Вас одно новое уведомление*");
        System.out.println("На экране появляется Ваше первое задание: ");
        setQuestion("Задание: прочитать сообщение");
        System.out.println("\n\t" + getQuestion());
        System.out.println("\nВы немного в замешательстве, но думаю команда help поможет Вам");
    }
}
