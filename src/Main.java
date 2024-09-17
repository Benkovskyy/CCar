import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод данных для детали
        System.out.println("Введите наименование детали (HOOD, FRONT_DOOR, REAR_DOOR, FRONT_BUMPER, REAR_BUMPER, ROOF):");
        String partInput = scanner.nextLine().toUpperCase();

        // Ввод данных для цвета
        System.out.println("Введите цвет (WHITE, BLUE, YELLOW, RED, PEARLESCENT, METALLIC_GRAY):");
        String colorInput = scanner.nextLine().toUpperCase();

        // Ввод данных для класса авто
        System.out.println("Введите класс машины (ECONOMY, COMFORT, COMFORT_PLUS, BUSINESS, ULTIMATE)");
        String classInput = scanner.nextLine().toUpperCase();

        try {
            // Преобразуем ввод в enum
            CarCalculator.Part part = CarCalculator.Part.valueOf(partInput);
            CarCalculator.Color color = CarCalculator.Color.valueOf(colorInput);
            CarCalculator.Class carClass = CarCalculator.Class.valueOf(classInput);

            // Рассчитываем стоимость покраски
            double cost = CarCalculator.calculatePaintingCost(part, color);

            // Выводим результат
            System.out.printf("Стоимость покраски детали %s в цвет %s составляет %.2f рублей%n", partInput, colorInput, cost);
        } catch (IllegalArgumentException e) {
            System.out.println("Неверное название детали или цвета. Пожалуйста, повторите ввод.");
            ///
        }
    }
}