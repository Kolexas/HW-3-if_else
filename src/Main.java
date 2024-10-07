public class Main {
    public static void main(String[] args) {
        // Задание 1
        int age = 18;
        System.out.print(" 1. Если возраст человека равен " + age + ", то");
        if (age >= 18) {
            System.out.print(" он совершеннолетний.");
        } else System.out.print(" он не достиг совершеннолетия, нужно немного подождать.");
        // Задание 2
        int airTemperature = 4;
        boolean coldOutside = airTemperature < 5;
        System.out.print("\n 2. На улице " + airTemperature + " градусов,");
        if (coldOutside) {
            System.out.print(" нужно надеть шапку.");
        } else System.out.print(" можно идти без шапки.");
        // Задание  3
        int speed = 70;
        System.out.print("\n 3. Если скорость " + speed + ", то ");
        if (speed > 60) {
            System.out.print("придется платить  штраф");
        } else System.out.print(" можно ездить спокойно");
        // Задание 4
        int personAge = 30;
        System.out.print("\n 4. Если возраст человека равен " + personAge + ", то ему нужно ходить");
        if (personAge >= 2 && personAge <= 6)  {
            System.out.print(" в детский сад.");
        } else
        if (personAge >= 7 && personAge <= 17)  {
            System.out.print(" в школу.");
        } else
        if (personAge >= 18 && personAge <= 24)  {
            System.out.print(" в университет.");
        } else
        if (personAge > 24) {
            System.out.print(" на работу");
        }
        // Задание 5
        int childAge = 30;
        System.out.print("\n 5. Если возраст ребёнка равен " + childAge + ", то ему");
        if (childAge <= 5) {
            System.out.print(" нельзя кататься на аттракционе.");
        } else
        if (childAge >=6 && childAge <= 14) {
            System.out.print(" можно кататься в сопровождении взрослого.");
        } else
        if (childAge >= 15) {
            System.out.print(" можно кататься без сопровождения взрослого.");
        }
        // Задание 6
        int carCapacity = 102;
        int seatsNum = 60;
        int passagerNum = 60;
        String typeofseat1 = "cидячее";
        String typeofseat2 = "стоячее";
            System.out.print("\n 6. Если количество пассажиров равно " + passagerNum + ", то");
        if (passagerNum >= 102) {
            System.out.println(" вагон уже забит");
        } else System.out.print(" в вагоне есть ");
        if (passagerNum < 60 && passagerNum >= 0) {
                System.out.print( typeofseat1 + " место." );
            } else
        if (passagerNum >= 60) {
            System.out.print(typeofseat2 + " место.");
        }
      }
    }