import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Collections;

public class carCollection {
    public static void main(String[] args) {
        List<String> models = new ArrayList<>();
        // Добавляем модели
        models.add("Toyota Camry");
        models.add("Mitsubishi Lancer 10");
        models.add("Tesla Model S");
        models.add("Granta Sport");
        models.add("Lada Vas 2112(JBLka)");

        models.add("BMW X5");       // дубликат
        models.add("Toyota Camry"); // дубликат

        // Удаляем дубликаты с помощью Set
        Set<String> uniqueModels = new HashSet<>(models);

        // Преобразуем обратно в список для сортировки
        List<String> sortedModels = new ArrayList<>(uniqueModels);

        // Сортируем в обратном алфавитном порядке
        Collections.sort(sortedModels, Collections.reverseOrder());

        // Заменяем модели, содержащие "Tesla" на "ELECTRO_CAR"
        for (int i = 0; i < sortedModels.size(); i++) {
            if (sortedModels.get(i).contains("Tesla")) {
                sortedModels.set(i, "ELECTRO_CAR");
            }
        }

        // Выводим итоговый список
        System.out.println("Модели после обработки:");
        for (String model : sortedModels) {
            System.out.println(model);
        }
    }
}
