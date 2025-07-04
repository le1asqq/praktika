import java.util.function.Supplier;
import java.util.Random;

public class RandomSupplier {
    public static void main(String[] args) {
        Random random = new Random();
        Supplier<Integer> randomSupplier = () -> random.nextInt(11);

        System.out.println("Случайное число: " + randomSupplier.get());
    }
}
