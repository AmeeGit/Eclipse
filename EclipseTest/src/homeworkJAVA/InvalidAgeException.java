package homeworkJAVA;

public class InvalidAgeException extends Exception {

	public InvalidAgeException(String st) {
		super(st);

	}

	static void validate(int age) throws InvalidAgeException {
		if (age < 16) {

			throw new InvalidAgeException("Not get driving licence");
		} else {
			System.out.println("Valid for driving ");
		}
	}

	public static void main(String args[])  {
		
		try {
		
			validate(13);
		} catch (InvalidAgeException ex) {
			System.out.println("Caught the exception");

			System.out.println("Exception occured: " + ex.getMessage());
		}

		System.out.println("rest of the code...");
	}

}
