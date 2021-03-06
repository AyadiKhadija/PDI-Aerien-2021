package data;

public class Aeronef extends Block {

	private String type;
	private String model;
	private String destination;
	private String departure;
	private int totalSeats;
	private int fuel;
	private int altitude;
	private int speed;

	public Aeronef(int abscisse, int ordonnee) {
		super(abscisse, ordonnee);
	}

	public Aeronef(int abscisse, int ordonnee, String type, String model, String destination, String departure,
			int totalSeats, int fuel, int altitude, int speed) {
		super(abscisse, ordonnee);
		this.type = type;
		this.model = model;
		this.destination = destination;
		this.departure = departure;
		this.totalSeats = totalSeats;
		this.fuel = fuel;
		this.altitude = altitude;
		this.speed = speed;
	}
	


	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getDeparture() {
		return departure;
	}

	public void setDeparture(String departure) {
		this.departure = departure;
	}

	public int getTotalSeats() {
		return totalSeats;
	}

	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}

	public int getFuel() {
		return fuel;
	}

	public void setFuel(int fuel) {
		this.fuel = fuel;
	}

	public int getAltitude() {
		return altitude;
	}

	public void setAltitude(int altitude) {
		this.altitude = altitude;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "Aeronef [type=" + type + ", model=" + model + ", destination=" + destination + ", departure="
				+ departure + ", totalSeats=" + totalSeats + ", fuel=" + fuel + ", altitude=" + altitude + ", speed="
				+ speed + "]";
	}

}
