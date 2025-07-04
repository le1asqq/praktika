@DeprecatedEx(message = "Используйте NewClass вместо OldClass")
public class OldClass {

    @DeprecatedEx(message = "Используйте newMethod вместо oldMethod")
    public void oldMethod() {
        System.out.println("Старый метод");
    }

    public void newMethod() {
        System.out.println("Новый метод");
    }
}
