//Develop a movie collection manager where users can add, remove, and search for movies
// in their collection. Each movie should have properties such as movieID, title,
// director, genre, and yearReleased. Implement functionality to display all movies,
// search for a movie by title, and display all movies of a specific genre.
package Arraylist_program.movie_collection_manager;

public class Movie {
    private int movieID;
    private String title;
    private String director;
    private String genre;
    private int yearReleased;

    public Movie(int movieID, String title, String director, String genre, int yearReleased) {
        this.movieID = movieID;
        this.title = title;
        this.director = director;
        this.genre = genre;
        this.yearReleased = yearReleased;
    }

    public void setMovieID(int movieID) {
        this.movieID = movieID;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setYearReleased(int yearReleased) {
        this.yearReleased = yearReleased;
    }

    public int getMovieID() {
        return movieID;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public String getGenre() {
        return genre;
    }

    public int getYearReleased() {
        return yearReleased;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieID=" + movieID +
                ", title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", genre='" + genre + '\'' +
                ", yearReleased=" + yearReleased +
                '}';
    }
}
