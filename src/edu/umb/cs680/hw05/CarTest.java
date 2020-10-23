package edu.umb.cs680.hw05;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CarTest {
	//private String eol = System.getProperty("line.seperator");

	private String[] carToStringArray(Car car) {
		String[] result = { car.getMake(), car.getModel(), Integer.toString(car.getYear()) };
		return result;

	}

	// this is optional method in purpose of converting all Car's data fields into
	// String array
	private String[] carToStringArrayforAllDataFields(Car car) {
		String[] result = { car.getMake(), car.getModel(), Integer.toString(car.getMileage()),
				Integer.toString(car.getYear()), Float.toString(car.getPrice()) };
		return result;

	}
	
	@Test
	public void verifyCarEqualityWithMakeModelYear() {
		String[] expected = { "Toyota", "RAV4", "2018" };
		Car actual = new Car("Toyota", "RAV4", 10000, 2018, 20000f);
		assertArrayEquals(expected, carToStringArray(actual));
	}

	@Test
	public void verifyCarEqualityWithMakeModelYear1() {
		String[] expected = { "Lexus", "LS", "2008" };
		Car actual = new Car("Lexus", "LS", 90000, 2008, 10000f);
		assertArrayEquals(expected, carToStringArray(actual));
	}

	@Test
	public void verifyCarEqualityWithMakeModelYear2() {
		String[] expected = { "Lexus", "ES", "2009" };
		Car actual = new Car("Lexus", "ES", 95000, 2009, 12000f);
		assertArrayEquals(expected, carToStringArray(actual));
	}

	// optional checking
	@Test
	public void check_Lexus_LS_creation() {
		String[] expected = { "Lexus", "LS", "10000", "2008", "12500.5" };
		Car car1 = new Car("Lexus", "LS", 10000, 2008, 12500.5f);
		assertArrayEquals(expected, carToStringArrayforAllDataFields(car1));
	}

	// optional checking
	@Test
	public void check_Lexus_ES_creation() {
		String[] expected = { "Lexus", "ES", "100000", "2008", "32500.5" };
		Car car1 = new Car("Lexus", "ES", 100000, 2008, 32500.5f);
		assertArrayEquals(expected, carToStringArrayforAllDataFields(car1));
	}

}
