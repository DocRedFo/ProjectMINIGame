import java.util.Scanner;

public abstract class Number {
    //Команды
    private String help = "help";
    private String ls = "ls";
    private String cd = "cd";
    private String open = "open";
        //Запуск и остановка Служб
        private String start = "start";
        private String stop = "stop";
    //Приложения
    private String mail = "mail";
        private String python = "python";
    //Папки
    private String Downloads = "Downloads"; //1
    private String Desktop = "Desktop"; //2
    private String Documents = "Documents"; //3
    private String Music = "Music"; //4
    //Название Файла
    private String file = "";
    //Сообщение в Файле
    private String massage = "";
    //Сообщение друга и его имя
    private String FriendMassage = "";
    private String FriendName = "";
    //Сообщение на mail
    private String mailMassage = "";
    //Вопрос и ответ на него
    private String question = "";
    private String answer = "";
    //Сообщение при удаче или ошибке
    private String CheckTrueMassage = "";
    private String CheckFailMassage = "";
    //Отображение ls
    private int dir = 0;
    //Нахождение file командой ls
    private int FDir = 0;

    public int getDir() {
        return dir;
    }

    public String getMailMassage() {
        return mailMassage;
    }

    public void setMailMassage(String mailMassage) {
        this.mailMassage = mailMassage;
    }

    public int getFDir() {
        return FDir;
    }

    public void setDir(int dir) {
        this.dir = dir;
    }

    public void setFDir(int FDir) {
        this.FDir = FDir;
    }

    public String getMail() {
        return mail;
    }

