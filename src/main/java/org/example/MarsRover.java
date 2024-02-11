package org.example;

public class MarsRover {
    private final Boundary boundary;
    private Point point;
    private Direction direction;
    private String instructions;
    public MarsRover(int x, int y, char direction, String instructions, Boundary boundary) {
        this.boundary = boundary;
        this.point = new Point(x, y);
        this.direction = InitilizeDirection.setDirection(direction);
        this.instructions = instructions;
    }
    public String move() throws Exception{
        if (!boundary.isWithinBoundary(point)) {
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
                direction.moveForward(point);
                if (!boundary.isWithinBoundary(point)) {
                    throw new IllegalArgumentException("Invalid point");
                }
            }
        }
        return point.getX() + " " + point.getY() + " " + direction.currentDirection();

    }

}
