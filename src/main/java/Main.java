import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        int speed;
        Race race = new Race();

        for (int i = 1; i <= 3; i++) {
            while (true) {
                System.out.println("Введите название автомобиля №" + i + ": ");
                name = scanner.nextLine().trim();
                if (!name.isEmpty()) {
                    break;
                } else {
                    System.out.println("Ошибка: название не может быть пустым. Попробуйте снова.");
                }
            }

            while (true) {
                System.out.println("Введите скорость автомобиля №" + i + " от 0 до 250: ");
                if (scanner.hasNextLine()) {
                    String speedInput = scanner.nextLine().trim();
                    if (!speedInput.isEmpty()) {
                        try {
                            speed = Integer.parseInt(speedInput);
                            int maxSpeed = 250;
                            int minSpeed = 0;
                            if (speed >= minSpeed && speed <= maxSpeed) {
                                break;
                            } else {
                                System.out.println("Ошибка: скорость должна быть целым числом от 0 до 250. Попробуйте снова.");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Ошибка: введите корректное целое число.");
                        }
                    } else {
                        System.out.println("Ошибка: скорость не может быть пустой. Попробуйте снова.");
                    }
                }
            }

                    Car car = new Car(name, speed);
                    race.newLeader(car);
                    scanner.nextInt();
                }

                System.out.println("Самая быстрая машина: " + race.getLeader());

                scanner.close();
            }
        }

