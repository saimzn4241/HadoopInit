/*
* This class prints the given message on console.
*/
public class MessageUtil {
	private String message;

	// Constructor
	// @param message to be printed
	public MessageUtil(String message) {
		this.message = message;
	}

	// prints the message
	public String printMessage() {
		System.out.println(message);
		return message;
	}
	
	public void printMessage1() {
		System.out.println(message);
		while(true);
	}
	
	public void printMessage2() {
		System.out.println(message);
		int a = 0/1;
		int b = 1/a;
	}

	// add "Hi!" to the message
	public String salutationMessage() {
		message = "Hi!" + message;
		System.out.println(message);
		return message;
	}
}