import java.util.Scanner;

public class excercise1  {
//  funtion to know which is the largest number
    public static void main(String[] args){
      Scanner scanner = new Scanner(System.in); // class to obtain the data entered by the user
      int[] numbers = new int[5]; // create array with  the numbers to be compared
      int max = numbers[0]; // is initialize with the first data in the array
       
      System.out.println("Ingresa 5 numeros:");
      // Loop to cicle through the list and compare each of the numbers
      for(int i = 0; i < numbers.length; i++){
        numbers[i]= scanner.nextInt();
        max = max ^ ((max ^ numbers[i]) & -(max < numbers[i] ? 1 : 0)); // comparition with bit-by-bit operators
      }
      scanner.close(); // Scanner closure to prevent resource leakage
      System.out.print(" El numero mayor es " +max);
    }
}