package org.example;

public class Coordinate {
    private int x_coordinate;
    private int y_coordinate;
    public Coordinate(int x_coordinate, int y_coordinate) {
        this.x_coordinate = x_coordinate;
        this.y_coordinate = y_coordinate;
        if (x_coordinate < 0 || y_coordinate < 0) {
            throw new IllegalArgumentException("Invalid point");
        }
    }
    public void moveByOneStep(Direction direction) {
        switch (direction.currentDirection()) {
            case 'N':
                y_coordinate++;
                break;
            case 'S':
                y_coordinate--;
                break;
            case 'E':
                x_coordinate++;
                break;
            case 'W':
                x_coordinate--;
                break;
        }
    }
    public int getXCoordinate() {
        return x_coordinate;
    }
    public int getYCoordinate() {
        return y_coordinate;
    }

}
