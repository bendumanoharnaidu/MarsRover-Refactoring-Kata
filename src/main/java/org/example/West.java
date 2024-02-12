package org.example;

public class West implements Direction {
    @Override
    public char currentDirection() {
        return 'W';
    }

    @Override
    public Direction turnLeft() {
        return new South();
    }

    @Override
    public Direction turnRight() {
        return new North();
    }
}
