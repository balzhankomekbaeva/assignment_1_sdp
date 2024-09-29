interface MovieSchedule extends Cloneable {
    MovieSchedule clone();
    void setMovie(Movie movie);
    void setTime(String time);
    String getDetails();
}

class StandardSchedule implements MovieSchedule {
    private Movie movie;
    private String time;

    public void setMovie(Movie movie) { this.movie = movie; }
    public void setTime(String time) { this.time = time; }

    public MovieSchedule clone() {
        try {
            return (MovieSchedule) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String getDetails() {
        return "Movie: " + movie.getTitle() + " at " + time;
    }
}
