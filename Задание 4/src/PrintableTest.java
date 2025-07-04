public class PrintableTest {
    public static void main(String[] args) {
        Printable printable = () -> System.out.println("лямбда-выражение 123 123");
        printable.print();
    }
}
