import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        int speed = 0;
        Race race = new Race();
        Car[] cars = new Car[3];

        for (int i = 1; i <= 3; i++) {
                    System.out.println("Введите название автомобиля №" + i + ": ");
                    name = scanner.next();

                    while (true) {
                        System.out.println("Введите скорость автомобиля №" + i + " от 0 до 250: ");
                        speed = scanner.nextInt();
                        if (speed > 0 && speed <= 250) {
                        } else {
                            System.out.println("Ошибка: скорость должна быть целым числом от 0 до 250. Попробуйте снова.");
                        }
                        break;
                    }

                    Car car = new Car(name, speed);
                    race.newLeader(car);
                    scanner.nextInt();
                }

                System.out.println("Самая быстрая машина: " + race.getLeader());

                scanner.close();
            }
        }

