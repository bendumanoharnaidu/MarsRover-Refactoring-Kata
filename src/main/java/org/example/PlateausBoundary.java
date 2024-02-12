package org.example;

public class PlateausBoundary {
    private final int xMax;
    private final int yMax;

    public PlateausBoundary(int xMax, int yMax) {
        this.xMax = xMax;
        this.yMax = yMax;
    }

    public boolean isWithinBoundary(Coordinate coordinate) {
        return coordinate.getXCoordinate() >= 0 && coordinate.getXCoordinate() <= xMax && coordinate.getYCoordinate() >= 0 && coordinate.getYCoordinate() <= yMax;
    }
}
