package com.tictactoe.yogesh;

import static com.tictactoe.yogesh.Printer.*;

public class Grid {
    int size;

    public Grid(){
        size = 3;
    }

    public void display() {
        String grid = "";

        for(int i = 0; i < size; i++){
            grid += "  |  |  \n________\n";
        }

        print(grid);
    }
}
