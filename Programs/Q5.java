import java.util.*;
 public class Q5    //start of class
{ public static void main() //start of main method
    { Scanner sc = new Scanner(System.in);
        System.out.println("1. To display  the FIBONACCI series");
        System.out.println("2. To display whether a given number is a SPY NUMBER or not.");
        System.out.println("3. To print the sum of the given series: (S = a/2 + a/5 + a/8 + a/11+ ……….. + a/20.)");
        System.out.println("4. To generate the series: (1, 11, 111, 1111 …… n terms)");
        System.out.println("5. To display the product of the successor even digits of the number entered ");
        System.out.println("Enter Your Choice : ");
        int ch = sc.nextInt();
        switch(ch) {
        case 1 :
        System.out.println("Enter the value of n ");
        int n = sc.nextInt();
        int a = 0 , b=1, c , i ;
        System.out.print(b+" ");
        for(i = 1 ; i<=n ; i++)
        { c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
            }
            break;
        case 2 :    
        System.out.println("Enter a number ");
        int num = sc.nextInt();
        int f = num, s = 0 , m = 1 , d;
        do{ d=f%10;
            s=s+d;
            m=m*d;
            f=f/10;
        }while(f!=0);
        if(s==m)
        {System.out.println(num+" is a SPY number");}
        else{System.out.println(num+" is not a SPY number");}
        break;
        case 3 :
        System.out.println("Enter the value of a ");
        double a1 = sc.nextDouble();
        double s1=0;
        for(int j = 2;j<=20;j+=3)
        { s1 = s1 + (a1/j) ;
        }
        System.out.println("The sum of series is "+s1);
        break;
        case 4 :
        System.out.println("Enter the number of terms");
        int n1 =  sc.nextInt();
        for(int k=1; k<=n1 ; k++)
        {for(int l=1 ; l<=k ; l++)
            {System.out.print("1");}
        System.out.println(" ");}
        break;
        case 5 :
        System.out.println("Enter a number");
        int n2 = sc.nextInt();
        int o = n2 , d1 , s2 = 1 ; 
        while(o!=0)
        {
            d1=o%10;
            if(d1%2==0)
            { int d2 = d1 + 1;
               s2=s2*d2; 
            }
            o = o/10;
          }
        System.out.println("The product of sucessors of even digits of number given is "+s2);
        break;
        default :
        System.out.println("Invalid Choice");
    }
    }  //end of main method
 }  //end of class
