import com.tictactoe.yogesh.Grid;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class GridTest {

    @Test
    void shouldBeAbleToDisplayTheGrid() {
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Grid grid = new Grid();

        grid.display();

        String expected = "";
        for(int i = 0; i < 3; i++){
            expected += "__|__|__\n";
        }
        assertEquals(expected, outContent.toString());
    }

}