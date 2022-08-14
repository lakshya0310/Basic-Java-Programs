//A program to count the number of words in a sentence 
import java.util.*;
public class string2
{
   public static void main()
   { Scanner sc = new Scanner(System.in);
       System.out.println("Accept the sentence");
       String s= sc.nextLine();
       s=s.trim();
       if(s.length()==0)
       {System.out.println("Empty String");}
       else
       { int c=0;
           for(int i = 0;i<s.length();i++)
           { char ch = s.charAt(i);
               if(ch==' ')
               c++;
       }
    
    System.out.println("Total no. of words are "+(c+1));}
   }
}
