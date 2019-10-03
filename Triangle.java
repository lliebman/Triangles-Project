package pa_4;
import java.lang.Math;

public class Triangle
{
    final private Point vertexA;
    final private Point vertexB;
    final private Point vertexC;
            
    public Triangle(Point pointA, Point pointB, Point pointC)
    {
        vertexA = new Point(pointA);
        vertexB = new Point(pointB);
        vertexC = new Point(pointC);
    }

    
    public double getArea()
    {
        double area, a, b, c;
        a = (vertexA.getXCoordinate() * (vertexB.getYCoordinate() - vertexC.getYCoordinate()));
        b = (vertexB.getXCoordinate() * (vertexC.getYCoordinate() - vertexA.getYCoordinate()));
        c = (vertexC.getXCoordinate() * (vertexA.getYCoordinate() - vertexB.getYCoordinate()));
        area = Math.abs(((a + b + c)/2));
        return area;
    }
    
    public double getPerimeter()
    {
        double perimeter = (vertexA.distanceTo(vertexB) 
        + vertexB.distanceTo(vertexC)
        + vertexC.distanceTo(vertexA));
        return perimeter;
    }
    
        public boolean isTriangle()
    {
        double area = getArea();
        return area > 0 || area < 0;
    }
    
}

/**
 * Triangle class    
 * Design and implement a Triangle class containing three instances of a Point object.  
 * 
 * In addition to the usual standard methods, Triangle class should have a method to:
 * 1.   calculate the area, 
 * 2.   calculate perimeter (sum of the sides), 
 * 3.   check that the three points actually form a triangle, 
 * i.e., that they are not collinearImplement a TriangleExerciser class containing main 
 * should read three points from a file and calculate the area and the perimeter of the triangle. 
 *
 */