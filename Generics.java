package genlocal;
//print array 
public class TestGenerics4 {
  // Generic method to print elements of an array
  public static <E> void printArray(E[] elements) {
      for (E element : elements) {
          System.out.println(element);
      }
      System.out.println(); // Corrected syntax for println method
  }

  public static void main(String args[]) {
      Integer[] intArray = {10, 20, 30, 40, 50};
      Character[] charArray = {'J', 'A', 'V', 'A', 'T', 'P', 'O', 'T', 'N', 'T', '3'};

      System.out.println("Printing Integer Array");
      printArray(intArray);
      System.out.println("Printing Character Array");
      printArray(charArray);
  }
}
//example
import java.util.*;

//Abstract class Shape
abstract class Shape {
  // Abstract method to draw the shape
  abstract void draw();
}

//Rectangle class extending Shape
class Rectangle extends Shape {
  // Implementation of draw method for Rectangle
  void draw() {
      System.out.println("Drawing rectangle");
  }
}

//Circle class extending Shape
class Circle extends Shape {
  // Implementation of draw method for Circle
  void draw() {
      System.out.println("Drawing circle");
  }
}

public class GenericTest {
  // Method that accepts a list of shapes and invokes the draw method on each shape
  public static void drawShapes(List<? extends Shape> lists) {
      for (Shape s : lists) {
          s.draw(); // Calling the draw method of Shape class using the child class instance
      }
  }

  public static void main(String args[]) {
      // Creating a list of rectangles
      List<Rectangle> list1 = new ArrayList<Rectangle>();
      list1.add(new Rectangle());

      // Creating a list of circles
      List<Circle> list2 = new ArrayList<Circle>();
      list2.add(new Circle());
      list2.add(new Circle());

      // Drawing shapes
      drawShapes(list1);
      drawShapes(list2);
  }
}
//upperbound 
public class UpperBoundWildcard 1
private static Double add(ArrayList<? extends Number > num) {
double sum=0.0;
for(Number n:num)
sum = sum+n.doubleValue);
}
return sum;
}
public static void main(String[] args) {
ArrayList< Integer> 11=new ArrayList<Integer>();
11.add (10);
11.add (20);
System.out.print/n("displaying the sum= "+add(|1));
ArrayList< Double> 12= new ArrayList<Double> ();
12.add (30.0);
12.add (40.0);
System.out.println("displaying the sum= "+add(12));
