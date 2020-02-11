package com.tictactoe.yogesh;

import java.util.Scanner;

public class Reader {
    Scanner scanner;

    Reader(){
        scanner = new Scanner(System.in);
    }

    public String input() throws InvalidInputException {
        String inputValue = scanner.next();
        if(!isValid(inputValue))
            throw new InvalidInputException();

        return inputValue;
    }

    private boolean isValid(String inputValue){
        if(inputValue.equals("X") || inputValue.equals("Y"))
            return true;
        return false;
    }
}
