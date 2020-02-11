package com.tictactoe.yogesh;

import static com.tictactoe.yogesh.Printer.*;

public class Grid {
    private int size;
    private String[][] gridField;
    private String grid;

    public Grid() {
        size = 3;
        gridField = new String[3][3];
        initializeStrings();
    }

    public void display() {
        grid = "";

        int index = 0;
        while (index < 3) {
            for (int i = 0; i < size; i++) {
                grid += gridField[index][i] + "|";
            }

            grid += "\n________\n";
            index++;
        }
        print(grid);
    }

    public void fill(String input, Position position) {

        gridField[position.getX()][position.getY()] = input;
    }

    private void initializeStrings() {
        for (int j = 0; j < size; j++) {
            for (int i = 0; i < size; i++) {
                gridField[i][j] = " ";
            }
        }
    }

}
