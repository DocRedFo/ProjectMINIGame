public class Finish {
    public Finish(int progress, int karma){
        if (progress >= 2 && karma >= 40){
            System.out.println("Все Ваши действия привели к тому, что Evil Corporation была разорена.\n" +
                    "Одни люди избавились от кредитов и долгов, но другие лишились всех своих накоплений.");
        }
        else {
            System.out.println("Ничего не произошло. Вы слышали о задержании fsociety, но не особо придаёте этому значения.\n" +
                    "Вы всё так же продолжаете работать в этой компании...");
        }
    }
}