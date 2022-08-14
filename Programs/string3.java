//a program to print the name as follows
// Sushant Shankar Bhat should be printed as 
// S.S.Bhat 
import java.util.*;
public class string3 
{ 
   public void main()
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
          String s1=s.substring(y+1);
          System.out.println(s.charAt(0)+"."+s.charAt(x+1)+"."+s1);
        }
        else
        {System.out.println("Invalid Sentence");
        }
        boolean r = isvowel.IsVowel('c');
        System.out.println(r);
  }
}
