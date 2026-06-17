package OOPS;

import java.util.Scanner;

class Movies {
	private int movieId;
	private String movieName;
	private double pricePerTicket;
	private int ticketsSold;
	private double budget;

	public Movies() {
	}
	public Movies(int movieId, String movieName, double pricePerTicket, int ticketsSold, double budget) {
		this.movieId = movieId;
		this.movieName = movieName;
		this.pricePerTicket = pricePerTicket;
		this.ticketsSold = ticketsSold;
		this.budget = budget;
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public double getPricePerTicket() {
		return pricePerTicket;
	}
	public void setPricePerTicket(double pricePerTicket) {
		this.pricePerTicket = pricePerTicket;
	}
	public int getTicketsSold() {
		return ticketsSold;
	}
	public void setTicketsSold(int ticketsSold) {
		this.ticketsSold = ticketsSold;
	}
	public double getBudget() {
		return budget;
	}
	public void setBudget(double budget) {
		this.budget = budget;
	}
	public double findProfitMadeByMovie() {
		double totalCollection = pricePerTicket * ticketsSold;
		return totalCollection - budget;
	}
	
	public static void findProfitMadeByMovies(Movies[] movies) {
		for (Movies movie : movies) {
			System.out.println("Movie Name - " + movie.getMovieName());
			System.out.println("Profit - " + movie.findProfitMadeByMovie());
		}
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int numberOfMovies = scanner.nextInt();
		scanner.nextLine();

		Movies[] movies = new Movies[numberOfMovies];

		for (int index = 0; index < numberOfMovies; index++) {
			int movieId = scanner.nextInt();
			scanner.nextLine();

			String movieName = scanner.nextLine();
			double pricePerTicket = scanner.nextDouble();
			int ticketsSold = scanner.nextInt();
			double budget = scanner.nextDouble();

			if (scanner.hasNextLine()) {
				scanner.nextLine();
			}

			movies[index] = new Movies(movieId, movieName, pricePerTicket, ticketsSold, budget);
		}

		Movies.findProfitMadeByMovies(movies);
		scanner.close();
	}
}
