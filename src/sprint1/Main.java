package sprint1;

import java.util.Random;

class Main {

    public static void main(String[] args) {
        executeWorkingDay();
    }

    private static void executeWorkingDay() {
        System.out.println("Время 11.00");

        // опять этот надоедливый будильник
        alarmClock();

        // нам срочно нужен кофе
        System.out.println("Пойти на кухню");
        kettleRun();
        System.out.println("Взять кофе и включить ноутбук");
        System.out.println("Посмотреть мемы про менеджеров за кружкой кофе"); // да, куда же без мемов?
        watchMemes();
        // О, на часах уже полдень, пора бы начать работать.
        int time = 12;

        // поработаем-ка мы до 8 вечера
        int time1 = doWork(time);

        System.out.println("Пора бы поиграть в Playstation");
        playPC(time1);
        System.out.println("Кажется, пора посмотреть фильм и пойти спать");
        watchMovie();
        System.out.println("Ну вот, пора спать :(");
    }

    public static void alarmClock() {
        while (true) {
            System.out.println("Будильник: БЗЗЗЗЗЗЗЫЫЫЫЫЫЫНЬ!");
            if (isProgrammerWakeUp()) {
                break;
            }
        }
    }

    public static void kettleRun() {
        if (isKettleEmpty()) {
            System.out.println("Налить воды в чайник");
        }
        System.out.println("Включить чайник");

        for (int i = 4; i >= 0; i--) {
            switch (i) {
                case 0:
                    System.out.println("Вода закипела");
                    break;
                case 1:
                    System.out.println("Вода закипит через минуту");
                    break;
                default:
                    System.out.println("Вода закипит через " + i + " минуты");
                    break;
            }
        }
        System.out.println("Приготовить кофе");
    }

    public static void watchMemes() {
        for (int i = 5; i >= 0; i--) {
            if (i == 0) {
                System.out.println("Кажется, пора работать");
            } else {
                System.out.println("О_о, ещё мемчик");
            }
        }
    }

    public static int doWork(int time){
        while (time <= 20) {
            System.out.println("Писать код... Клац, клац...");
            time++;

            // не плохо бы приготовить ещё чашку кофе
            if (time % 3 == 0) {
                kettleRun();
                System.out.println("Взять кофе и вернуться делать: 'клац... клац...'");
            }
        }
        return time;
    }

    public static void playPC(int time) {
        while (time <= 24) {
            System.out.println("Пиу пи");
            time++;
        }
    }

    public static void watchMovie() {
        System.out.println("Алиса, помоги выбрать фильм");

        while (isThisFilmInteresting()) {
            System.out.println("Алиса, не то");
        }

        System.out.println("То что нужно! Отличный фильм");
    }

    // программисты любят поспать подольше
    private static boolean isProgrammerWakeUp() {
        int random = new Random().nextInt(5); // этот метод позволяет сгенерировать случайное число от 0 до 4
        return random == 0;
    }

    // воды в чайнике может и не быть :(
    private static boolean isKettleEmpty() {
        return new Random().nextBoolean(); // этот метод позволяет сгенерировать случайное значение типа boolean (true или false)
    }

    // давайте выберем интересный фильм
    private static boolean isThisFilmInteresting() {
        int random = new Random().nextInt(3); // этот метод позволяет сгенерировать случайное число от 0 до 2
        return random != 0;
    }
}