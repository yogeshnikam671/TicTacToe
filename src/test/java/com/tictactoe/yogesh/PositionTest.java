package com.tictactoe.yogesh;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.*;
import static org.junit.jupiter.api.Assertions.*;

class PositionTest {
    @Test
    void shouldBeAbleToReturnPositionObject() {
        Position position1 = new Position(0);

        Position position2 = Position.getPosition(0);

        assertEquals(position1 , position2);
    }

    @Test
    void shouldBeAbleToReturnTheCorrespondingListBasedOnPosition() {
        Position position = new Position(1);
        List<Integer> expectedList = new ArrayList<>(asList(0, 0));

        List<Integer> actualList = position.getXY();

        assertEquals(expectedList, actualList);
    }
}