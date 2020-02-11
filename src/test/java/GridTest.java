import com.tictactoe.yogesh.Grid;
import com.tictactoe.yogesh.Reader;
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
            expected += "  |  |  \n________\n";
        }
        assertEquals(expected, outContent.toString());
    }

}