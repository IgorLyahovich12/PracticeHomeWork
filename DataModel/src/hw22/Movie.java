package DataModel.src.hw22;
public class Movie {
    private String title;
    private final int releaseYear;
    private final String director;
    private String genre;

    public Movie(String title, int releaseYear, String director, String genre) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.director = director;
        this.genre = genre;
    }
    public Movie(String director, int movieCount) {
        this.director = director;
        this.releaseYear = movieCount;
    }

    public String getTitle() {
        return title;
    }



    public int getReleaseYear() {
        return releaseYear;
    }



    public String getDirector() {
        return director;
    }



    public String getGenre() {
        return genre;
    }



    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", releaseYear=" + releaseYear +
                ", director='" + director + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}