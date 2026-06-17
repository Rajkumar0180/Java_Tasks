package com.exceptionHandle;

class InvalidAgeOfVehicalException extends Exception {
	public InvalidAgeOfVehicalException(String message) {
		super(message);
	}
}

class InvalidAgeOfTireException extends Exception {
	public InvalidAgeOfTireException(String message) {
		super(message);
	}
}

class InvalidAgeOfEngineException extends Exception {
	public InvalidAgeOfEngineException(String message) {
		super(message);
	}
}
class Vehical {
	public void checkage(int ageOfVehical, int ageOfTire, int ageOfEngine)
			throws InvalidAgeOfVehicalException, InvalidAgeOfTireException, InvalidAgeOfEngineException {
		if (ageOfVehical > 10) {
			throw new InvalidAgeOfVehicalException("Invalid");
		} else if (ageOfTire > 2) {
			throw new InvalidAgeOfTireException("Invalid");
		} else if (ageOfEngine > 15) {
			throw new InvalidAgeOfEngineException("Invalid");
		} else {
			System.out.println("Valid vehical");
		}
	}
}

public class Example {
	public static void main(String[] args) {
		try {
			new Vehical().checkage(10, 20, 15);
		} catch (InvalidAgeOfVehicalException | InvalidAgeOfTireException | InvalidAgeOfEngineException e) {
			e.printStackTrace();
		}
		System.out.println("Exicuted");
	}

}
