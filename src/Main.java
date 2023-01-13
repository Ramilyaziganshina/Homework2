public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1 () {
        System.out.println("Задача 1-3");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("dog = " + dog + " cat = " + cat + " paper = " + paper);
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println("dog = " + dog + " cat = " + cat + " paper = " + paper);
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println("dog = " + dog + " cat = " + cat + " paper = " + paper);
    }

    public static void task2 () {
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

    }

    public static void task3 () {
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog +4;
        System.out.println(frog);
    }
    public static void task4 () {
        System.out.println("Задача 6-7");
        var boxer1Weight = 78.2;
        var boxer2Weight = 82.7;
        var totalWeight = boxer1Weight + boxer2Weight;
        System.out.println("Общий вес двух бойцов " + totalWeight + " кг");
        var weightDifferenceSubtraction = boxer2Weight - boxer1Weight;
        System.out.println("Разница в весе 2х бойцов " + weightDifferenceSubtraction + " кг");
        var weightDifferenceDivision = boxer2Weight % boxer1Weight;
        System.out.println("Разница в весе 2х бойцов " + weightDifferenceDivision + " кг");
    }
    public static void task5 () {
        System.out.println("Задача 8");
        var workingHours1 = 640;
        var hoursADay = 8;
        var employeersInTheCompany = workingHours1 / hoursADay;
        System.out.println("Всего работников в компании - " + employeersInTheCompany + " человек");
        employeersInTheCompany = employeersInTheCompany + 94;
        var workingHours2 = employeersInTheCompany * 8;
        System.out.println("Если в компании работает " + employeersInTheCompany + " человек, то всего " + workingHours2 + " часов работы может быть поделено между сотрудниками");

    }
}