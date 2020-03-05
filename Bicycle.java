public class Bicycle {

	// the Bicycle class has three fields
	private int cadence;
	private int gear;
	private int speed;
	
    // Default constructor
    //0 is default

    public Bicycle() {
     cadence = 0;
     gear = 0;
     speed = 0;
     System.out.println("I just created bicycle!!!");
    }



	// Parameterised constructor
    public Bicycle(int cadence,int speed,int gear) {
        this.cadance = startCadance;
        this.speed  = startSpeed;
        this.gear = startGear;

	}
	
    // Getters and Setters here
    //Getter
    public int getCadance();
        return this.cadance;

     public int getSpeed();
        return this.speed;

     public int getGear();
        return this.gear;

    //Setter
    public void setCadance(int cadance);
        this.cadance = cadance;

    public void setSpeed(int speed);
        this.speed = speed;

     public void setGear(int gear);
        this.gear = gear;


	// Extra methods here
	public void applyBrake(int speedDecrement) {
		speed -= speedDecrement;
	}

	public void speedUp(int speedIncrement) {
        // Your code here
        speed += speedIncrement;
	}

}
