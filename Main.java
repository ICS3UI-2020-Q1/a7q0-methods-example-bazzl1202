import java.util.Scanner;
/**
 *
 * @author 
 */
public class Main {

  // a method to calculate the area of a rectangle given the width and the length
  public static double areaOfRectangle( double width, double length){
    double area = width * length;
    return area;
  }

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create scanner for user input
    Scanner input = new Scanner(System.in);

    // using the method without a scanner
    double answer = areaOfRectangle(2.0,5.0);
    System.out.print(answer);

    // using the method with a scanner
    System.out.println("Please enter a width");
    double width = input.nextDouble();
    System.out.println("Please enter a length");
    double length = input.nextDouble();
    // calculate the area using the input
    double area = areaOfRectangle(width, length);
    
  }
}
