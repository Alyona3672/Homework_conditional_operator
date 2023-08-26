public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }
    public static void task1() {
        int age = 17;
        if (age >= 18) {
                System.out.println(" Если возраст человека равен, то он совершеннолетний." );
        } else  {
                System.out.println( " Если возраст человека равен , то он не достиг совершеннолетия, нужно немного подождать.");
        }

        int age1 = 31;
        if (age1 > 18){
            System.out.println(" Если возраст человека равен ,то он совершеннолетний." );
        } else  {
            System.out.println( " Если возраст человека равен , то он не достиг совершеннолетия, нужно немного подождать.");
        }
    }
    public static void task2(){
        int temperature = 2;
        if (temperature < 5){
            System.out.println(" На улице холодно, нужно надеть шапку.");
        } else {
            System.out.println(" На улице тепло, можно идти без шапки. ");
        }

        int temperature1 = 8;
        if (temperature1 < 5){
            System.out.println(" На улице холодно, нужно надеть шапку.");
        } else {
            System.out.println(" На улице тепло, можно идти без шапки. ");
        }
    }
    public static void task3(){
        int speed = 90;
        if (speed > 60){
            System.out.println(" Скорость превышена, придется заплатить штраф. ");
        } else {
            System.out.println(" Превышения скорости нет, можно ездить спокойно. ");
        }

        int speed1 = 55;
        if (speed1 > 60){
            System.out.println(" Скорость превышена, придется заплатить штраф. ");
        } else {
            System.out.println(" Превышения скорости нет, можно ездить спокойно. ");
        }
    }
    public static void task4(){
        int age = 12;
        if (age < 2) {
            System.out.println(" Пора спать! ");
        } else if(age > 2 && age <6) {
            System.out.println(" Нужно ходить в детский сад. ");
        } else if (age >7 && age <18) {
            System.out.println(" Нужно ходить в школу. ");
        } else if (age > 18 && age < 24) {
            System.out.println(" Его место в университете. ");
        } else if (age >24) {
            System.out.println(" Пора ходить на работу.");
        } else if ( age < 60) {
            System.out.println(" Может отдохнуть!");
        }
    }
    public static void task5(){
        int age = 13;
        if (age < 5) {
            System.out.println(" Ребенок не может кататься на аттракцищне. ");
        } else if (age >= 5 && age < 14) {
            System.out.println(" Ребенок может кататься в сопровождении взрослого. Если взрослого нет, то кататься нельзя");
        } else if ( age > 14) {
            System.out.println(" Ребенок может кататься без сопровождения взрослого.");
        }
    }
    public static void task6() {
        int wagonCapacity = 102;
        int seatPlace = 60;
        int numberOfPersons = 47;
        if (wagonCapacity == numberOfPersons) {
            System.out.println(" Вагон полностью занят.");
        } else if (numberOfPersons < seatPlace) {
            System.out.println(" Есть сидячее место.");
        }else {
            System.out.println(" Есть стоячее место.");
        }
    }
    public static void task7(){
        int one = 34, two = 12, three = 97;
        if (one > two && one > three){
            System.out.println(one);
        } else if (two > three){
            System.out.println(two);
        } else {
            System.out.println(three);
        }
    }
}