import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarsRoverFeature {
    @Test
    void foo() {
        String command = "M";
        String defaultPosition = "0:0:N";
        String expectedPosition = "0:1:N";
        RoverDriver roverDriver = new RoverDriver();
        MarsRover marsRover = new MarsRover(roverDriver, defaultPosition);

        String position = marsRover.execute(command);

        assertEquals(position, expectedPosition);
    }
}
