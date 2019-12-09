public class NumberOne extends Number {
    public NumberOne(){
        System.out.println("\nПрошло уже две недели Вашей \"работы\", но Вы еще не поучили ни одного зада...\n");
        System.out.println("*У Вас одно новое уведомление*\n");
        setFriendName("Nick");
        setFriendMassage("Привет, " + Gamer.getName() + "\n" +
                "Спишу тебе сообщить твоё первое задание. Тебе надо разобраться с управлением твоим компьютером, представляешь?\n" +
                "Мне кажется, что наш работодатель совершенно не знает кто на него работает.\n" +
                "Ладно, удачи");
        setQuestion("Задание: разберитесь с управлением, найдите файл helpFORyou и откройте его");
        System.out.println("Сообщение от " + getFriendName() + "\n" +
                getFriendMassage());
        System.out.println("\n\t" + getQuestion() + "\n");
        setFile("helpFORyou");
        setFDir(1);
        setMassage("You can take flag: Qwerty");
        setAnswer("Qwerty");
        terminal();
        setCheckTrueMassage("Отлично сработано, " + Gamer.getName());
        setCheckFailMassage("Попробуйте ещё раз");
        check();
        Gamer.setProgress(Gamer.getProgress() + 2);
    }
}
