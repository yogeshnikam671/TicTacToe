package com.tictactoe.yogesh;

import java.util.Scanner;

public class Reader {
    Scanner scanner;

    Reader(){
        scanner = new Scanner(System.in);
    }

    public void input() {
        String inputValue = scanner.next();
    }
}
