import java.util.Scanner;
class Main {
    public static void main(String[] args) {
    	int NthTerm, Number = 2, Counter = 1, Result = 1;
    	Scanner input = new Scanner(System.in);
        System.out.print("Enter the number upto which you want the series:");
    	NthTerm = input.nextInt();
    	System.out.print("The series upto " + NthTerm + " is");
    	for(Result = 1; Result <= NthTerm; )
    	{
    	  System.out.print(" " + Result);
    	  Result = 1;
    	  while(Counter <= Number)
    	  {
    	    Result = Result * Number;
    	    Counter++;
    	  }
    	  Number++;
    	  Counter = 1;
    	}
    	System.out.print(".");
  }
}