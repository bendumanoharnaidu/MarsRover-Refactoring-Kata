package org.example;

public class Boundary {
    private final int x;
    private final int y;

    public Boundary(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean isWithinBoundary(Point point) {
        return point.getX() >= 0 && point.getX() <= x && point.getY() >= 0 && point.getY() <= y;
    }
}
