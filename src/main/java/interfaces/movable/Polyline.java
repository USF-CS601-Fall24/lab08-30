package interfaces.movable;

import java.util.ArrayList;
import java.util.List;

/** Represents a polyline that is defined by a list of 2d points.
 * Modify the class to implement Movable interface.
 * move(distance) should shift (translate) every point of the polyline by the given distance to the right and the same distance up */
public class Polyline  {
    // FILL IN CODE:
    // Implement the Movable interface. Provide implementation of the move method that shifts
    // x and y by the given distance.
     private List<Point> points;  // stores points in an ArrayList

    public Polyline() {
        points  = new ArrayList<>();
    }

    public void addPoint(int x, int y) {
        // Create a point with (x, y) coordinates and add it to the list of points
        // FILL IN CODE
    }

}
