import java.util.function.Function;

public class NumberDescriptionFunction {
    public static void main(String[] args) {
        Function<Integer, String> describeNumber = n -> {
            if (n > 0) return "Положительное число";
            else if (n < 0) return "Отрицательное число";
            else return "Ноль";
        };

        System.out.println(describeNumber.apply(5));
        System.out.println(describeNumber.apply(-3));
        System.out.println(describeNumber.apply(0));
    }
}
