package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoordinateTest {
    @Test
    public void moveByOneStepNorth() {
        Coordinate coordinate = new Coordinate(1, 2);
        Direction direction;
        direction = InitilizeDirection.setDirection('N');
        coordinate.moveByOneStep(direction);
        assertEquals(3, coordinate.getYCoordinate());
    }
    @Test
    public void moveByOneStepForSouth() {
        Coordinate coordinate = new Coordinate(1, 2);
        Direction direction;
        direction = InitilizeDirection.setDirection('S');
        coordinate.moveByOneStep(direction);
        assertEquals(1, coordinate.getYCoordinate());
    }
    @Test
    public void moveByOneStepForEast() {
        Coordinate coordinate = new Coordinate(1, 2);
        Direction direction;
        direction = InitilizeDirection.setDirection('E');
        coordinate.moveByOneStep(direction);
        assertEquals(2, coordinate.getXCoordinate());
    }
    @Test
    public void moveByOneStepForWest() {
        Coordinate coordinate = new Coordinate(1, 2);
        Direction direction;
        direction = InitilizeDirection.setDirection('W');
        coordinate.moveByOneStep(direction);
        assertEquals(0, coordinate.getXCoordinate());
    }
    @Test
    void x() {
        Coordinate coordinate = new Coordinate(1, 2);
        assertEquals(1, coordinate.getXCoordinate());
    }

    @Test
    void y() {
        Coordinate coordinate = new Coordinate(1, 2);
        assertEquals(2, coordinate.getYCoordinate());
    }

}