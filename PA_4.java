package pa_4;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class PA_4
{

    public static void main(String[] args) throws FileNotFoundException
    {
        
        DecimalFormat formatter = new DecimalFormat(".##");
        Scanner keyboard = new Scanner(System.in);
        System.out.print("What is the name of your file? ");
        String filename = keyboard.nextLine();
        File file = new File(filename);
        if(!file.exists())
        {
            System.out.println("The file " + filename + " does not exist.");
            System.exit(0);
        }
        else
        {
            Point[] point = initializeTriangle(file);
            Triangle triangle = new Triangle(point[0], point[1], point[2]);  
            System.out.println("Let's see some info on your triangle:");
            System.out.println();
            System.out.println("These are the points of your triangle:");
            for (int index = 0; index < point.length; index++)
                {
                    System.out.println("Point " + (index + 1) + ": ");
                    System.out.println(point[index]);
                    System.out.println();
                }
            if (triangle.isTriangle() == true)
            {
                System.out.println("Your points do indeed create a triangle.");
                System.out.println("The perimeter is: " + formatter.format(triangle.getPerimeter()));
                System.out.println("The area is: " + triangle.getArea());
            }
            else
            {
                System.out.println("Your points do not make a triangle. You failed.");
            }
        }
        
    }
    
    private static Point[] initializeTriangle(File file) throws FileNotFoundException
    {
        final int NUM_POINTS = 3;
        
            Point[] point = new Point[NUM_POINTS];
            Scanner inputFile = new Scanner(file);
            
            double xCoordinate,
                yCoordinate;
            
            while(inputFile.hasNext())
            {
                for (int index = 0; index < point.length; index++)
                {
                    xCoordinate = inputFile.nextDouble();
                    yCoordinate = inputFile.nextDouble(); 
                    point[index] = new Point(xCoordinate, yCoordinate);
                }
            }
            inputFile.close();
            return point;
    }
    
}


/**
 * It should report an error whenever the three specified points do not form a triangle.
 */