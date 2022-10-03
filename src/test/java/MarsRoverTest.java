import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;

class MarsRoverTest {
    @ExtendWith(MockitoExtension.class)

    @Mock RoverDriver roverDriver;

    @Test
    void foo() {
        MarsRover marsRover = new MarsRover(roverDriver);
        String commands = "L";
        marsRover.execute(commands);

        verify(roverDriver).instruct(commands);
    }

}