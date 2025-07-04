public class Main {
    public static void main(String[] args) {
        RoomServiceImpl<Room> service = new RoomServiceImpl<>();

        Room economy = new EconomyRoom(101, 50);
        Room lux = new LuxRoom(202, 150);

        service.clean(economy);
        service.reserve(economy);

        try {
            service.reserve(economy);
        } catch (RoomAlreadyReservedException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        service.free(economy);
        service.reserve(lux);
    }
}
