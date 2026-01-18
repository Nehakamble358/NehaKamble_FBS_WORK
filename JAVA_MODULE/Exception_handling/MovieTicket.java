package Exception;

public class MovieTicket {

	static int ticketPrice = 200;
	static int remainingTickets= 50;

	public void bookTickets(int ticketCount)

			throws InvalidTicketNumberException, TicketsSoldOutException {

		if ( ticketCount <= 0) {
			throw new InvalidTicketNumberException();

		}

		if  (ticketCount > remainingTickets) {
			throw new TicketsSoldOutException();
		}
		int totalAmount = ticketCount * ticketPrice;
		remainingTickets -= ticketCount;

		System.out.println("\n Booking successfully \"3 Idiots\"!");
		System.out.println("Ticket Bokked:" + ticketCount) ;
		System.out.println("total amount:" + totalAmount);
		System.out.println("Remaining tickets: " + remainingTickets);
  
	}
}
