package pa_4;
import java.util.Scanner;
import java.lang.Math;

public class Point
{
    Scanner keyboard = new Scanner(System.in);
    private final double xCoordinate,
                yCoordinate;

    public Point(double xCoor, double yCoor)
    {
        xCoordinate = xCoor;
        yCoordinate = yCoor;
    }

    public Point()
    {
        xCoordinate = 0;
        yCoordinate = 0;
    }
    
    public Point(Point object2)
    {
        xCoordinate = object2.xCoordinate;
        yCoordinate = object2.yCoordinate;
    }


    public double getXCoordinate()
    {
        return xCoordinate;         
    }

    public double getYCoordinate()
    {
       return yCoordinate;  
    }
    
    public void setXCoordinate(double x)
    {
        x = xCoordinate;         
    }

    public void setYCoordinate(double y)
    {
       y = yCoordinate;  
    }
    
    public String toString()
    {
        String str = "\n X coordinate: " + xCoordinate 
                + "\n Y coordniate: " + yCoordinate;
        return str;
    }
    
    public double distanceTo(Point other)
    {
        try
        {
            double x = other.xCoordinate - this.xCoordinate;
            double y = other.yCoordinate - this.yCoordinate;
            double distance = Math.sqrt((x * x) + (y * y));
            return distance;
        }
        catch(Exception e)
        {
            System.out.println("A coordinate's value was null. Please check points");
            System.exit(0);
        }
        return 0;
    }
    
}


/**
 *  * Point class should have:
 * 1.   two private double members xCoordinate and yCoordinate  
 * 2.   the usual constructor(s)
 * 3.   the usual getters and setters
 * 4. toString and equals methods
 * 5. distanceTo method with the signature: public double distanceTo(Point other)
 * squr((x2−x1)2+(y2−y1))
 */