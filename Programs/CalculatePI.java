import java.util.*;
public class CalculatePI
{
   public static void main()
   { Scanner input = new Scanner(System.in);
     System.out.println("Enter the limit of value of i");
     double i = input.nextDouble();
     double s = 0;
     for(double j=1;j<=i ; j++)
     { if(j%2==0)
         { s += -1/(2*j - 1); 
            }
            else{ s += 1/(2*j - 1);
            }
            }
      double pi = 4*s;
      System.out.println(pi);
        }
}
