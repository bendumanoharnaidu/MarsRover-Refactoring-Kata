package org.example;

public class InitilizeDirection {
    public static Direction setDirection(char direction) {
        if (direction == 'N') {
            return new North();
        } else if (direction == 'S') {
            return new South();
        } else if (direction == 'E') {
            return new East();
        } else if (direction == 'W') {
            return new West();
        } else {
            throw new IllegalArgumentException("Invalid direction");
        }
    }
}
