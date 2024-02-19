import java.util.Scanner;
public class MovieDriver {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        String response;

        do {
            Movie movie = new Movie();

            System.out.print("Enter the title of a movie: ");
            String title = scanner.nextLine();
            movie.setTitle(title);

            System.out.print("Enter the movie's rating: ");
            String rating = scanner.nextLine();
            movie.setRating(rating);

            System.out.print("Enter the number of tickets sold at a theater: ");
            int ticketsSold = scanner.nextInt();
            movie.setTicketsSold(ticketsSold);
            scanner.nextLine(); // consume the newline character

            System.out.println(movie.toString());

            System.out.print("Do you want to enter another movie? (y or n): ");
            response = scanner.nextLine();
        } while (response.equalsIgnoreCase("y"));

        System.out.println("Goodbye!");
    }
}

class Movie {
    private String title;
    private String rating;
    private int ticketsSold;

    public Movie() {
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public void setTicketsSold(int ticketsSold) {
        this.ticketsSold = ticketsSold;
    }

    @Override
    public String toString() {
        return "Movie " +
                "Title = '" + title + '\'' +
                ", Age rating = '" + rating + '\'' +
                ", Tickets Sold = " + ticketsSold;
    }
}