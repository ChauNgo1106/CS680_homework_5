package edu.umb.cs680.hw05;

public class Car {

	private String make,model;
	private int mileage , year;
	private float price;
	
	//default constructor
	public Car() {}
	
	//constructor with arguments
	public Car(String make, String model, int mileage, int year, float price) {
		super();
		this.make = make;
		this.model = model;
		this.mileage = mileage;
		this.year = year;
		this.price = price;
	}

	public Car(String make, String model, int year) {
		this.make = make;
		this.model = model;
		this.year = year;
	}

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public int getMileage() {
		return mileage;
	}

	public int getYear() {
		return year;
	}

	public float getPrice() {
		return price;
	}


	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", mileage=" + mileage + ", year=" + year + ", price=" + price
				+ "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car("Lexus", "LS", 10000, 2008, 12500.5f);
		System.out.println(car1.toString());
	}

}
