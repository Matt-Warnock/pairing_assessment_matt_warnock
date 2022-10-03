public class MarsRover {
    private RoverDriver driver;

    public MarsRover(RoverDriver roverDriver) {
        driver = roverDriver;
    }

    public void execute(String commands) {
        driver.instruct(commands);
    }
}
