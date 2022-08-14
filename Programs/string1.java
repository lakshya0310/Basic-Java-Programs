//a program to print the intials of the name
import java.util.*;
public class string1
{
  public static void main()
  { Scanner sc  = new Scanner(System.in);
      System.out.println("Enter a sentence");
      String s =sc.nextLine();
      s= s.trim();
      int c=0;
      if(s.length()==0)
      System.out.println("Empty Sentence");
      else
      {c=0;}
      for(int i=0; i<s.length() ; i++)
      { char ch = s.charAt(i);
          if(ch==' ')
          { c++;
            }
      }
      if(c + 1 == 3)
      { int x=s.indexOf(' ');
          int y = s.lastIndexOf(' ');
          System.out.println(s.charAt(0)+"."+s.charAt(x+1)+"."+s.charAt(y+1)+".");
        }
        else
        {System.out.println("Invalid Sentence");
        }
  }
}
