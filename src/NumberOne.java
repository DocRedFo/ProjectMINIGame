import java.util.Scanner;

public class NumberOne extends Number {
    private String wow = "Письмо похоже на одно из тех, что должно лежать в корзине и не беспокоить.\n" +
            "Но вас беспокоит непонятная фраза в конце письма." +
            "\nЗачем в рекламной рассылке добавлять какой-то пароль?" +
            "\n\tВы решаете разобраться в этом вопросе и для этого идёте google'it" +
            "\n\n\tЗадание: Решите загадку и введите ответ";

    public NumberOne(){
        setSh("Кажется вы воспользовались подсказкой." +
                "\nПопробуйте http://www.spammimic.com/");
        setAnswer("Jim");
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        setQuestion("\t12.12.12\n" +
                "Неделю назад Вам пришло странное письмо на почту.\n" +
                "Тогда Вы посчитали его спамом, но сейчас Вы думаете иначе.\n" +
                "\n\tЗадание: Откройте письмо." +
                "\n(Для помощи введите help)\n");
        System.out.println(getQuestion());
        setOprog("mail.txt");
        setMassage("Dear Internet user , You made the right decision when \\n\" +\n" +
                        "                        \"you signed up for our directory ! This is a one time \\n\" +\n" +
                        "                        \"mailing there is no need to request removal if you \\n\" +\n" +
                        "                        \"won't want any more ! This mail is being sent in compliance \\n\" +\n" +
                        "                        \"with Senate bill 2416 ; Title 2 , Section 302 . THIS \\n\" +\n" +
                        "                        \"IS NOT A GET RICH SCHEME . Why work for somebody else \\n\" +\n" +
                        "                        \"when you can become rich within 59 WEEKS ! Have you \\n\" +\n" +
                        "                        \"ever noticed how many people you know are on the Internet \\n\" +\n" +
                        "                        \"plus most everyone has a cellphone . Well, now is your \\n\" +\n" +
                        "                        \"chance to capitalize on this . We will help you decrease \\n\" +\n" +
                        "                        \"perceived waiting time by 120% and increase customer \\n\" +\n" +
                        "                        \"response by 100% . You are guaranteed to succeed because \\n\" +\n" +
                        "                        \"we take all the risk ! But don't believe us ! Prof \\n\" +\n" +
                        "                        \"Jones who resides in Connecticut tried us and says \\n\" +\n" +
                        "                        \"\\\"My only problem now is where to park all my cars\\\" \\n\" +\n" +
                        "                        \". We are licensed to operate in all states ! We beseech \\n\" +\n" +
                        "                        \"you - act now ! Sign up a friend and you get half off \\n\" +\n" +
                        "                        \". Best regards ! Dear Sir or Madam , Thank-you for \\n\" +\n" +
                        "                        \"your interest in our letter ! If you are not interested \\n\" +\n" +
                        "                        \"in our publications and wish to be removed from our \\n\" +\n" +
                        "                        \"lists, simply do NOT respond and ignore this mail . \\n\" +\n" +
                        "                        \"This mail is being sent in compliance with Senate bill \\n\" +\n" +
                        "                        \"2216 ; Title 6 , Section 306 . This is not a get rich \\n\" +\n" +
                        "                        \"scheme . Why work for somebody else when you can become \\n\" +\n" +
                        "                        \"rich as few as 29 days ! Have you ever noticed most \\n\" +\n" +
                        "                        \"everyone has a cellphone and the baby boomers are more \\n\" +\n" +
                        "                        \"demanding than their parents ! Well, now is your chance \\n\" +\n" +
                        "                        \"to capitalize on this . We will help you process your \\n\" +\n" +
                        "                        \"orders within seconds and deliver goods right to the \\n\" +\n" +
                        "                        \"customer's doorstep . You can begin at absolutely no \\n\" +\n" +
                        "                        \"cost to you . But don't believe us . Mr Ames of Mississippi \\n\" +\n" +
                        "                        \"tried us and says \\\"I've been poor and I've been rich \\n\" +\n" +
                        "                        \"- rich is better\\\" ! We assure you that we operate within \\n\" +\n" +
                        "                        \"all applicable laws . We BESEECH you - act now ! Sign \\n\" +\n" +
                        "                        \"up a friend and you'll get a discount of 40% . Warmest \\n\" +\n" +
                        "                        \"regards ! \""
        +"\n\n\n Pass is A1Z26");
        terminal();

        System.out.println(wow);
        setCheckm("Кажется преступники решили оставить нам подсказки.\n" +
                "Хотя какие преступники хотят чтобы их поймали?\n\n");
        check();
    }
}
