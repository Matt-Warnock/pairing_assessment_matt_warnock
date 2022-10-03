import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;

class MarsRoverTest {
    @ExtendWith(MockitoExtension.class)

    @Mock RoverDriver roverDriver;

    @Test
    void passes_the_commands_to_driver() {
        String defaultPosition = "0:0:N";
        String position = "0:0:W";
        String commands = "L";

        given(roverDriver.instruct(commands)).willReturn(position);

        MarsRover marsRover = new MarsRover(roverDriver, defaultPosition);
        String result = marsRover.execute(commands);

        verify(roverDriver).instruct(commands);
        assertEquals(position, result);
    }

}