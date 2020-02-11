import com.tictactoe.yogesh.Grid;
import com.tictactoe.yogesh.Position;
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
        int index = 0;
        while (index < 3) {
            for (int i = 0; i < 3; i++) {
                expected += " " + "|";
            }

            expected += "\n________\n";
            index++;
        }
        assertEquals(expected, outContent.toString());
    }

    @Test
    void shouldBeAbleToReflectTheInputXTakenByUserInTheGrid() {
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Grid grid = new Grid();
        grid.fill("X", new Position(0, 0));

        grid.display();

        String expected = "";

        expected += "X| | |\n________\n";

        int index = 1;
        while (index < 3) {
            for (int i = 0; i < 3; i++) {
                expected += " " + "|";
            }

            expected += "\n________\n";
            index++;
        }
        assertEquals(expected, outContent.toString());
    }

    @Test
    void shouldBeAbleToReflectTheInputYTakenByUserInTheGrid() {
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Grid grid = new Grid();
        grid.fill("Y", new Position(0, 2));

        grid.display();

        String expected = "";

        expected += " | |Y|\n________\n";

        int index = 1;
        while (index < 3) {
            for (int i = 0; i < 3; i++) {
                expected += " " + "|";
            }

            expected += "\n________\n";
            index++;
        }
        assertEquals(expected, outContent.toString());
    }
}