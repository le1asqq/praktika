import java.util.function.Consumer;

public class HeavyBoxConsumer {
    public static void main(String[] args) {
        Consumer<HeavyBox> shipBox = box -> System.out.println("Отгрузили ящик с весом " + box.getWeight());
        Consumer<HeavyBox> sendBox = box -> System.out.println("Отправляем ящик с весом " + box.getWeight());

        Consumer<HeavyBox> processBox = shipBox.andThen(sendBox);

        HeavyBox box = new HeavyBox(10);
        processBox.accept(box);
    }
}
