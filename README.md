Class: CinemaConfig
Pattern: Singleton
Description: Manages system configuration, ensuring only one instance exists for cinema settings.


Class: MovieFactory
Pattern: Factory Method
Description: Creates different movie types (e.g., Regular or IMAX).


Class: UIFactory
Pattern: Abstract Factory
Description: Generates UI components like buttons for different themes (Dark/Light).


Class: TicketBooking
Pattern: Builder
Description: Builds a ticket with customizable details (movie title, seat number, snack combo).


Class: StandardSchedule
Pattern: Prototype
Description: Clones movie schedules with different times but the same movie.
