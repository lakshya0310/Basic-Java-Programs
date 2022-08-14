 import java.util.*;
  public class q1
{ public void main() 
 { Scanner obj = new Scanner(System.in) ;
   double A[] = new double[10] ;
   System.out.println("Enter 10 decimal numbers...");
  for(int i = 0 ; i < A.length ; i++)
   {  System.out.println("Enter number at position...."+(i+1));
    A[i]=obj.nextDouble();
     
    }
    int B[] = new int[A.length]; 
    for(int i = 0 ; i < A.length ; i++)
    { B[i]=(int)A[i];
   }
   System.out.println("Array A"+"\t"+"Array B");
  for(int i = 0 ; i < A.length ; i++)
   {  System.out.print(A[i]+"\t"+B[i]);
       System.out.println();
    }
}
}
