package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlateausBoundaryTest {
    @Test
    public void testWithNegativeX() {
        try {
            PlateausBoundary plateausBoundary = new PlateausBoundary(-1, 2);
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid point", e.getMessage());
        }
    }
    @Test
    public void testWithNegativeY() {
        try {
            PlateausBoundary plateausBoundary = new PlateausBoundary(1, 2);
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid point", e.getMessage());
        }
    }
    @Test
    public void testWithXandY() {
        PlateausBoundary plateausBoundary = new PlateausBoundary(1, 2);
        Coordinate coordinate = new Coordinate(1, 2);
        assertTrue(plateausBoundary.isWithinBoundary(coordinate));
    }
    @Test
    public void testWithXandYOutsideBoundary() {
        PlateausBoundary plateausBoundary = new PlateausBoundary(1, 2);
        Coordinate coordinate = new Coordinate(2, 3);
        assertFalse(plateausBoundary.isWithinBoundary(coordinate));
    }
}