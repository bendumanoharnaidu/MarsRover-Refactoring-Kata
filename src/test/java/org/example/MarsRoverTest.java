package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

class MarsRoverTest {
    @Test
    public void acceptance_test_1() throws Exception {
        MarsRover marsRover = new MarsRover(1, 2, 'N', "LMLMLMLMM", new PlateausBoundary(5, 5));
        String newPosition = marsRover.move();
        assertEquals("1 3 N", newPosition);
    }
    @Test
    public void acceptance_test_2() throws Exception {
        MarsRover marsRover = new MarsRover(3, 3, 'E', "MMRMMRMRRM", new PlateausBoundary(5, 5));
        String newPosition = marsRover.move();

        assertEquals("5 1 E", newPosition);
    }
    @Test
    public void acceptance_test_3() throws Exception {
        MarsRover marsRover = new MarsRover(0, 0, 'N', "MMMMMMMMMMMMMMMMMMMMMMMM", new PlateausBoundary(24, 24));
        String newPosition = marsRover.move();

        assertEquals("0 24 N", newPosition);
    }
    @Test
    public void testWithNegativeX() {
        try {
            MarsRover marsRover = new MarsRover(-1, 2, 'N', "LMLMLMLMM", new PlateausBoundary(5, 5));
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid point", e.getMessage());
        }
    }
    @Test
    public void testWithNegativeY() {
        try {
            MarsRover marsRover = new MarsRover(1, -2, 'N', "LMLMLMLMM", new PlateausBoundary(5, 5));
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid point", e.getMessage());
        }
    }
    @Test
    public void acceptance_test_1_ForBoundary() throws Exception {
        MarsRover marsRover = new MarsRover(0, 0, 'N', "MMMRMMRMMRMM", new PlateausBoundary(5, 5));
        String newPosition = marsRover.move();

        assertEquals("0 1 W", newPosition);
    }
    @Test
    public void acceptance_test_2_ForBoundary() throws Exception {
        MarsRover marsRover = new MarsRover(0, 0, 'N', "MMMMMMMMMMMMMMMMMMMMMMMM", new PlateausBoundary(5, 5));
        assertThrows(IllegalArgumentException.class, () -> marsRover.move());
    }
    @Test
    public void acceptance_test_3_ForBoundary() throws Exception {
        MarsRover marsRover = new MarsRover(6, 0, 'N', "MMMRL", new PlateausBoundary(5, 5));
        assertThrows(IllegalArgumentException.class, () -> marsRover.move());
    }

}