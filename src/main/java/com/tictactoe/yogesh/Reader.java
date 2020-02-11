package com.tictactoe.yogesh;

import java.util.Scanner;

import static com.tictactoe.yogesh.Printer.*;

public class Reader {
    Scanner scanner;

    Reader(){
        scanner = new Scanner(System.in);
    }

    public String inputValue() throws InvalidInputException {
        String inputValue = scanner.next();
        if(!isValid(inputValue))
            throw new InvalidInputException();

        return inputValue;
    }


    public int inputPosition() throws InvalidInputException {
        int inputPosition;
        try{
            inputPosition = scanner.nextInt();}
        catch(NumberFormatException e){
            throw new InvalidInputException();
        }

        if(!isValid(inputPosition))
            throw new InvalidInputException();

        return inputPosition;
    }

    private boolean isValid(String inputValue){
        if(inputValue.equals("X") || inputValue.equals("O"))
            return true;
        return false;
    }

    private boolean isValid(int inputPosition){
        if(inputPosition < 1 || inputPosition > 9)
            return false;
        return true;
    }
}
