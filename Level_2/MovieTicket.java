public class MovieTicket {
  // Attributes (private for encapsulation)
  private String movieName;   
  private String seatNumber;  
  private double price;       

  // Constructor to initialize the MovieTicket object
  public MovieTicket(String movieName) {
      this.movieName = movieName;
      this.seatNumber = "Not Assigned"; 
      this.price = 0.0;                  
  }

  // Method to book a ticket
  public void bookTicket(String seatNumber, double price) {
      this.seatNumber = seatNumber; 
      this.price = price;           
      System.out.println("Ticket booked successfully!\n");
  }

  // Method to display ticket details
  public void displayTicketDetails() {
      System.out.println("=== Ticket Details ===");
      System.out.println("Movie Name: " + movieName);
      System.out.println("Seat Number: " + seatNumber);
      System.out.println("Price: $" + price);
      System.out.println("=======================\n");
  }

  // Main method to test the MovieTicket class
  public static void main(String[] args) {
      // Step 1: Create a MovieTicket object for a specific movie
      MovieTicket ticket = new MovieTicket("Inception");

      // Step 2: Display ticket details before booking
      System.out.println("Before booking:");
      ticket.displayTicketDetails();

      // Step 3: Book the ticket
      ticket.bookTicket("A10", 12.50); // Assign seat A10 and price $12.50

      // Step 4: Display ticket details after booking
      System.out.println("After booking:");
      ticket.displayTicketDetails();
  }
}