package com.tictactoe.yogesh;

import java.util.*;

import static java.util.Arrays.*;

public class Position {
    private int position;
    private HashMap<Integer, List<Integer>> positionsMap;

    public Position(int position){
        this.position = position;
        this.positionsMap = new HashMap<>();
        initializeHashMap();
    }

    public List<Integer> getXY(){
        return positionsMap.get(position);
    }

    private void initializeHashMap(){
        positionsMap.put(1 , new ArrayList<>(asList(0 , 0)));
        positionsMap.put(2 , new ArrayList<>(asList(0 , 1)));
        positionsMap.put(3 , new ArrayList<>(asList(0 , 2)));

        positionsMap.put(4 , new ArrayList<>(asList(1 , 0)));
        positionsMap.put(5 , new ArrayList<>(asList(1 , 1)));
        positionsMap.put(6 , new ArrayList<>(asList(1 , 2)));

        positionsMap.put(7 , new ArrayList<>(asList(2 , 0)));
        positionsMap.put(8 , new ArrayList<>(asList(2 , 1)));
        positionsMap.put(9 , new ArrayList<>(asList(2 , 2)));

    }

    public static Position getPosition(int position){
        return new Position(position);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position1 = (Position) o;
        return position == position1.position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(position);
    }
}
