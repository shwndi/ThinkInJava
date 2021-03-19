package com.company.chapnineteen;

/**
 * @author czy
 * @date 2021/3/15
 */
public enum SpaceShip {
    SCOUT,CARGO,TRANSPORT,CRUISER,BATTLESHIP,MOTHERSHIP;

    @Override
    public String toString() {
        String id = name();
        String substring = id.substring(1);
        String lowerCase = substring.toLowerCase();
        return id.charAt(0)+lowerCase;
    }

    public static void main(String[] args) {
        for (SpaceShip value : values()) {
            System.out.println(value);
        }
    }
}
