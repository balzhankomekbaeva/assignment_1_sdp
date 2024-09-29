class CinemaConfig {
    private static CinemaConfig instance;
    private String cinemaName;
    private int numScreens;
    private String operatingHours;

    private CinemaConfig() { }

    public static synchronized CinemaConfig getInstance() {
        if (instance == null) {
            instance = new CinemaConfig();
        }
        return instance;
    }

    public void setCinemaName(String name) { this.cinemaName = name; }
    public String getCinemaName() { return this.cinemaName; }

    public void setNumScreens(int numScreens) { this.numScreens = numScreens; }
    public int getNumScreens() { return this.numScreens; }

    public void setOperatingHours(String hours) { this.operatingHours = hours; }
    public String getOperatingHours() { return this.operatingHours; }
}
