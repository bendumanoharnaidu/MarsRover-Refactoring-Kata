package org.example;

public class South implements Direction {
    @Override
    public char currentDirection() {
        return 'S';
    }

    @Override
    public Direction turnLeft() {
        return new East();
    }

    @Override
    public Direction turnRight() {
        return new West();
    }
}
