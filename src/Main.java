public class Main {
    public static void main(String[] args) {

        var hourAll = 640;
        var sotrOneHour = 8;
        var sotrAll = hourAll / sotrOneHour;
        System.out.println("Всего работников в компании – " + sotrAll + " человек.");

        sotrAll = sotrAll + 94;
        var hourAllNew = sotrAll * 8;
        System.out.println("Если в компании работает " + sotrAll + " человека, " +
                "то всего " + hourAllNew + " часов работы " +
                "может быть поделено между сотрудниками.");

    }
}