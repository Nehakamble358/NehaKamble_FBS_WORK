package Exception;

public class InvalidTicketNumberException extends Exception {
@Override
public String toString() {
	
	return "Invalid number of tickets! Ticket count must be greater than 0.";
}
}
