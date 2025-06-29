import java.util.*;
import java.util.stream.Collectors;

public class StreamAPI {

    static class Car {
        String VIN;
        String model;
        String manufacturer;
        int year;
        int mileage;
        double price;

        Car(String VIN, String model, String manufacturer, int year, int mileage, double price) {
            this.VIN = VIN;
            this.model = model;
            this.manufacturer = manufacturer;
            this.year = year;
            this.mileage = mileage;
            this.price = price;
        }

        @Override
        public String toString() {
            return model + " " + year + " - ₽" + price + ", пробег: " + mileage;
        }
    }

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("VIN001", "Mitsubishi Lancer 10", "Mitsubishi", 2017, 334876, 760000));
        cars.add(new Car("VIN002", "Granta Sport", "LADA", 2024, 10000, 1300000));
        cars.add(new Car("VIN003", "Lada Vas 2112(JBLka)", "LADA", 2025, 30000, 2000000));

        // Фильтруем машины с пробегом < 50000
        List<Car> filtered = cars.stream()
                .filter(car -> car.mileage < 50000)
                .collect(Collectors.toList());

        // Сортируем по цене по убыванию
        filtered.sort((c1, c2) -> Double.compare(c2.price, c1.price));

        // Топ-3 самых дорогих с малым пробегом
        System.out.println("Топ-3 самых дорогих машин с пробегом < 50000:");
        filtered.stream().limit(3).forEach(System.out::println);

        // Средний пробег всех машин
        double avgMileage = cars.stream()
                .mapToInt(car -> car.mileage)
                .average()
                .orElse(0);
        System.out.println("\nСредний пробег всех машин: " + avgMileage);

        // Группировка по производителю
        Map<String, List<Car>> grouped = cars.stream()
                .collect(Collectors.groupingBy(car -> car.manufacturer));

        System.out.println("\nГруппировка машин по производителю:");
        for (String manufacturer : grouped.keySet()) {
            System.out.println(manufacturer + ": " + grouped.get(manufacturer).size() + " шт.");
        }
    }
}
