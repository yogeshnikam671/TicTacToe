package com.tictactoe.yogesh;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;


class ReaderTest {
    @Test
    void shouldBeAbleToTakeInputFromUser() {
        String Actual = "Yogesh";
        InputStream in = new ByteArrayInputStream(Actual.getBytes());
        System.setIn(in);

        Reader reader = new Reader();

        reader.input();

        assertEquals("Yogesh", Actual);
    }
}