    public void setMassage(String massage) {
        this.massage = massage;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public void setFriendMassage(String friendMassage) {
        FriendMassage = friendMassage;
    }

    public void setCheckFailMassage(String checkFailMassage) {
        CheckFailMassage = checkFailMassage;
    }

    public void setCheckTrueMassage(String checkTrueMassage) {
        CheckTrueMassage = checkTrueMassage;
    }

    public void setFriendName(String friendName) {
        FriendName = friendName;
    }

    public String getMassage() {
        return massage;
    }

    public String getAnswer() {
        return answer;
    }

    public String getCheckFailMassage() {
        return CheckFailMassage;
    }

    public String getCheckTrueMassage() {
        return CheckTrueMassage;
    }

    public String getFriendMassage() {
        return FriendMassage;
    }

    public String getFriendName() {
        return FriendName;
    }

    public String getQuestion() {
        return question;
    }

    public String getOpen() {
        return open;
    }

    public String getLs() {
        return ls;
    }

    public String getCd() {
        return cd;
    }

    public String getHelp() {
        return help;
    }

    public String getDesktop() {
        return Desktop;
    }

    public String getPython() {
        return python;
    }

    public String getDownloads() {
        return Downloads;
    }

    public String getDocuments() {
        return Documents;
    }

    public String getStart() {
        return start;
    }

    public String getStop() {
        return stop;
    }

    public String getFile() {
        return file;
    }

    public String getMusic() {
        return Music;
    }

    public void setFile(String file) {
        this.file = file;
    }
    //Обработчик команд в "терминале"
    public void terminal(){
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag){
            String string = scanner.nextLine();
            if (string.equals(getHelp())){
                System.out.println("\nСписок доступных команд:" +
                        "\nhelp - вызов помощи" +
                        "\nls - обзор папки" +
                        "\ncd [аргумент] - перемещение между папками" +
                        "\nopen [аргумент] - открытие файлов или приложений" +
                        "\nstart [аргумент] - запуск служб или процессов" +
                        "\nstop [аргумент] - остановка служб или процессов\n");
            }
            else if (string.equals(getLs())){
                if (getDir() == 0) {
                    if (getFDir() == 0) System.out.println("\n" + getDesktop() + "\n" + getDownloads() + "\n" + getDocuments() + "\n" + getMusic() + "\n" + getFile() + "\n");
                    else System.out.println("\n" + getDesktop() + "\n" + getDownloads() + "\n" + getDocuments() + "\n" + getMusic() + "\n");
                }
                else if (getDir() == 1){
                    if (getFDir() == 1) System.out.println("\npicture.mp8" + "\nvideo.jpn" + "\nnitrospeed.game\n" + getFile() + "\n");
                    else System.out.println("\npicture.mp8" + "\nvideo.jpn" + "\nnitrospeed.game\n");
                }
                else if (getDir() == 2){
                    if (getFDir() == 2) System.out.println();
                    else System.out.println();
                }
                else if (getDir() == 3){
                    if (getFDir() == 3) System.out.println();
                    else System.out.println();
                }
                else if (getDir() == 4){
                    if (getFDir() == 4) System.out.println();
                    else System.out.println();
                }
                else System.out.println("Непредвиденная ошибка!");
            }
            else if (string.equals(getCd())){
                setDir(0);
            }
            else if (string.equals(getCd() + " " + getDesktop())){

            }
            else if (string.equals(getCd() + " " + getDownloads())){

            }
            else if (string.equals(getCd() + " " + getDocuments())){

            }
            else if (string.equals(getCd() + " " + getMusic())){

            }
            else if (string.equals(getOpen())){

            }
            else if (string.charAt(6) == 'i'){
                System.out.print("Ошибка!" +
                        "\nНеизвестный формат");
            }
            else if (string.equals(getOpen() + " " + getFile())){
                System.out.println("Ваш ответ: " + getAnswer());
                flag = false;
            }
            else if (string.equals(getOpen() + " " + getMail())){

            }
            else if (string.equals(getStart())){

            }
            else if (string.equals(getStart() + " " + getPython())){

            }
            else if (string.equals(getStop())){

            }
            else if (string.equals(getStop() + " " + getPython())){

            }
            else if (string.equals(getPython())){

            }
            else {
                System.out.println("Неизвестная команда\nВоспользуйтесь командой help");
            }
        }
    }
    //Проверка правильности ответа
    public void check(){
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag){
            System.out.print("Введите ответ: ");
            String string = scanner.nextLine();
            if (string.equals(getAnswer())){
                System.out.println(getCheckTrueMassage());
                flag = false;
            }
            else {
                System.out.println(getCheckFailMassage());
            }
        }
    }
    //Начало, Ввод пароля для входа и знакомство с механикой игры
    public void begin(){
        System.out.println("Все настройки находятся в изначальном состоянии, в том числе логины и пароли");
        Scanner scanner = new Scanner(System.in);
        String string;
        boolean f = true;
        while (f) {
            System.out.print("Введите логин: ");
            string = scanner.nextLine();
            if (string.equals("root") || string.equals("admin")) {
                Gamer.setLogin(string);
                System.out.println();
                f = false;
            } else {
                System.out.println("Неверный логин или пароль. Попробуйте снова");
            }
        }
        while (!f) {
            System.out.print("Введите пароль: ");
            string = scanner.nextLine();
            if (string.equals("root") || string.equals("admin") || string.equals("qwerty") || string.equals("123456")){
                Gamer.setPassword(string);
                System.out.println();
                f = true;
            }
            else {
                System.out.println("Неверный логин или пароль. Попробуйте снова");
            }
        }
    }
    //Смена Логина и Пароля
    public void PasswordsAndLogin(){
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        String string;
        while (flag) {
            System.out.print("Введите новый логин: ");
            string = scanner.nextLine();
            if (string.equals(Gamer.getLogin())){
                System.out.println("Логины совпадают!");
            }
            else {
                Gamer.setLogin(string);
                flag = false;
            }
        }
        while (!flag){
            System.out.print("Введите новый пароль: ");
            string = scanner.nextLine();
            if (string.equals(Gamer.getPassword())){
                System.out.println("Пароли совпадают!");
            }
            else if (string.equals(Gamer.getLogin())){
                System.out.println("Пароль и логин сопадают!");
            }
            else {
                Gamer.setPassword(string);
                while (!flag) {
                    System.out.print("Подтвердите пароль: ");
                    string = scanner.nextLine();
                    if (string.equals(Gamer.getPassword())) {
                        System.out.println("Поздравляем со сменой логина и пароля");
                        flag = true;
                    }
                    else {
                        System.out.println("Пароли не совпадают поробуйте снова");
                    }
                }
            }
        }
    }
    //Концовка
    public void finish(){
        if (Gamer.getProgress() > 5){
            System.out.println("Вы справились с заднаниями, " + Gamer.getName());
        }
        else {
            System.out.println("Кажется, что у Вас что-то не получилось, " + Gamer.getName());
        }
    }
}
