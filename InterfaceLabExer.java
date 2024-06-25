package inheritance;
interface Logger {
	 void log(String message);
	 default void defaultLog() {
	     System.out.println("Logging default message");
	 }
	}

	class FileLogger implements Logger {
	 //Override
	 public void log(String message) {
	     System.out.println("Logging to file: " + message);
	 }
	}
	class ConsoleLogger implements Logger {
	 
	 //Override
	 public void log(String message) {
	     System.out.println("Logging to console: " + message);
	 }
	}
public class InterfaceLabExer {

	public static void main(String[] args) {
		 FileLogger fileLogger = new FileLogger();
	        ConsoleLogger consoleLogger = new ConsoleLogger();
	        fileLogger.log("Message logged in file");
	        consoleLogger.log("Message logged in console");
	        fileLogger.defaultLog();
	        consoleLogger.defaultLog();
	}

}
/*Interface with Default Method
Define an interface Logger with:

An abstract method log(String message).
A default method defaultLog() that prints "Logging default message".
Create a class FileLogger that implements the Logger interface:

Implement the log(String message) method to write the message to a file.
Create another class ConsoleLogger that also implements the Logger interface:

Implement the log(String message) method to print the message to the console.
Write a Main class to demonstrate using both FileLogger and ConsoleLogger objects, calling the log() method and the default method defaultLog() for each logger.*/