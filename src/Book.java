import java.util.ArrayList;

public class Book {
    private String title;
    private String author;
    private ArrayList<Integer> ratings;
    private int  totalBooks = 0;
    private double averageRating;

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.ratings = new ArrayList<>();
        totalBooks++;

    }

    public String getTitle() {
        return title;
    }

    public void displayInfo() {
        String ratingLevel = getRatingLevel();
        System.out.println("Book: " + title + " by " + author + ", Average Rating: " + averageRating + ", Level: " + ratingLevel);
    }

    public void setRating(double rating) {
        if (rating >= 1 && rating <= 5) {
            averageRating = rating;
            System.out.println("Rating " + rating + " added successfully");
        } else {
            System.out.println("Error: Invalid rating: must be 1-5 stars");
        }

    }

    private String getRatingLevel() {
        if (averageRating >= 4.0) {
            return "Good";
        } else if (averageRating >= 3.0) {
            return "Average";
        } else {
            return "Poor";
        }
    }
}
