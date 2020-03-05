public class MountainBike extends Bicycle {

    // the MountainBike subclass adds one field
    public int seatHeight;

    // Default Constructor
    public MountainBike() {
        seatHeight = 0;
    }

    // Paramiterised constructor
    public MountainBike(int cadance, int speed, int gear, int seatHeight) {
        super(cadance, speed, gear);
        this.seatHeight = seatHeight;
        System.out.println("I just created Mountain Bike!!!");
    }

    public MountainBike(int startHeight) {
        seatHeight = startHeight;
    }

    // Paramiterised constructor using super keyword

    // Getters and Setters
}
