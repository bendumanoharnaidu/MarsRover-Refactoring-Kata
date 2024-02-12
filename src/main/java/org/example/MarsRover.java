package org.example;

public class MarsRover {
    private final PlateausBoundary plateausBoundary;
    private Coordinate coordinate;
    private Direction direction;
    private final String instructions;
    public MarsRover(int x_coordinate, int y_coordinate, char direction, String instructions, PlateausBoundary plateausBoundary) {
        this.plateausBoundary = plateausBoundary;
        this.coordinate = new Coordinate(x_coordinate, y_coordinate);
        this.direction = InitilizeDirection.setDirection(direction);
        this.instructions = instructions;
    }
    public String move() throws Exception{
        if (!plateausBoundary.isWithinBoundary(coordinate)) {
            throw new IllegalArgumentException("Invalid point");
        }
        for (int i= 0; i < instructions.length(); i++) {
            char instruction = instructions.charAt(i);
            if (instruction == 'L') {
                direction = direction.turnLeft();
            }
            else if (instruction == 'R') {
                direction = direction.turnRight();
            }
            else if (instruction == 'M') {
                coordinate.moveByOneStep(direction);
                if (!plateausBoundary.isWithinBoundary(coordinate)) {
                    throw new IllegalArgumentException("Invalid point");
                }
            }
        }
        return coordinate.getXCoordinate() + " " + coordinate.getYCoordinate() + " " + direction.currentDirection();

    }

}
