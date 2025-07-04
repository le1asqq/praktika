public class RoomServiceImpl<T extends Room> implements RoomService<T> {
    public void clean(T room) {
        System.out.println("Комната #" + room.roomNumber + " убрана.");
    }

    public void reserve(T room) {
        if (room.isReserved) {
            throw new RoomAlreadyReservedException("Комната уже забронирована!");
        }
        room.isReserved = true;
        System.out.println("Комната #" + room.roomNumber + " успешно забронирована.");
    }

    public void free(T room) {
        room.isReserved = false;
        System.out.println("Комната #" + room.roomNumber + " теперь свободна.");
    }
}
