package hashSet;

import java.util.HashSet;
import java.util.Scanner;

class MovieRating{
	String movieTitle;
	double rating;
	public MovieRating(String movieTitle, double rating) {
		this.movieTitle = movieTitle;
		this.rating = rating;
	}
}
class RatingSystem{
	HashSet<MovieRating> rateSystem = new HashSet<>();
	public void addRating(String movieTitle, double rating) {
		MovieRating movieRating = new MovieRating(movieTitle, rating);
		rateSystem.add(movieRating);
	}
	public void display() {
		System.out.println("Movie Rating: ");
		for (MovieRating rating : rateSystem) {
			System.out.println("Movie: " + rating.movieTitle + " , rating " + rating.rating);
		}
	}
}
public class MovieRatingSystem {
    public static void main(String[] args) {

    	Scanner scan = new Scanner(System.in);
    	RatingSystem ratingSystem = new RatingSystem();
    	System.out.println("Enter Movie rating or enter 'done' to stop rating: ");
    	
    	while (true) {
    		System.out.println("Movie Title: ");
    		String movieTitle = scan.nextLine();
    		if (movieTitle.equalsIgnoreCase("done")) {
    			break;
    		}
    		System.out.println("Rating: ");
    		double rating = scan.nextDouble();
    		scan.nextLine();
    		ratingSystem.addRating(movieTitle, rating);
    	}
    	System.out.println("\nMovie Rating");
    	ratingSystem.display();
    	scan.close();
    }
}