import java.util.Arrays;
import java.util.Random;

public class Massivs {
    public static void main(String[] args) {
        int[] years = new int[50];
        Random random = new Random();

        // Заполняем массив случайными годами от 2000 до 2025
        for (int i = 0; i < years.length; i++) {
            years[i] = 2000 + random.nextInt(26); // 0..25
        }

        // Выводим машины, выпущенные после 2015 года
        System.out.println("Машины после 2015 года:");
        for (int year : years) {
            if (year > 2015) {
                System.out.print(year + " ");
            }
        }
        System.out.println();

        // Считаем средний возраст (2025 - год выпуска)
        double sumAge = 0;
        for (int year : years) {
            sumAge += (2025 - year);
        }
        double averageAge = sumAge / years.length;
        System.out.println("Средний возраст авто: " + averageAge);
    }
}
