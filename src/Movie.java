abstract class Movie {
    protected String title;
    protected String type;

    public String getTitle() { return title; }
    public String getType() { return type; }
}

class RegularMovie extends Movie {
    public RegularMovie(String title) {
        this.title = title;
        this.type = "Regular";
    }
}

class IMAXMovie extends Movie {
    public IMAXMovie(String title) {
        this.title = title;
        this.type = "IMAX";
    }
}

abstract class MovieFactory {
    public abstract Movie createMovie(String title);
}

class RegularMovieFactory extends MovieFactory {
    public Movie createMovie(String title) {
        return new RegularMovie(title);
    }
}

class IMAXMovieFactory extends MovieFactory {
    public Movie createMovie(String title) {
        return new IMAXMovie(title);
    }
}
