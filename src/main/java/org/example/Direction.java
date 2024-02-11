package org.example;

public interface Direction {
    char currentDirection();
    Direction turnLeft();
    Direction turnRight();
    void moveForward(Point point);
}
