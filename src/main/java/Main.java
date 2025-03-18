import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Race race = new Race();

        System.out.println("Введите данные для трех автомобилей:");

        for (int i = 1; i <= 3; i++) {
            System.out.println("Название автомобиля №" + i + ":");
            String name = scanner.next();

            int speed = 0;
            while (true) {
                System.out.println("Введите скорость автомобиля (от 1 до 250):");
                if (scanner.hasNextInt()) {
                    speed = scanner.nextInt();
                    if (speed > 0 && speed <= 250) {
                        break;
                    } else {
                        System.out.println("Ошибка! Скорость должна быть от 1 до 250 км/ч.");
                    }
                } else {
                    System.out.println("Ошибка! Введите целое числовое значение.");
                    scanner.next();
                }
            }

            Car car = new Car(name, speed);
            race.addCar(car);
        }

        System.out.println("Самая быстрая машина: " + race.getLeader().getName());
    }
}


