package com.tictactoe.yogesh;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;


class ReaderTest {
    @Test
    void shouldBeAbleToTakeInputFromUser() throws InvalidInputException {
        String Actual = "X";
        InputStream in = new ByteArrayInputStream(Actual.getBytes());
        System.setIn(in);

        Reader reader = new Reader();

        reader.inputValue();

        assertEquals("X", Actual);
    }

    @Test
    void shouldBeAbleThrowExceptionWhenInputIsNotValid() throws InvalidInputException {
        String Actual = "Yogesh";
        InputStream in = new ByteArrayInputStream(Actual.getBytes());
        System.setIn(in);

        Reader reader = new Reader();

        assertThrows(InvalidInputException.class, reader::inputValue);
    }

    @Test
    void shouldBeAbleToReturnTheInputtedString() throws InvalidInputException {
        String Actual = "X";
        InputStream in = new ByteArrayInputStream(Actual.getBytes());
        System.setIn(in);

        Reader reader = new Reader();

        String actual = reader.inputValue();

        assertEquals("X", actual);
    }
}