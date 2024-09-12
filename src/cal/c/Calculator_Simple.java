package cal.c;
import java.util.Scanner;
class Calculator_Simple {

	public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int p = 1;
      System.out.print("Enter the A numbers :");
      double num1 = in.nextDouble();
      System.out.print("Enter the B numbers :");
      double num2 = in.nextDouble();
      System.out.println("Choose an Operation to Perform. eg.: +,-,*'/,^ :");
      char o = in.next().charAt(0);
      System.out.println("A Number =" + num1);
      System.out.println("B Number =" + num2);
      System.out.println("operator =" + o);
      System.out.println("Result :" + num1+ o +num2 + "=");
      if(o=='+')
      {
    	  System.out.println("num1-num 2");
      }
      else if(o=='-')
      {
    	  System.out.println("num1-num2");
      }
      else if(o=='*')
      {
    	  System.out.println("num 1*num2");
      }
      else if(o=='/')
      {
    	  System.out.println("num 1/num2");
      }
      else if(o=='^')
      {
    	  for(int i=1; i<=num2; i++) {
    		  p *=num1;
    	  }
    	  System.out.print(p);
	}
	}
}