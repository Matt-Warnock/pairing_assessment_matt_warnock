public class MarsRover {
    private RoverDriver driver;
    private String position;

    public MarsRover(RoverDriver roverDriver, String defaultPosition) {
        this.driver = roverDriver;
        this.position = defaultPosition;
    }

    public String execute(String commands) {
        this.position = driver.instruct(commands);
        return this.position;
    }
}
