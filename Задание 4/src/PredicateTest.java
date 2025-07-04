import java.util.function.Predicate;

public class PredicateTest {
    public static void main(String[] args) {
        Predicate<String> notNull = s -> s != null;
        Predicate<String> notEmpty = s -> !s.isEmpty();

        String testStr = "Пример";

        System.out.println("Строка не null: " + notNull.test(testStr));
        System.out.println("Строка не пуста: " + notEmpty.test(testStr));

        Predicate<String> notNullAndNotEmpty = notNull.and(notEmpty);
        System.out.println("Строка не null и не пуста: " + notNullAndNotEmpty.test(testStr));
    }
}
