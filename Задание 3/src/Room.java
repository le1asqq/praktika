import java.util.Random;

public abstract class Room {
    int roomNumber;
    int maxPeople;
    int pricePerNight;
    boolean isReserved;

    public Room(int roomNumber, int pricePerNight) {
        this.roomNumber = roomNumber;
        this.maxPeople = new Random().nextInt(4) + 1;
        this.pricePerNight = pricePerNight;
        this.isReserved = false;
    }
}
