public class NumberThree extends Number {
    public NumberThree(){
        setFriendName("Mike");
        if (Gamer.getProgress() >= 3) {
            setFriendMassage("Здравствуйте, " + Gamer.getName() + "\n" +
                    "Так как Вы довольно успешно справляетесь с задниями, мы решили дать Вам более сложное и интерсное." +
                    "\nСейчас Вы его получите.");
            setQuestion("Запустите python и поднимите свой сайт, открыв файл index.html");
        }
        else {
            setFriendMassage("Здравствуйте, " + Gamer.getName() + "\n" +
                "Так как у Вас есть проблемы с выполнением заданий, мы дадим Вам более легкое." +
                    "\nСейчас Вы его получите");
            setQuestion("От Вас требуется запустить при помощи команды start программу python\n" +
                    "находящуюся в Documents и откройте файл index.html из Desktop, для запуска своего сайта");
        }
        setFDir(2);
        setFile("index.html");
        setMassage("Сайт открыт"/* + "theoneboringmancompany.rf.gd"*/);
        setAnswer("");
        setCheckTrueMassage("У Вас всё получилось, спасибо за потраченное время.\n" +
                "Досвидания");
        setCheckFailMassage("У Вас не получилось, попробуйте ещё");
        setPythonMassage("python запущен на порту 8080...");
        System.out.println("Спустя неделю");
        System.out.println("Сообщение от " + getFriendName() + "\n" +
                getFriendMassage());
        System.out.println(getQuestion());
        terminal();
        terminal();
        System.out.println("На самом деле Вы могли не запускать python)");
    }
}
