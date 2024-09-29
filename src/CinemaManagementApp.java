public class CinemaManagementApp {
    public static void main(String[] args) {
        // Singleton usage
        CinemaConfig config = CinemaConfig.getInstance();
        config.setCinemaName("Starlight Cinemas");
        config.setNumScreens(5);
        config.setOperatingHours("10:00 AM - 11:00 PM");
        System.out.println("Cinema Name: " + config.getCinemaName());

        // Factory Method usage
        MovieFactory regularFactory = new RegularMovieFactory();
        Movie movie = regularFactory.createMovie("Inception");
        System.out.println("Movie: " + movie.getTitle() + ", Type: " + movie.getType());

        // Abstract Factory usage
        UIFactory uiFactory = new DarkThemeFactory();
        Button button = uiFactory.createButton();
        button.render();

        // Builder usage
        TicketBooking booking = new TicketBooking.TicketBookingBuilder()
                .setMovieTitle("Inception")
                .setSeatNumber("A1")
                .setSnackCombo("Popcorn and Soda")
                .build();
        System.out.println(booking.getDetails());

        // Prototype usage
        StandardSchedule template = new StandardSchedule();
        template.setTime("18:00");
        template.setMovie(movie);
        MovieSchedule eveningSchedule = template.clone();
        System.out.println(eveningSchedule.getDetails());

        System.out.println("Cinema Management System initialized.");
    }
}
