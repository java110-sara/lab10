//name: Sara Russert
//date: 1/21/24
//file: DrawPatterns.java

//import statement for Scanner class
import java.util.Scanner;

public class DrawPatterns {
   public static void main(String[] args) {
   
      Scanner keyboard = new Scanner(System.in);
      String shape = "";
      char symbol;
      int size = 0;
      
      System.out.println("Hello! You can draw a triange or a rectangle.");
      
      // prompt user for shape
      do {
      System.out.print("Type T for triangle or R for rectangle:  ");
      shape = keyboard.nextLine();
      } while (shape.toUpperCase().charAt(0) != 'T' && shape.toUpperCase().charAt(0) != 'R');
      
      // set the shape to the correct word for nice printing
      if (shape.toUpperCase().charAt(0) == 'T') 
         shape = "Triangle";
      else 
         shape = "Rectangle";
      
      
      // prompt user for symbol
      System.out.print("What character would you like to use to draw your shape?  ");
      symbol = keyboard.nextLine().charAt(0);
      
      // prompt user for rows
      do {
      System.out.print("Enter a number 3 or greater to choose the size of your shape:  ");
      size = keyboard.nextInt();
      } while (size < 3);
      
      // Summary for user
      System.out.println("Alright, I will draw you a " + shape + " out of " + symbol + " with a matrix by " + size + ".");
      
      // Print shape
      for (int i = 0; i < size; i++) {
         for (int j = 0; j < size; j++) {
            if (shape == "Triangle") {
               if (j <= i)
                  System.out.print(symbol + " ");
            } else
                System.out.print(symbol + " ");
         }
         
         System.out.println();
      }
      
      System.out.println("Your shape looks great!");
      System.exit(0);
      
   }
}