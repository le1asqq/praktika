import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class equalshashCode {

    static class Car implements Comparable<Car> {
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
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Car car = (Car) obj;
            return VIN.equals(car.VIN);
        }

        @Override
        public int hashCode() {
            return VIN.hashCode();
        }

        @Override
        public int compareTo(Car other) {
            // Сортируем от новых к старым (по убыванию года)
            return Integer.compare(other.year, this.year);
        }

        @Override
        public String toString() {
            return model + " (" + year + ") VIN: " + VIN + ", цена: " + price;
        }
    }

    public static void main(String[] args) {
        Set<Car> cars = new HashSet<>();

        // Добавляем машины (дубликат по VIN — не добавится)
        cars.add(new Car("VIN001", "Mitsubishi Lancer 10", "Mitsubishi", 2017, 85000, 760000));
        cars.add(new Car("VIN002", "Granta Sport", "LADA", 2024, 10000, 1300000));
        cars.add(new Car("VIN003", "Lada Vas 2112(JBLka)", "LADA", 2025, 5000, 2000000));
        cars.add(new Car("VIN001", "Mitsubishi Lancer 10", "Mitsubishi", 2017, 85000, 760000)); // дубликат VIN

        System.out.println("Машины в HashSet (дубликаты не добавлены):");
        for (Car car : cars) {
            System.out.println(car);
        }

        // Сортировка по году выпуска
        TreeSet<Car> sortedCars = new TreeSet<>(cars);
        System.out.println("\nМашины отсортированные по году (от новых к старым):");
        for (Car car : sortedCars) {
            System.out.println(car);
        }
    }
}
