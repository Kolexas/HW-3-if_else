public class Main {
    public static void main(String[] args) {
        // Задание 1
        int age = 15;
        System.out.print(" 1. Если возраст человека равен " + age + ", то");
        if (age >= 18) {
            System.out.print(" он совершеннолетний.");
        } else {
            System.out.print(" он не достиг совершеннолетия, нужно немного подождать.");
        }
        // Задание 2
        int airTemperature = 4;
        boolean coldOutside = airTemperature < 5;
        System.out.print("\n 2. На улице " + airTemperature + " градусов,");
        if (coldOutside) {
            System.out.print(" нужно надеть шапку.");
        } else {
            System.out.print(" можно идти без шапки.");
        }
        // Задание 3
        int speed = 70;
        System.out.print("\n 3. Если скорость " + speed + ", то ");
        if (speed > 60) {
            System.out.print("придется платить  штраф");
        } else {
            System.out.print(" можно ездить спокойно");
        }
        // Задание 4
        int personAge = 30;
        System.out.print("\n 4. Если возраст человека равен " + personAge + ", то ему нужно ходить");
        if (personAge >= 2 && personAge <= 6) {
            System.out.print(" в детский сад.");
        }
        if (personAge >= 7 && personAge <= 17) {
            System.out.print(" в школу.");
        }
        if (personAge >= 18 && personAge <= 24) {
            System.out.print(" в университет.");
        }
        if (personAge > 24) {
            System.out.print(" на работу.");
        }
        // Задание 5
        int childAge = 13;
        boolean adultPresent = false;
        System.out.print("\n 5. Если возраст ребёнка равен " + childAge + ", то ему");
        if (childAge < 5 || childAge < 14 && adultPresent == false) {
            System.out.print(" нельзя кататься на аттракционе.");
        }
        if (childAge >= 5 && childAge < 14 && adultPresent) {
            System.out.print(" можно кататься в сопровождении взрослого.");
        }
        if (childAge >= 14) {
            System.out.print(" можно кататься без сопровождения взрослого.");
        }
        // Задание 6
        int carCapacity = 102;
        int seatsNum = 60;
        int passagerNum = 60;
        String typeOfSeat1 = "cидячее";
        String typeOfSeat2 = "стоячее";
        System.out.print("\n 6. Если количество пассажиров равно " + passagerNum + ", то");
        if (passagerNum >= carCapacity) {
            System.out.println(" вагон уже забит");
        } else {
            System.out.print(" в вагоне есть ");
        }
        if (passagerNum < seatsNum && passagerNum >= 0) {
            System.out.print(typeOfSeat1 + " место.");
        }
        if (passagerNum >= seatsNum) {
            System.out.print(typeOfSeat2 + " место.");
        }
        // Задание 7
        int one = 2000;
        int two = 2100;
        int three = 2300;
        System.out.print("\n 7. Наибольшее число из трёх - ");
            if (one >= two && one >= three) {
            System.out.print(one);
            }
            if (two >= one && two >= three) {
                System.out.print(two);
            }
            if (three >= two && three >= one) {
                System.out.print(three);
            }
        }
    }