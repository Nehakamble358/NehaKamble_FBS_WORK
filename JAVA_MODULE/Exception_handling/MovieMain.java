package Exception;

public class MovieMain {
	
	public static void main(String[]args) {
		
		MovieTicket ticket = new MovieTicket();
		
		try {
			ticket.bookTickets(5);
		}
		catch(InvalidTicketNumberException i) {
			System.out.println(i);
		}
		catch(TicketsSoldOutException t) {
			System.out.println(t);
		}
	}

}
