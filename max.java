import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int[] Number;
    int Counter, Maximum;
    Number = new int[10];
    Scanner input = new Scanner(System.in);
    System.out.print("To find the maximum of sandeep numbers, enter the first number:");
  	Number[0] = input.nextInt();
  	for(Counter = 1; Counter <= 9; Counter++)
  	{
      System.out.print("Enter the next number:");
      Number[Counter] = input.nextInt();
    }
    Maximum = Number[1];
    for (Counter = 0; Counter < 10; Counter++){
      if (Maximum < Number[Counter])
        Maximum = Number[Counter];
      }
      System.out.print( Maximum + " is maximum among 10 numbers.");
    }  
    
}
