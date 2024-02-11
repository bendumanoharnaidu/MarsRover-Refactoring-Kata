package org.example;

public class North implements Direction {
    @Override
    public char currentDirection() {
        return 'N';
    }
    @Override
    public Direction turnLeft() {
        return new West();
    }
    @Override
    public Direction turnRight() {
        return new East();
    }
    @Override
    public void moveForward(Point point) {
        point.setY(point.getY() + 1);
    }
}
